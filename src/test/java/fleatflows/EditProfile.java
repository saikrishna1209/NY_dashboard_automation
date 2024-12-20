package fleatflows;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditProfile extends Login {

    @Test
    public void automateDashboardFeatures() {
        // Step 1: Login
        System.out.println("Initiating login process...");
        bapLoginFlow();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Step 2: Click on Fleet Owner
            WebElement fleetOwnerButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]"))); // Replace with actual XPath
            fleetOwnerButton.click();
            System.out.println("Clicked on Fleet Owner.");

            // Step 3: Click on View Profile
            WebElement viewProfileButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div/div/div[3]/div/div/div[2]/div[1]/div/div[3]"))); // Replace with actual XPath
            viewProfileButton.click();
            System.out.println("Clicked on View Profile.");

            // Step 4: Click on Edit
            WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/div/div[1]/div[2]/div[1]/div[2]"))); // Replace with actual XPath
            editButton.click();
            System.out.println("Clicked on Edit.");

            // Step 5: Update Name
            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/form/div/div[1]/div[1]/div/div[2]/input"))); // Replace with actual XPath
            nameField.click();

            // Clear the input field by sending multiple backspaces
            for (int i = 0; i < 20; i++) { // Adjust the number based on max characters
                nameField.sendKeys(Keys.BACK_SPACE);
            }
            Thread.sleep(500); // Allow UI to update
            nameField.sendKeys("Sai Krishna");
            System.out.println("Updated Name.");

            // Step 6: Update Email
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/form/div/div[1]/div[2]/div/div[2]/input"))); // Replace with actual XPath
            emailField.click();

            // Clear the input field by selecting all text and deleting
            emailField.sendKeys(Keys.COMMAND + "a"); // macOS-specific
            emailField.sendKeys(Keys.DELETE); // Clear the text
            Thread.sleep(500);
            emailField.sendKeys("sai@gmail.com");
            System.out.println("Updated Email.");

            // Step 7: Click on Update
            WebElement updateButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/form/div/div[2]/button[2]"))); // Replace with actual XPath
            updateButton.click();
            System.out.println("Clicked on Update.");

            // Validate the update success message or changes
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//xpath_of_success_message"))); // Replace with actual XPath
            System.out.println("Profile updated successfully: " + successMessage.getText());

        } catch (Exception e) {
            System.out.println("An error occurred during the Edit Profile flow: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            WebElement dashboardAction = driver.findElement(By.xpath("//xpath_of_dashboard_action")); // Replace with actual XPath
            dashboardAction.click();
            System.out.println("Dashboard action performed successfully!");
        } catch (Exception e) {
            System.out.println("Error automating dashboard: " + e.getMessage());
        }
    }
}

package fleatflows;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddDriver extends Login {

    @Test
    public void automateAddDriver() {
        // Step 1: Login
        System.out.println("Initiating login process...");
        bapLoginFlow();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Step 2: Click on Driver
            WebElement driverButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[3]/div"))); // Replace with actual XPath
            driverButton.click();
            System.out.println("Clicked on Driver.");

            // Step 3: Click on Add Driver
            WebElement addDriverButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div/div/div/div[3]/div[1]/div[2]/div/div[2]"))); // Replace with actual XPath
            addDriverButton.click();
            System.out.println("Clicked on Add Driver.");

            // Step 4: Enter Mobile Number
            WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/div/div[1]/div[2]/input"))); // Replace with actual XPath
            mobileNumberField.click();
            mobileNumberField.sendKeys("9876243210");
            System.out.println("Entered Mobile Number.");

            // Step 5: Click on Send OTP
            WebElement sendOtpButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath(" //*[@id=\"neglectTopbarTheme\"]/div[2]/div/div[2]/div"))); // Replace with actual XPath
            sendOtpButton.click();
            System.out.println("Clicked on Send OTP.");

            // Step 6: Enter OTP
            WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/div/div[2]/div/div[1]/input"))); // Replace with actual XPath
            otpField.click();
            otpField.sendKeys("7891");
            System.out.println("Entered OTP.");

            // Step 7: Click on Add Driver
            WebElement addDriverConfirmButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"neglectTopbarTheme\"]/div[2]/div/div[3]/div[2]/div"))); // Replace with actual XPath
            addDriverConfirmButton.click();
            System.out.println("Clicked on Add Driver.");

            // Validate the success message or driver added confirmation
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//xpath_of_success_message"))); // Replace with actual XPath
            System.out.println("Driver added successfully: " + successMessage.getText());

        } catch (Exception e) {
            System.out.println("An error occurred during the Add Driver flow: " + e.getMessage());
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

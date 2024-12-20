package fleatflows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import baseClass.BaseClass;

import java.time.Duration;

public class Login extends BaseClass {

    @Test
    public void bapLoginFlow() {
        // Test data
        String mobileNumber = "6378299817";
        String cityName = "NAMMA YATRI PARTNER:Bangalore";
        

        // Open the URL and maximize the window
        driver.get(urlfleat);
        driver.manage().window().maximize();

        System.out.println("Starting Fleat login flow...");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            
            WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class=\" w-full h-screen grid md:grid-cols-2 md:gap-[10%]\"]/descendant::div[11]/input")));
            System.out.println("Mobile number field located.");
            mobileNumberField.sendKeys(mobileNumber);

            
            WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class=\" w-full h-screen grid md:grid-cols-2 md:gap-[10%]\"]/descendant::button[01]")));
            System.out.println("City dropdown located.");
            cityDropdown.click();

           
            WebElement citySelect = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@data-text='" + cityName + "']")));
            citySelect.click();
            System.out.println("City selected: " + cityName);

            // Click send OTP
            WebElement otpButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class=\" w-full h-screen grid md:grid-cols-2 md:gap-[10%]\"]/descendant::div[12]/div")));
            otpButton.click();
            System.out.println("Send OTP clicked.");

            // Enter OTP
            WebElement otpField1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.xpath("//div[@class='flex items-center h-20 w-20 border-none'][1]/input")));
            	otpField1.sendKeys("7");

            	WebElement otpField2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.xpath("//div[@class='flex items-center h-20 w-20 border-none'][2]/input")));
            	otpField2.sendKeys("8");

            	WebElement otpField3 = wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.xpath("//div[@class='flex items-center h-20 w-20 border-none'][3]/input")));
            	otpField3.sendKeys("9");

            	WebElement otpField4 = wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.xpath("//div[@class='flex items-center h-20 w-20 border-none'][4]/input")));
            	otpField4.sendKeys("1");

            	System.out.println("OTP entered successfully.");

            // Click login
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class=\" w-full h-screen grid md:grid-cols-2 md:gap-[10%]\"]/descendant::button[03]")));
            loginButton.click();
            System.out.println("Login button clicked.");

            
            WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='dashboard']")));
            System.out.println("Login successful! Dashboard is displayed.");

        } catch (Exception e) {
            System.out.println("An error occurred during login: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

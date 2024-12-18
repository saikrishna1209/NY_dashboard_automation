package fleatflows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import baseClass.BaseClass;

public class Login extends BaseClass {

    @Test
    public void bapLoginFlow() throws InterruptedException {

        String mobileNumber = "6378299816";
        String cityName = "NAMMA YATRI PARTNER:Bangalore";
        String otp = "7891";

        // Launch URL
        driver.get(urlfleat);
        driver.manage().window().maximize();

        System.out.println("Starting Fleat login flow...");

        
        Thread.sleep(2000);
        if (!driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Failed to load the login page. Check the URL!");
            return;
        }

       
        WebElement mobileNumberField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/form/div[1]/div[2]/input"));
        mobileNumberField.sendKeys(mobileNumber);

        
        WebElement cityDropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/form/div[2]/div/div[2]/div/div[1]/div/button/div/div"));
        cityDropdown.click();
        Select citySelect = new Select(cityDropdown);
        citySelect.selectByVisibleText(cityName);

       
        WebElement otpButton = driver.findElement(By.xpath("//div[@class='text-sm text-']"));
        otpButton.click();

        
        Thread.sleep(3000);
        WebElement otpField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/form/div[3]/div[2]/div/div/div[1]/input"));
        otpField.sendKeys(otp);

       
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@aria-label,'login')]"));
        loginButton.click();

        System.out.println("Login successful!");
        Thread.sleep(3000);
    }
}

package fleatflows;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class SignUp extends BaseClass {

    @Test
    public void bapLoginFlow() throws InterruptedException {

        String mobileNumber = "8888888881";
        String cityName = "NAMMA YATRI PARTNER:Bangalore";

        // Launch URL
        driver.get(urlfleat);
        driver.manage().window().maximize();

        System.out.println("Starting Fleat login flow...");

        
//        Thread.sleep(2000);
        if (!driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Failed to load the login page. Check the URL!");
            return;
        }
        
        driver.findElement(By.xpath("//*[@id=\"email_\"]")).click();  
        Thread.sleep(2000);
        
        //Name
        driver.findElement(By.xpath("//input[@name ='name']")).sendKeys("testing");
        
        //MobileNumber
        driver.findElement(By.xpath("//div[@class=\"flex flex-row gap-40\"]/descendant::div[26]/input")).sendKeys(mobileNumber);
        
        //Email
        driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("testin@gmail.com");
        
        //select City
        driver.findElement(By.xpath("//div[@class=\"flex flex-row gap-40\"]/descendant::button[01]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-text='" + cityName + "']")).click();       
  
        //sign-up button
        driver.findElement(By.xpath("//button[@data-button-for=\"signUp\"]")).click();
        Thread.sleep(2000);

}
}
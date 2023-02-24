package class02.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/


        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("http://www.facebook.com");

        //maximize the screen
        driver.manage().window().maximize();

        //click on button
        driver.findElement(By.linkText("Create new account")).click();


        //wait 2 secs
        Thread.sleep(2000);

        //enter first name
        driver.findElement(By.name("firstname")).sendKeys("Mine");

        //enter last name
        driver.findElement(By.name("lastname")).sendKeys("McKenzie");

        //enter mobile number/email
        driver.findElement(By.name("reg_email__")).sendKeys("012938393");

        //new password
        driver.findElement(By.name("reg_passwd__")).sendKeys("testing");
        
        //click on sign up
        driver.findElement(By.name("websubmit")).click();//why is this not possible with linkText???


        Thread.sleep(2000);
        driver.quit();

    }
}

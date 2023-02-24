package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {

    public static void main(String[] args) {


        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("https://www.facebook.com/");

        //send in the username
        driver.findElement(By.id("email")).sendKeys("minenur");

        //send the password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");//case sensitive and copy sensitive

        //click on the button create new Account
        //driver.findElement(By.linkText("Create new account")).click();//copy text inside of <a>"Create new account"</a>

        //click on forgotten password
        driver.findElement(By.partialLinkText("password")).click();

        driver.quit();
    }
}
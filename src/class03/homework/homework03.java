package class03.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework03 {
    /*enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL*/
    public static void main(String[] args) {

        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        //maximize the screen
        driver.manage().window().maximize();


        //enter the message in the text box

        // driver.findElement(By.id("text"));
        //can do it also with xpath
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");


        //click on show message
        driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();


        //Enter value of a
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("15");


        //Enter value of B
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("35");


        //click on the button get total
        driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();


        //also please print the value of the attribute type of the button GET TOTAL
        WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        String buttonType = button.getAttribute("type");
        System.out.println("Button type is: " + buttonType);

    }
}

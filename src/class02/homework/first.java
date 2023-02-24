package class02.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args) {
        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
            fill out the form
            click on register
            close the browser*/

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");


        driver.findElement(By.name("username")).sendKeys("Tester");

        driver.findElement(By.className("input")).sendKeys("test");

        driver.findElement(By.linkText("Register")).click();

        driver.close();



    }
}

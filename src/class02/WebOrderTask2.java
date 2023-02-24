package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {

        /**
         * 1. launch the browser
         * 2. navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * 3. login
         * 4. get title and verify
         * 4. close the browser
         */

        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize the screen
        driver.manage().window().maximize();

        //enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //click on login button
        driver.findElement(By.className("button")).click();

        //verify that the title is "Web Orders"
        String title=driver.getTitle();
        //System.out.println(title); for knowing what the title is

        if (title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }

        //logout
        driver.findElement(By.linkText("Logout")).click();

        //close the browser
        driver.quit();


    }
}

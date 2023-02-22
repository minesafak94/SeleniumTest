package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //initiate the instance of Webdriver
        WebDriver driver=new ChromeDriver();

        //open google
        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        //navigate to facebook
        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(2000);

        //goes back to site before
        driver.navigate().back();

        Thread.sleep(2000);

        //goto facebook again, just go forward
        driver.navigate().forward();


        Thread.sleep(2000);


        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();//close whole browser

        // driver.close(); closes just the tab only

    }
}

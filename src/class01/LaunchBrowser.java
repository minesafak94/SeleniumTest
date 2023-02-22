package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //open the website google.com
        driver.get("https://www.facebook.com/");

        //get the current URL that is there in the browser
        String URL=driver.getCurrentUrl();
        //print out URL
        System.out.println(URL);

        //get the title of the webpage
        String title=driver.getTitle();
        //print the title of the webpage
        System.out.println("the title of the page is: "+title);

        //slow down for 3 seconds
        Thread.sleep(3000);
        //for seeing the website for 3 seconds this 3000 are millisec.

        driver.quit();
        //.close or .quit both are working

    }
}

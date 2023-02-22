package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //initialize instance variable
        WebDriver driver=new ChromeDriver();

        //goto google.com
        driver.get("https://google.com");

        //maximize the window
        driver.manage().window().maximize();

        //full screen
        driver.manage().window().fullscreen();

        //close
        driver.close();
    }
}

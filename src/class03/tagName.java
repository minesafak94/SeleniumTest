package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {


        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("https://www.amazon.com/");

        //maximize the screen
        driver.manage().window().maximize();

        //get all the links
        //we know that all links are in tag <a> which is also called anchor tag
        //lets use the locator By tagName for this purpose

        List <WebElement> tags=driver.findElements(By.tagName("a"));
        //to get elements of this list, you have to iterate
        for(WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);


        }





    }
}

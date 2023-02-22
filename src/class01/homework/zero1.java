package class01.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zero1 {
    /*
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amayzon.com");

        String title= driver.getTitle();

        String URL=driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(" ");
        System.out.println(URL);

        driver.close();
    }
}
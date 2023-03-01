package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize the screen
        driver.manage().window().maximize();

        //find the username
        //input[contains(@name,'username')] this is xpath in dom
        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

        //if u do this this way and want later to delete, you have to findelement again and write this below again!
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sjdklflsd");
        //this approach is better than the above
        //find password field
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("dkslkldfs2?");

        //clear the username text box
        username.clear();

       //get the text username which is beside the box
       WebElement usernameText= driver.findElement(By.xpath("//label[text()='Username:']"));
       System.out.println(usernameText.getText());

       //get the text password which is beside the password text box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText=passwordText.getText();//to store this u have to know what getText()'s return type is
        System.out.println(pasText);




    }
}

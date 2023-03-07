package class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
       /*HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check again if the checkbox is Selected or not
*/

        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        //maximize the screen
        driver.manage().window().maximize();

        //find button and click on it
        WebElement newBtn=driver.findElement(By.cssSelector("input[type='checkbox']"));

        //check if button is enabled to select
        boolean isEnabledButton=newBtn.isEnabled();
        System.out.println("The status of the box is: "+isEnabledButton);

        //if not selected click on it
        if(isEnabledButton){
            newBtn.click();
        }

        boolean isSel=newBtn.isSelected();
        System.out.println("The checkbox is selected: "+isSel);



    }
}

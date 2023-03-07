package class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class hw2 {
    public static void main(String[] args) {

        /*Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

        //tell your project where the Web Driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website google.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        //maximize the screen
        driver.manage().window().maximize();

        var checkBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (var button : checkBoxes) {
            String checkBox1 = button.getAttribute("value");
            if (checkBox1.equalsIgnoreCase("Option-3")) {
                button.click();

            }
        }
    }}
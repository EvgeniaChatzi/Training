package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/Evgenia.Chatzi/Selenium/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://learn.letskodeit.com/p/practice");

        driver.findElement(By.id("benzradio")).click();


        System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());



        driver.close();
        driver.quit();





    }
}

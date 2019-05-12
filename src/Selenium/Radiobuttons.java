package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {


    public static void main(String[] args) throws InterruptedException{


        System.setProperty("webdriver.chrome.driver", "/Users/Evgenia.Chatzi/Selenium/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://learn.letskodeit.com/p/practice");

        driver.findElement(By.id("benzradio")).click();

        Thread.sleep(1000);


       int size = driver.findElements(By.xpath("//input[@type='radio']")).size();
        Thread.sleep(1000);


       for (int i =0; i<size; i++) {

           driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
           Thread.sleep(1000);

       }
        Thread.sleep(1000);



        driver.close();
        driver.quit();





    }
}

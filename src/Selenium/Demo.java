package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        String baseUrl = "https://google.com";



        System.setProperty("webdriver.chrome.driver", "/Users/Evgenia.Chatzi/Selenium/selenium-java-3.141.59/chromedriver");
      WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());


    }
}



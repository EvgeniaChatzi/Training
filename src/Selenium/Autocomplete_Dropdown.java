package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_Dropdown {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/Evgenia.Chatzi/Selenium/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");


        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        Thread.sleep(2000);

        WebElement elem = driver.findElement(By.xpath("//input[@placeholder='From']"));
        elem.sendKeys("mum");
        Thread.sleep(2000);
        elem.sendKeys(Keys.ENTER);



        try{
            driver.switchTo().alert().dismiss();
        }catch(Exception e){
            System.out.println("unexpected pop up not present");
        }




       driver.close();
       driver.quit();


    }
}

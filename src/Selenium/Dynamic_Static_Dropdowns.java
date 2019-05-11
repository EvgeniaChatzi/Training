package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.font.MultipleMaster;

public class Dynamic_Static_Dropdowns {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "/Users/Evgenia.Chatzi/Selenium/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

//        int i = 1;
//        while (i < 5) {
//
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }

        for (int i =1; i < 5; i++) {

            driver.findElement(By.id("hrefIncAdt")).click();

        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[@class='mapbg']//a[@value='BLR']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
      
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@value='MAA'])[4]")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
        Thread.sleep(1000);

//       (//*[@value='MAA'])[4]
//        (//*[@value='BLR'])[2]



        driver.quit();
    }
}

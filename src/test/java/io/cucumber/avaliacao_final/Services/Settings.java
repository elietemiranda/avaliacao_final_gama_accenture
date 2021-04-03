package io.cucumber.avaliacao_final.Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {

    public static WebDriver browser;
    
    public static void open(String url){
      
      if(browser == null){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
      }
  
      browser.get(url);
      browser.manage().window().maximize();
    }

    public static void browser(String string) {
    }
    
}

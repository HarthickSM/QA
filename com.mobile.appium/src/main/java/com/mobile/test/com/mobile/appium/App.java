package com.mobile.test.com.mobile.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
      DesiredCapabilities dc= new DesiredCapabilities();
      dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
      dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
      
      dc.setCapability(MobileCapabilityType.DEVICE_NAME, "MP6H415D2326184");
    
      dc.setCapability("appPackage", "com.google.android.youtube");
      dc.setCapability("appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
     URL url = new URL("http://localhost:4723/wd/hub");
     AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
      
//      WebDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

      driver.quit();
      
      
      
    }
}

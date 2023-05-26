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
public class Calualctor 
{
    public static void main( String[] args ) throws MalformedURLException, InterruptedException
    {
    	// Create a DesiredCapabilities object
    	DesiredCapabilities dc = new DesiredCapabilities();

    	// Set the automation name capability
    	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

    	// Set the platform name capability
    	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

    	// Set the device name capability
    	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "MP6H415D2326184");

    	// Set the appPackage capability
    	dc.setCapability("appPackage", "com.google.android.calculator");

    	// Set the appActivity capability
    	dc.setCapability("appActivity", "com.android.calculator2.Calculator");

    	// Create an AndroidDriver object
    	URL url = new URL("http://localhost:4723/wd/hub");
    	AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
    	Thread.sleep(4000);
    	// Tap on the "1" button
    	driver.findElementById("com.google.android.calculator:id/digit_1").click();
Thread.sleep(2000);
    	// Tap on the "+" button
    	driver.findElementById("com.google.android.calculator:id/op_add").click();
    	Thread.sleep(2000);
    	// Tap on the "2" button
    	driver.findElementById("com.google.android.calculator:id/digit_2").click();
    	Thread.sleep(2000);
    	// Tap on the "1" button
    	driver.findElementById("com.google.android.calculator:id/digit_1").click();
Thread.sleep(2000);
    	// Tap on the "+" button
    	driver.findElementById("com.google.android.calculator:id/op_add").click();
    	Thread.sleep(2000);
    	// Tap on the "2" button
    	driver.findElementById("com.google.android.calculator:id/digit_2").click();
    	Thread.sleep(2000);
    	// Tap on the "=" button
    	driver.findElementById("com.google.android.calculator:id/eq").click();
    	Thread.sleep(9000);
    	// Get the text of the result label
    	String result = driver.findElementById("com.google.android.calculator:id/result").getText();
    	Thread.sleep(2000);
    	// Print the result
    	System.out.println(result);
    	Thread.sleep(5000);
    	// Quit the AndroidDriver object
    	driver.quit();

    
    }
}

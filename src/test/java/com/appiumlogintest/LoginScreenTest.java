package com.appiumlogintest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginScreenTest {
	
	public static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		testLogin();

	}
	
	public static void testLogin() {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","OPPO A15");
		cap.setCapability("udid","8DIJRW5PZPGY5TRK");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","10");
        cap.setCapability("appPackage","com.daraz.dflex.dev");
        cap.setCapability("appActivity","com.daraz.dflex.presentation.splash.SplashActivity");
        cap.setCapability("ignoreHiddenApiPolicyError",true);
        
        
        //hide keyboard
        
        cap.setCapability("unicodeKeyboard",true);
        cap.setCapability("resetKeyboard",true);
        
        
        try {
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url, cap);
			WebDriverWait wait = new WebDriverWait(driver, 12);
			
			
			//wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")));
			
			//select Language
			
			WebElement selectLanguage = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
			selectLanguage.click();
			
			

			//wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.daraz.dflex.dev:id/btnContinue")));

		
			
			//click continue button
			
			WebElement continueButton = driver.findElementById("com.daraz.dflex.dev:id/btnContinue");
			continueButton.click();
			
			
			//wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.daraz.dflex.dev:id/btnSkip")));
			
			//click on skip button
			
			WebElement skipButton = driver.findElementById("com.daraz.dflex.dev:id/btnSkip");
			skipButton.click();
			
			
			//wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.daraz.dflex.dev:id/etPhoneNumber")));
			
			//Input Phone Number
			
			WebElement inputPhoneNumberEditBox = driver.findElementById("com.daraz.dflex.dev:id/etPhoneNumber");
			//inputPhoneNumberEditBox.click();
			inputPhoneNumberEditBox.sendKeys("01912026219");
			
						
			//click on next button
			
			WebElement confirmButton =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
			confirmButton.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")));

			
			//input otp
			
			WebElement inputOTP = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText");
			inputOTP.click();
			inputOTP.sendKeys("1");
			inputOTP.sendKeys("2");
			inputOTP.sendKeys("3");
			inputOTP.sendKeys("4");
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

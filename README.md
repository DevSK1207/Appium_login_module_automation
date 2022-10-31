# Daraz_flexDev_login_module_automation

1. Install Java
2. Install home brew
3. Install Android Studio
4. Install IntelliJ IDEA
5. Download Appium https://appium.io/
6. Open Appium and click "START SERVER'
7. After thatserver is running

<img width="647" alt="Screen Shot 2022-10-31 at 12 52 24 PM" src="https://user-images.githubusercontent.com/32488952/198948767-3bbb1da6-a2a6-488d-802a-f4c3d254527a.png">

8. Click on search button, it will redirect into https://github.com/appium/appium-inspector page.

<img width="654" alt="Screen Shot 2022-10-31 at 12 53 23 PM" src="https://user-images.githubusercontent.com/32488952/198948898-a9938831-ebab-4e28-850c-667268d8fcca.png">
9. Go to instalation > release > 2022.9.1(latest one) > and download "Appium-Inspector-mac-2022.9.1.dmg" - https://github.com/appium/appium-inspector/releases/tag/v2022.9.1

<img width="921" alt="Screen Shot 2022-10-31 at 12 54 52 PM" src="https://user-images.githubusercontent.com/32488952/198949126-89caff66-5eb6-472d-ad45-3c36f154a7af.png">

CONNECT REAL ANDROID MOBILE DEVICE ON MAC




Follow the video step by step

5. https://www.youtube.com/watch?v=i1tQ1pjEFWw
6. https://www.youtube.com/watch?v=YecsinHl88A
7. https://www.youtube.com/watch?v=glPjT27xWpA
8. https://www.youtube.com/watch?v=N7vY3cPSo8g
9. https://www.youtube.com/watch?v=82KXSli1wPA


10. https://github.com/NibrazKhan/Amazon_Shopping_App_Automation



11. Connect real device for appium 
https://www.youtube.com/watch?v=BEF-d1xjV4Q&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=6


Setup APPIUM 
1. Install Appium-> follow this tutoriaL- https://www.youtube.com/watch?v=BEF-d1xjV4Q&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=6
2. Install Android studio
3. Set up environment in zsh file -
nano ~/.zshrc
Then add
export ANDROID_HOME=/Users/appnapws54/Library/Android/sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
export PATH=$ANDROID_HOME/tools/bin:$PATH
After that run 
─ source ~/.zshrc   


For device configuration 
https://www.youtube.com/watch?v=N7vY3cPSo8g&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=8

Set capacity like 


	public static void testLogin() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A15");
		cap.setCapability("udid", "8DIJRW5PZPGY5TRK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.daraz.dflex.dev");
		cap.setCapability("appActivity", "com.daraz.dflex.presentation.splash.SplashActivity");
		cap.setCapability("ignoreHiddenApiPolicyError", true);




Fixed error - for OPP0
I can't find Disable Permission Monitoring on my device Samsung A52

I have the same error, with my phone (Realme C3), I solved with the following way: First Enable Developer Option second step enable USB Debugging And very important Step: Step 3. Search for "Disable Permission Monitoring" and Enable it.



 
Stop appium server and execute below commands
adb uninstall io.appium.uiautomator2.server  adb uninstall io.appium.uiautomator2.server.test

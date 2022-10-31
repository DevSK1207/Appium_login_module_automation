# Appium_login_module_automation

1. Install Java
2. Install home brew
3. Install Android Studio
4. Install IntelliJ IDEA, Eclispse or and other IDEA
5. Download Appium https://appium.io/
6. Open Appium and click "START SERVER'
7. After thatserver is running

<img width="647" alt="Screen Shot 2022-10-31 at 12 52 24 PM" src="https://user-images.githubusercontent.com/32488952/198948767-3bbb1da6-a2a6-488d-802a-f4c3d254527a.png">

8. Click on search button, it will redirect into https://github.com/appium/appium-inspector page.

<img width="654" alt="Screen Shot 2022-10-31 at 12 53 23 PM" src="https://user-images.githubusercontent.com/32488952/198948898-a9938831-ebab-4e28-850c-667268d8fcca.png">
9. Go to instalation > release > 2022.9.1(latest one) > and download "Appium-Inspector-mac-2022.9.1.dmg" - https://github.com/appium/appium-inspector/releases/tag/v2022.9.1  , Check this tutorial -> https://www.youtube.com/watch?v=WZuS8qP45xY

<img width="921" alt="Screen Shot 2022-10-31 at 12 54 52 PM" src="https://user-images.githubusercontent.com/32488952/198949126-89caff66-5eb6-472d-ad45-3c36f154a7af.png">

CONNECT REAL ANDROID MOBILE DEVICE ON MAC

1. Java install on system. JAVA_HOME is set in enviroment variable command to Check Java version "java -version" , "javac -version"
2. Nees a Android Device and cable to connect. and can also download "Vysor" App from playstore to puts your Android on your desktop.
3. ADD ENVIROMENT VARIABLE
	* nano ~/.zshrc or "bashrc"
	* Then set 	export ANDROID_HOME=/Users/FOLDER_NAME/Library/Android/sdk
		   	export PATH=$ANDROID_HOME/platform-tools:$PATH
	 	   	export PATH=$ANDROID_HOME/tools:$PATH
			export PATH=$ANDROID_HOME/tools/bin:$PATH
	* After that run ─> source ~/.zshrc
	* NOTED THAT -> For find Android path can run - which Android And for JAVA_HOME run - which java

	<img width="474" alt="Screen Shot 2022-10-31 at 1 46 59 PM" src="https://user-images.githubusercontent.com/32488952/198957543-299f84a0-7ba2-4e48-88e9-541c81e93dcb.png">

4. Enable Phone DEVELOPER MODE and USB Debugging.
5. run -> adb devices. and check device ID is displaying

<img width="383" alt="Screen Shot 2022-10-31 at 1 54 18 PM" src="https://user-images.githubusercontent.com/32488952/198958714-1f0904ec-07f4-4dae-966f-5e5bcd9279e1.png">


Create Project ( Eclispse ) referance tutorial ->  https://www.youtube.com/watch?v=BEF-d1xjV4Q&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=6

1. Open Eclispse > click on file > select other > select Maven project. 
2. Go to pom.xml and add dependency (Maven / gradle)
	dependencies -  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
			https://mvnrepository.com/artifact/io.appium/java-client
			
Create Project ( Android Studio ) referance tutorial ->  https://www.youtube.com/watch?v=YecsinHl88A
1. Open Android Studio > create project
2. App > java > test > create file
3. Go to gradle and add dependency
	dependencies -  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
			https://mvnrepository.com/artifact/io.appium/java-client
			
Create Project ( IntelliJ ) referance tutorial -> https://www.youtube.com/watch?v=i1tQ1pjEFWw
			



Set capacity
1. Run Appium server GUI
2. Then run Appium Insector. Set Remote host - 127.0.0.1, Remote Path -  /wd/hub
3. Set Desired Capabilities
	public static void testLogin() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A15");
		cap.setCapability("udid", "8DIJRW5PZPGY5TRK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "Package_name");
		cap.setCapability("appActivity", "Activity_name");
		cap.setCapability("ignoreHiddenApiPolicyError", true);

*** How to find app activity and app package check that video - https://www.youtube.com/watch?v=N7vY3cPSo8g&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=9


*** Find face any error like "I can't find Disable Permission Monitoring on my device Samsung A52" Resolve this issue follow this step -> 

"I have the same error, with my phone (Realme C3), I solved with the following way: First Enable Developer Option second step enable USB Debugging And very important Step: Step 3. Search for "Disable Permission Monitoring" and Enable it."


Stop appium server and execute below commands
1. adb uninstall io.appium.uiautomator2.server  
2. adb uninstall io.appium.uiautomator2.server.test

Follow this github reppo - https://github.com/NibrazKhan/Amazon_Shopping_App_Automation






Follow the video step by step

Connect real device for appium 
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




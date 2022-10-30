# Daraz_flexDev_login_module_automation

1. Install Android Studio
2. Install Java
3. Install home brew

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







Fixed error - for OPP0
I can't find Disable Permission Monitoring on my device Samsung A52

I have the same error, with my phone (Realme C3), I solved with the following way: First Enable Developer Option second step enable USB Debugging And very important Step: Step 3. Search for "Disable Permission Monitoring" and Enable it.



 
Stop appium server and execute below commands
adb uninstall io.appium.uiautomator2.server  adb uninstall io.appium.uiautomator2.server.test

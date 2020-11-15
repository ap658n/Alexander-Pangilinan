Task
A list of ideas/bullet points you would test for. Focus on good coverage, rather than complete test
cases.
	-Validate that the user can add savings income for date today and check entry details is correct.
	-Validate that the user can add salary income for the past date and check entry details is correct.
	-Validate that the user can add deposits income for the future date and check entry details is correct.
	-Validate that the user can add bills expense for date today and check entry details is correct.
	-Validate that the user can add car expense for the past date and check entry details is correct.
	-Validate that the user can add clothes expense for the future date and check entry details is correct.
	-Validate day balance calculation.
	-Validate week balance calculation.
	-Validate month balance calculation.
	-Validate year balance calculation.
	-Validate all balance calculation.

A prioritization of such test cases according to their possible business impact in case of failure.
	-I prioritize most of the test cases that most of the user usually do. I created test cases that create income/expense entry on different dates and also I check if the new entry reflects under balance and amount label inside piechart.

Outline the possibilities of automating proposed test cases on different levels, together with a
short summary of pros and cons of each of them.
	-Can be automated 1 test class per test case
		Pros 
			*easy modify
			*no need to craete logical methods
			*straight to the point steps
			*no need to be driver by test data
		Cons
			*it consumes space in the local drive or it makes the project bulk in size.
			*not easy to maintain
	-Can be auotomated via hybrid driven approach
		Pros
			*easy to maintain
			*less consumption in local drive space
			*organized
			*easy to read by non technical person
		Cons
			*needs advance/expert technical skills in creating methods
			*needs advance/expert technical skills in creating page object models
	
Please automate proposed test cases.
A short explanation of the provided solution inside the README file.
	- I created a hybrid framework to easily cover most of the important test cases. This framework is a combination of data driven, page object model and modular driven framework. I only create 2 test class but it already covers 11 test case.
	

Framework Instruction
Java version 1.8
Intellij
Maven Project
Appium app
Android Studio
SDK Platform-Tools for Windows
Android (A20 samsung)


1. install java 1.8 - https://www.oracle.com/ph/java/technologies/javase/javase-jdk8-downloads.html#license-lightbox
2. install intellij CE - https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC 
3. install appium app - https://github.com/appium/appium-desktop/releases/latest
4. install android studio - https://developer.android.com/studio?gclid=Cj0KCQiAnb79BRDgARIsAOVbhRp3b_iqYj33WE-EjnJzq0HFBndVHHSZ6RW012v1NSfUeVOHKxRJ7CMaAm9nEALw_wcB&gclsrc=aw.ds
5. add SDK platform in the android studio folder - https://developer.android.com/studio/releases/platform-tools
6. connect android phone to windows pc via usb cord
7. open cmd >type "adb devices" > press enter and check if it shows result  > if no please contact me
8. if Yes > type "adb tcpip 5656" > press enter
9. Get mobile ip address and type to cmd "adb connect mobileIP:port" example "adb connect 193.166.0.1:5656" then press enter
10. open intellij > File > New > Project from existing source > select the pom.xml of the project > click OK 
11. Go to src > test > resources > config properties > config.properties open and change app_host with your mobile ip addrerss.
12. Go to src > test > Testsuite > run RegressionSuite.xml
13. If you encounter error please see the screenshot to this folder target > surefire-reports > failed_steps_screenshots

I hope you can follow my highlevel instruction, if in case you have difficulties please let me know so I can assist you. 

For the question about the approach and tech stack.
	-My approach on this automation is to make a very maintainable, easy to read and easy to understand scripts. That is why I created a hybrid framework that fits with the monefy application. And also I'd like to show my capacity as a test automation engineer and I can still add new technology on this framework to make it more useful to the team/company. 
	-The tech stack that I've used were Java, Seleniun, Appium, Testng, and Maven. I choose those tech stack because those are open source, it has lots of community support for free and also it benefits the company by not spending money to buy paid tools.
	
	
Let's make automation testing possible for any application. 

Thank you.. Happy Coding

 



This project uses Appium to automate mobile testing on Android devices. It is built using Java 15, TestNG, and Maven for dependency management. The tests are executed on the Chrome browser on Android emulators or devices.

Project Structure
POM File: Defines project dependencies and configurations.
TestBase: Sets up and tears down the Appium driver for each test method.
RegisterTest: Contains test cases for validating the registration functionality with valid and invalid inputs.
Page Objects: Separate classes (e.g., RegisterPage, HomePage, TestScenarioPage) that contain methods for interacting with various UI elements of the application under test.
Prerequisites
Java 15
Maven
Android SDK with an emulator or a connected Android device
Appium server installed and running
Chrome browser on the Android device/emulator
Appropriate ChromeDriver version installed (specified in capabilities)
Setup
1. Install Dependencies
Make sure you have Maven installed. To install the project dependencies, run:

mvn clean install
2. Appium Setup
Ensure Appium is installed globally. If not, install Appium using npm:

npm install -g appium
Start the Appium server before running the tests:

3. Configure ChromeDriver
Ensure the ChromeDriver executable matches the Chrome version on your device/emulator. Update the path to the chromedriver executable in the TestBase class:


caps.setCapability("chromedriverExecutable","/path/to/chromedriver");
Running Tests
1. Test Execution
To run the tests, you can use Maven commands. The tests are set up to run with TestNG. Execute the following command to run the tests:

bash
Copy code
mvn test
2. Specifying Browser and Data
TestNG allows specifying parameters and data providers for running tests. Ensure that the data providers (FileReader class) and parameter configurations are correctly set in the TestNG XML or directly within your test cases.

3. Test Configuration
You can configure which tests to run and their parameters by editing the testng.xml file located in the resources directory.

Key Dependencies
The project uses the following key dependencies:

Appium Java Client: Provides bindings for Java to interact with Appium.
TestNG: Framework for structuring and running test cases.
Log4j: Used for logging test execution details.
POI: For working with Excel files, if data-driven testing is involved.
Gson: For parsing JSON data files.
Test Workflow
Setup: Before each test, the setup method in TestBase initializes the Appium driver with desired capabilities and navigates to the test URL.
Test Execution: Tests are defined in the RegisterTest class, which uses page objects to interact with the application.
Teardown: After each test, the teardown method in TestBase quits the driver to close the session.
Troubleshooting
Appium Driver Issues: Ensure the Appium server is running and the device/emulator is correctly set up.
ChromeDriver Issues: Check that the chromedriverExecutable path matches the Chrome version on your device/emulator.
Timeout Errors: Increase the uiautomator2ServerLaunchTimeout if there are timeout issues when launching the server.
Contributing
Feel free to fork the repository and submit pull requests. For significant changes, please open an issue first to discuss what you would like to change.

License
This project is licensed under the MIT License - see the LICENSE file for details.


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.remote.RemoteWebDriver
import io.appium.java_client.windows.WindowsDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit
import java.lang.ProcessBuilder as ProcessBuilder
import java.lang.Process as Process
import java.nio.file.Paths as Paths
import java.lang.ProcessBuilder
import java.lang.Process



// Set the start-in directory where you want to launch the application
def startInDir = Paths.get("C:/Phoenix_RLIC_SP4_CHF2/runtime")

// Set the path to the application executable
def appPath = "C:/Phoenix_RLIC_SP4_CHF2/exe/ktonline.exe"

// Construct the command to launch the application from the start-in directory
//def command = ['cmd.exe', '/c', "cd $startInDir && $appPath"]

def command = ["cmd.exe", "/c", "cd", startInDir.toString(), "&&", appPath]

// Use ProcessBuilder to start the application
def process = new ProcessBuilder(command).start()

// Wait for the application to start up
Thread.sleep(50)

//Start the WinAppDriver using ProcessBuilder
ProcessBuilder processWinAppDriver = new ProcessBuilder('cmd.exe', '/c', 'C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe')

processWinAppDriver.start()

// Specify the capabilities for the WinAppDriver session
DesiredCapabilities capabilities = new DesiredCapabilities()
capabilities.setCapability("app", "Root")

WindowsDriver driver = new WindowsDriver(new URL("http://localhost:4723"), capabilities)

Windows.setText(findWindowsObject('Object Repository/AppLaunch_1/Edit'), 'UAT075')

Windows.setText(findWindowsObject('Object Repository/AppLaunch_1/Edit(1)'), 'test0075')

Windows.click(findWindowsObject('Object Repository/AppLaunch_1/Button'))

Windows.getText(findWindowsObject('Object Repository/AppLaunch_1/Text'))

Windows.click(findWindowsObject('Object Repository/AppLaunch_1/Button(1)'))

Windows.click(findWindowsObject('Object Repository/AppLaunch_1/Button(2)'))

driver.quit()
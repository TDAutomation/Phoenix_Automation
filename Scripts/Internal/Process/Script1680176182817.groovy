import java.net.URL
import java.util.concurrent.TimeUnit
import java.lang.ProcessBuilder as ProcessBuilder
import java.lang.Process as Process
import java.nio.file.Paths as Paths
import java.lang.ProcessBuilder
import java.lang.Process
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.remote.RemoteWebDriver
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject


// Set the start-in directory where you want to launch the application
def startInDir = Paths.get("C:/Phoenix_RLIC_SP4_CHF2/runtime")

// Set the path to the application executable
def appPath = "C:/Phoenix_RLIC_SP4_CHF2/exe/ktonline.exe"

// Construct the command to launch the application from the start-in directory
//def command = ['cmd.exe', '/c', "cd $startInDir && $appPath"]

def command = ["cmd.exe", "/c", "cd", startInDir.toString(), "&&", appPath]

// Use ProcessBuilder to start the application
def process = new ProcessBuilder(command).start()



Windows.click(findWindowsObject('AppLaunch_1/Edit'))

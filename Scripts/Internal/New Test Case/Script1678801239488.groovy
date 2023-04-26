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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Windows.startApplicationWithTitle('C:\\Users\\Public\\Desktop\\TTPRLIC_SP4 Mapping\\Phoenix.bat', 'Phoenix')

import java.lang.ProcessBuilder

// Set the paths to the batch files
def batchFile1 = 'C:\\Users\\Public\\Desktop\\TTPRLIC_SP4 Mapping\\Connection_TTPRLIC_SP4.bat'
def batchFile2 = 'C:\\Users\\Public\\Desktop\\TTPRLIC_SP4 Mapping\\TTPRLIC_Mapping.bat'
def desktopApp = 'P:\\exe\\ktonline.exe'

// Execute the first batch file
def pb1 = new ProcessBuilder(batchFile1)
def p1 = pb1.start()
p1.waitFor()

// Check if the first batch file ran successfully
if (p1.exitValue() != 0) {
	KeywordUtil.markFailed("Error: file1.bat did not run successfully")
	return
}

// Execute the second batch file
def pb2 = new ProcessBuilder(batchFile2)
def p2 = pb2.start()
p2.waitFor()

// Check if the second batch file ran successfully
if (p2.exitValue() != 0) {
	KeywordUtil.markFailed("Error: file2.bat did not run successfully")
	return
}

// Launch the desktop application
def pb3 = new ProcessBuilder(desktopApp)
pb3.start()


// Launch the desktop application on the remote machine
//Windows.startProcess('cmd.exe /c C:\\RemoteFolder\\PhoenixCoreBankingApplication\\PhoenixCoreBankingApplication.exe')
Windows.startApplication(batchFile2, FailureHandling.STOP_ON_FAILURE)
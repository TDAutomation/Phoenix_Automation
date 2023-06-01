import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'desktop.phoenix.loginktbatch'('CNVLBG', 'test1234')

Windows.click(findWindowsObject('OverNight_Process/OverNight_ToolBar_MenuItems/Start'))

WebUI.delay(5)

Windows.click(findWindowsObject('OverNight_Process/Button_YES'))

WebUI.delay(5)

Windows.click(findWindowsObject('OverNight_Process/Button_InputSummary_Close'))

WebUI.delay(5)

date = Windows.getText(findWindowsObject('OverNight_Process/TextBox_ProcessingDate'))

KeywordUtil.logInfo('Processing date is ' + date)

WebUI.delay(5)

Windows.click(findWindowsObject('OverNight_Process/TextButton_Start'))

WebUI.delay(15)

//message1=Windows.getText(findWindowsObject('OverNight_Process/TitleBar'))
//KeywordUtil.logInfo(message1)
Windows.click(findWindowsObject('OverNight_Process/Button_YES'))

WebUI.delay(15)

//message2=Windows.getText(findWindowsObject('OverNight_Process/TitleBar'))
//KeywordUtil.logInfo(message2)
'Click YES. If , is there any other users currently using the Nightly process'
try {
    if (Windows.verifyElementPresent(findWindowsObject('OverNight_Process/Button_YES'), 20)) {
        Windows.click(findWindowsObject('OverNight_Process/Button_YES'))
    }
}
catch (def delay) {
    if (org.openqa.selenium.NoSuchElementException) {
        WebUI.delay(5)
    }
} 

WebUI.delay(5)

//message3=Windows.getText(findWindowsObject('OverNight_Process/TitleBar'))
//KeywordUtil.logInfo(message3)
Windows.click(findWindowsObject('Button_OK'))

//Windows.click(findWindowsObject('Button_OK'))
WebUI.delay(30)

'Click on START to begin the Nightly run'
try {
    if (Windows.verifyElementPresent(findWindowsObject('OverNight_Process/Button_Start'), 40)) {
        WebUI.delay(10)

        Windows.click(findWindowsObject('OverNight_Process/Button_Start'))

        WebUI.delay(10)
    }
}
catch (def delay) {
    if (org.openqa.selenium.NoSuchElementException) {
        WebUI.delay(10)
    }
} 

//Windows.click(findWindowsObject('OverNight_Process/Button_Start'))
WebUI.delay(10)

String winAppPathpre = 'C://OVscripts//tt-pre-nightlydone.bat'

ProcessBuilder buildpre = new ProcessBuilder(winAppPathpre).inheritIO()

Process runpre = buildpre.start()

//WebUI.delay(6500)

'Click on OK to start PostNightly backup'
try {
    if (Windows.verifyElementPresent(findWindowsObject('Button_OK'), 5000)) {
        WebUI.delay(10)

        Windows.click(findWindowsObject('Button_OK'))

        WebUI.delay(10)
    }
}
catch (def delay) {
    if (org.openqa.selenium.NoSuchElementException) {
        WebUI.delay(10)
    }
} 

String winAppPathpost = 'C://OVscripts//tt-post-nightlydone.bat'

ProcessBuilder buildpost = new ProcessBuilder(winAppPathpost).inheritIO()

Process runpost = buildpost.start()

WebUI.delay(100)


'Click on OK to complete the Nightly run'

Windows.click(findWindowsObject('Button_OK'))

WebUI.delay(10)

Windows.click(findWindowsObject('OverNight_Process/Button_Close'))

WebUI.delay(10)


KeywordUtil.logInfo('Ran completed Successfully')

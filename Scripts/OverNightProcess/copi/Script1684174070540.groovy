import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

CustomKeywords.'desktop.phoenix.loginktbatch'('cnvlbg', 'test1234')

Windows.click(findWindowsObject('OverNight_Process/OverNight_ToolBar_MenuItems/Start'))

//text1=Windows.getText(findWindowsObject('OverNight_Process/GetText_OvernightStart_ PopUP'))
//KeywordUtil.logInfo(text1)
WebUI.delay(5)

Windows.click(findWindowsObject('OverNight_Process/Button_YES'))

WebUI.delay(5)

Windows.click(findWindowsObject('OverNight_Process/Button_InputSummary_Close'))

WebUI.delay(5)

//Windows.getText(findWindowsObject('OverNight_Process/TextBox_ProcessingDate'))
Windows.click(findWindowsObject('OverNight_Process/TextButton_Start'))

WebUI.delay(5)

//message1=Windows.getText(findWindowsObject('OverNight_Process/TitleBar'))
//KeywordUtil.logInfo(message1)
Windows.click(findWindowsObject('OverNight_Process/Button_YES'))

WebUI.delay(5)

//message2=Windows.getText(findWindowsObject('OverNight_Process/TitleBar'))
//KeywordUtil.logInfo(message2)
Windows.click(findWindowsObject('OverNight_Process/Button_YES'))

WebUI.delay(5)

//message3=Windows.getText(findWindowsObject('OverNight_Process/TitleBar'))
//KeywordUtil.logInfo(message3)
Windows.click(findWindowsObject('Button_OK'))

//Windows.click(findWindowsObject('Button_OK'))
WebUI.delay(5)

Windows.click(findWindowsObject('OverNight_Process/Button_Start'))

String winAppPath = 'C://OVscripts//tt-pre-nightlydone.bat'

ProcessBuilder build = new ProcessBuilder(winAppPath).inheritIO()

Process run = build.start()

Windows.waitForElementPresent(findWindowsObject('Button_OK'), 6000, FailureHandling.STOP_ON_FAILURE)
try {
	if (Windows.verifyElementPresent(findWindowsObject('Button_OK'), 50)) {
		Windows.click(findWindowsObject('Button_OK'))

		WebUI.delay(30)
	}
}
catch (def delay) {
	if (org.openqa.selenium.NoSuchWindowException) {
		CustomKeywords.'desktop.phoenix.loginktbatch2'('CNVLBG', 'test1234')
		
	  Windows.click(findWindowsObject('OverNight_Process/OverNight_ToolBar_MenuItems/ParellelProcessing'))

		WebUI.delay(5)

		
		Windows.click(findWindowsObject('OverNight_Process/Button_YES'))
		
		WebUI.delay(5)
		
		Windows.click(findWindowsObject('OverNight_Process/Button_YES'))

		WebUI.delay(10)

		Windows.click(findWindowsObject('OverNight_Process/Button_Start'))
		
		WebUI.delay(5)
		
		Windows.click(findWindowsObject('Button_OK'))
		
	}
}




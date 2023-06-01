import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Windows.startApplicationWithTitle('P:\\exe\\ktteller.exe', 'Phoenix')

Windows.setText(findWindowsObject('Object Repository/Text_UserID'), 'UAT040')

Windows.setText(findWindowsObject('Object Repository/Text_Password'), 'TEST0040')

Windows.click(findWindowsObject('Object Repository/Button_Logon'))

String loginVerification = Windows.getText(findWindowsObject('AppLaunch_1/LoginMessage'))

KeywordUtil.logInfo(loginVerification)

Windows.click(findWindowsObject('Object Repository/Button_OK'))

String homeBranch = Windows.getText(findWindowsObject('Teller/Home_Branch_Text'))

KeywordUtil.logInfo(homeBranch)

String workingBranch = Windows.getText(findWindowsObject('Teller/Working_Branch'))

KeywordUtil.logInfo(workingBranch)

if (homeBranch.equals('Arima Branch') && homeBranch.equals('Arima Branch')) {
    KeywordUtil.markPassed('Working Branch and Home Branch are selected correctly')
} else {
    WebUI.takeScreenshot()

    KeywordUtil.markFailed('Working Branch and Home Branch are not selected correctly')
}

Windows.click(findWindowsObject('Object Repository/Button_OK'))

Windows.switchToWindowTitle('Republic Bank Limited - Teller - UAT02 Commercial Teller 1 - 281')

Windows.click(findWindowsObject('Object Repository/Button_OK'))

WebUI.delay(5)

Windows.click(findWindowsObject('Teller/ToolBar_Menu/Post'))

WebUI.delay(15)

Windows.click(findWindowsObject('Teller/ToolBar_Menu/Log_Out'))


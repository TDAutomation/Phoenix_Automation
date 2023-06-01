package desktop

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class phoenix {

	@Keyword
	def loginktonline(String username, String password) {
		//Windows.startApplicationWithTitle('C:\\Phoenix_RLIC_SP4_CHF2\\exe\\ktonline.exe', 'phoenix')


		Windows.startApplicationWithTitle('P:\\exe\\ktonline.exe', 'Phoenix')
		Windows.setText(findWindowsObject('Object Repository/Text_UserID'), username)

		Windows.setText(findWindowsObject('Object Repository/Text_Password'), password)

		Windows.click(findWindowsObject('Object Repository/Button_Logon'))

		String loginVerification= Windows.getText(findWindowsObject('AppLaunch_1/LoginMessage'))

		KeywordUtil.logInfo(loginVerification)

		Windows.click(findWindowsObject('Object Repository/Button_OK'))

		Windows.click(findWindowsObject('Object Repository/Button_OK'))

		WebUI.delay(5)

		Windows.switchToWindowTitle('Republic Bank Limited - Arima Branch - Account Processing')

		WebUI.delay(5)

	}

	@Keyword
	def logout() {
		Windows.click(findWindowsObject('Button_LogOut'))
	}

	@Keyword
	def autoTransfer(String accounttype, String accountnumber) {
		Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_Search'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/RadioButton_AccountNumber'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_Dropdown'))

		Windows.click(findWindowsObject('AutoTransfer/AccountType_CHQ', [('txt') : accounttype]))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

		Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), accountnumber)

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

		Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_AutoTransfers'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Edit_Autotransfer'))

		//Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountStauts_Closed'))
		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Dropdown_SelectStatus'))

		Windows.click(findWindowsObject('AutoTransfer/AccountStauts_Closed'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Dropdown_ClosingReason'))

		Windows.click(findWindowsObject('AutoTransfer/ClosingReason_OtherReasons'))

		//Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_SAV'))
		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Save_Autotransfer'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Close_AutoTransfer'))

		//Windows.click(findWindowsObject('Notes/Close'))
		Windows.click(findWindowsObject('Notes/Close'))

		Windows.click(findWindowsObject('Notes/Close'))

		Windows.click(findWindowsObject('Notes/Close'))

		//Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountStauts_Closed'))
	}

	@Keyword
	def loginktbatch(String user, String pass) {

		String winAppPath = 'P://bat//Nightly.bat'

		ProcessBuilder build = new ProcessBuilder(winAppPath).inheritIO()

		Process run = build.start()

		WebUI.delay(5)

		Windows.startApplicationWithTitle('P:\\exe\\ktbatch.exe', 'Phoenix')

		Windows.setText(findWindowsObject('Object Repository/Text_UserID'), user)
		//cnvlbg
		Windows.setText(findWindowsObject('Object Repository/Text_Password'), pass)
		//test1234
		Windows.click(findWindowsObject('Object Repository/Button_Logon'))

		String loginVerification = Windows.getText(findWindowsObject('AppLaunch_1/LoginMessage'))

		KeywordUtil.logInfo(loginVerification)

		Windows.click(findWindowsObject('Object Repository/Button_OK'))

		Windows.click(findWindowsObject('Object Repository/Button_OK'))

		Windows.switchToWindowTitle('Republic Bank Limited - Nightly Processing')


	}


	@Keyword
	def loginktbatch2(String user, String pass) {

		String winAppPath = 'P://bat//Nightly.bat'

		ProcessBuilder build = new ProcessBuilder(winAppPath).inheritIO()

		Process run = build.start()

		WebUI.delay(5)

		Windows.startApplicationWithTitle('P:\\exe\\ktbatch.exe', 'Phoenix')

		Windows.setText(findWindowsObject('Object Repository/Text_UserID'), user)
		//cnvlbg
		Windows.setText(findWindowsObject('Object Repository/Text_Password'), pass)
		//test1234
		Windows.click(findWindowsObject('Object Repository/Button_Logon'))

		String loginVerification = Windows.getText(findWindowsObject('AppLaunch_1/LoginMessage'))

		KeywordUtil.logInfo(loginVerification)

		Windows.click(findWindowsObject('Object Repository/Button_OK'))

		Windows.click(findWindowsObject('Object Repository/Button_OK'))


		Windows.click(findWindowsObject('Object Repository/Button_OK'))

		Windows.switchToWindowTitle('Republic Bank Limited - Nightly Processing')


	}

	@Keyword
	def loginktTeller(String user, String pass) {
		Windows.startApplicationWithTitle('P:\\exe\\ktteller.exe', 'Phoenix')

		Windows.setText(findWindowsObject('Object Repository/Text_UserID'), user)

		Windows.setText(findWindowsObject('Object Repository/Text_Password'), pass)

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
	}
}
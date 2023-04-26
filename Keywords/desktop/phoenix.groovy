package desktop

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows




public class phoenix {

	@Keyword
	def loginbrowesr(String username, String password) {
		//Windows.startApplicationWithTitle('C:\\Phoenix_RLIC_SP4_CHF2\\exe\\ktonline.exe', 'phoenix')
		Windows.startApplicationWithTitle('P:\\exe\\ktonline.exe', 'Phoenix')
		Windows.setText(findWindowsObject('Object Repository/AutoTransfer/Text_UserID'), username)

		Windows.setText(findWindowsObject('Object Repository/AutoTransfer/Text_Password'), password)

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Logon'))

		String loginVerification= Windows.getText(findWindowsObject('AppLaunch_1/LoginMessage'))

		KeywordUtil.logInfo(loginVerification)

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_OK'))

		Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_OK'))

		Windows.switchToWindowTitle('Republic Bank Limited - Business Support Services - Account Processing')
	}

	@Keyword
	def logout() {
		Windows.click(findWindowsObject('Notes/Button_LogOut'))
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
}
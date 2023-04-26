import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//Windows.switchToWindowTitle('Republic Bank Limited - Business Support Services - Account Processing')
Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_Search'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/RadioButton_AccountNumber'))

//Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Dropdownlist'))
Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/AccountType_SAV'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), '040264603231')

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

Windows.click(findWindowsObject('StandardMessage/Close'))

accountNumber = Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

KeywordUtil.logInfo(accountNumber)

//Windows.click(findWindowsObject('StandardMessage/Button_LogOut'))
//Windows.click(findWindowsObject('StandardMessage/Button_LogOut'))
//Windows.click(findWindowsObject('AccountHistory/Button_Details'))
Windows.click(findWindowsObject('AccountHistory/Button_AccountHistory'))

//Windows.click(findWindowsObject('AutoTransfer/TooBar_Transactions'))
Windows.click(findWindowsObject('AutoTransfer/from_AccountINformation'))


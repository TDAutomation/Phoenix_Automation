import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.awt.*
import java.awt.event.*
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//CustomKeywords.'desktop.phoenix.loginbrowesr'('UAT075', 'test0075')
Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_Search'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/RadioButton_AccountNumber'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/AccountType_CHQ'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), accountNumber)

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

accountNumber1 = Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

KeywordUtil.logInfo(accountNumber1)

Windows.click(findWindowsObject('Button_Close'))

Windows.getText(findWindowsObject('StopCheques/Panel_WindowTitle'))

Windows.click(findWindowsObject('StopCheques/Button_Restrictions'))

text = Windows.getText(findWindowsObject('StopCheques/Panel_WindowTitle'))

KeywordUtil.logInfo(text)

if (text.contains(accountNumber)) {
    KeywordUtil.markPassed('The newly opened window belongs to the enter accountnumber')
} else {
    KeywordUtil.markFailed('The newly opened window not belongs to the enter accountnumber')
}

Windows.click(findWindowsObject('StopCheques/Button_EditRestrictions'))

text = Windows.getText(findWindowsObject('StopCheques/Panel_WindowTitle'))

KeywordUtil.logInfo(text)

if (text.contains(accountNumber)) {
    KeywordUtil.markPassed('The newly opened window belongs to the enter accountnumber')
} else {
    KeywordUtil.markFailed('The newly opened window not belongs to the enter accountnumber')
}

Date thisDate = new Date()

SimpleDateFormat dateform = new SimpleDateFormat('MM/dd/yyyy')

String systemDate = dateform.format(thisDate)

KeywordUtil.logInfo(systemDate)

Windows.click(findWindowsObject('StopCheques/TextBox_ExpiryDate'))

Windows.clearText(findWindowsObject('StopCheques/TextBox_ExpiryDate'))

Windows.setText(findWindowsObject('StopCheques/TextBox_ExpiryDate'), systemDate)

Windows.click(findWindowsObject('StopCheques/DropDown_Status'))

Windows.click(findWindowsObject('StopCheques/DropDown_Status_Closed'))

Windows.click(findWindowsObject('StopCheques/Button_Save'))

status = Windows.getText(findWindowsObject('StopCheques/DropDown_Status'))

KeywordUtil.logInfo(status)

if (status.equals('Closed')) {
    KeywordUtil.markPassed('New Restrictions has been created successfully')
} else {
    KeywordUtil.markFailed('Restrictions is not created')
}

Windows.click(findWindowsObject('StopCheques/Button_CloseRestrictions'))

Windows.click(findWindowsObject('StopCheques/Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

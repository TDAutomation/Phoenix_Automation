import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.awt.*
import java.awt.event.*
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')
Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_Search'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/RadioButton_AccountNumber'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/AccountType_CHQ'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), accountNumber)

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

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

Windows.click(findWindowsObject('StopCheques/Button_NewRestrictions'))

text = Windows.getText(findWindowsObject('StopCheques/Panel_WindowTitle'))

KeywordUtil.logInfo(text)

if (text.contains(accountNumber)) {
    KeywordUtil.markPassed('The newly opened window belongs to the enter accountnumber')
} else {
    KeywordUtil.markFailed('The newly opened window not belongs to the enter accountnumber')
}

Windows.click(findWindowsObject('StopCheques/DropDown_RestrictionsType'))

Windows.click(findWindowsObject('StopCheques/DropDown_RestrictionType_Stop'))

Windows.click(findWindowsObject('StopCheques/DropDown_HitOptions'))

///
Windows.click(findWindowsObject('StopCheques/DropDown_HitOptions_Both'))

Windows.click(findWindowsObject('StopCheques/TextBox_Amount'))

Windows.setText(findWindowsObject('StopCheques/TextBox_Amount'), '20')

WebUI.delay(5)

Robot r = new Robot()

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

Windows.click(findWindowsObject('StopCheques/TextBox_Description'))

Windows.setText(findWindowsObject('StopCheques/TextBox_Description'), 'stolen')

Windows.click(findWindowsObject('StopCheques/TextBox_Instructions'))

Windows.setText(findWindowsObject('StopCheques/TextBox_Instructions'), 'stop the cheque')

Windows.click(findWindowsObject('StopCheques/CheckBox_Charges'))

SimpleDateFormat dt = new SimpleDateFormat('MM/dd/yyyy')

Calendar cals = Calendar.getInstance()

cals.add(Calendar.MONTH, 2)

String dat = dt.format(cals.getTime())

KeywordUtil.logInfo(dat)

cals.add(Calendar.MONTH, 6)

String dat2 = dt.format(cals.getTime())

KeywordUtil.logInfo(dat2)

//String da=dat.split(" ")
Windows.click(findWindowsObject('StopCheques/TextBox_ChequeDate'))

Windows.setText(findWindowsObject('StopCheques/TextBox_ChequeDate'), '07/28/2023')

int ranNum = ((Math.random() + 13) as int)

String rn = Integer.toString(ranNum)

KeywordUtil.logInfo(rn)

int ranNum2 = ranNum + 6

String rn2 = Integer.toString(ranNum2)

KeywordUtil.logInfo(rn2)

Windows.click(findWindowsObject('StopCheques/TextBox_FromCheque'))

Windows.setText(findWindowsObject('StopCheques/TextBox_FromCheque'), rn)

Windows.click(findWindowsObject('StopCheques/TextBox_ToCheque'))

Windows.setText(findWindowsObject('StopCheques/TextBox_ToCheque'), rn2)

Windows.clearText(findWindowsObject('StopCheques/TextBox_EffectiveDate'))

Windows.click(findWindowsObject('StopCheques/TextBox_EffectiveDate'))

Windows.setText(findWindowsObject('StopCheques/TextBox_EffectiveDate'), dat)

Windows.clearText(findWindowsObject('StopCheques/TextBox_ExpiryDate'))

Windows.click(findWindowsObject('StopCheques/TextBox_ExpiryDate'))

Windows.setText(findWindowsObject('StopCheques/TextBox_ExpiryDate'), dat2)

Windows.click(findWindowsObject('StopCheques/Button_Save'))

status = Windows.getText(findWindowsObject('StopCheques/DropDown_Status'))

KeywordUtil.logInfo(status)

if (status.equals('Active')) {
    KeywordUtil.markPassed('New Restrictions has been created successfully')
} else {
    KeywordUtil.markFailed('Restrictions is not created')
}
WebUI.delay(5)

Windows.click(findWindowsObject('StopCheques/Button_CloseRestrictions'))
Windows.click(findWindowsObject('StopCheques/Button_Close'))

Windows.click(findWindowsObject('Button_Close'))


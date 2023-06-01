import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.*
import java.awt.event.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//CustomKeywords.'desktop.phoenix.loginktTeller'('UAT040', 'Test0040')
'clicking POST in Tool Bar Menu Bar'
Windows.click(findWindowsObject('Teller/ToolBar_Menu/Post'))

WebUI.delay(15)

'click on Account Type'
Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType'))

'select Account Type'
Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType_CHQ'))

Windows.click(findWindowsObject('Teller/Post/TextBox_AccountNumber'))

'enter Account Number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '830410240402')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

'enter Transaction Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '156')

WebUI.delay(5)

Robot r = new Robot()
'Customer Signature will gets opened'
WebUI.delay(5)

Windows.switchToApplication()

WebUI.delay(10)

'Closing Customer Signature Screen'
Windows.click(findWindowsObject('Teller/Post/Signature_Close'))

WebUI.delay(5)

'enter reference text'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Reference'), 'Order#23')

Windows.click(findWindowsObject('Teller/Post/TextBox_Amount2'))

'enter amount in Amount Field'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Amount2'), value)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)
r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'get value from Amount Field'
amount = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount2'))

KeywordUtil.logInfo(amount)

'get value from Cashout Field'
cashOut = Windows.getText(findWindowsObject('Teller/Post/TextBox_CashOUT2'))

KeywordUtil.logInfo(cashOut)

'verifying Amount and Cashout Value'
if (amount.equals(cashOut)) {
    KeywordUtil.markPassed('Value in Amount and CashOut are same' //
        )

		'click on POST'
    Windows.click(findWindowsObject('Teller/Post/Button_Post'))
} else {
    KeywordUtil.markFailed('count is wrong')
}

WebUI.delay(5)

'Currency Calcultor Windows get Opened'

Windows.click(findWindowsObject('Teller/Post/CashCalculator_1'))

'enter Currency count'
Windows.setText(findWindowsObject('Teller/Post/CashCalculator_1'), value)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'verifying Cash Out breakdown in Cash Calculator'
text = Windows.getText(findWindowsObject('Teller/Post/CashCalculator_CashDifference'))

KeywordUtil.logInfo(text)

if (text.contains('0.00')) {
    KeywordUtil.markPassed('currently count is matching')

	'click on OK'
    Windows.click(findWindowsObject('Teller/Post/CashCalculator_Button_OK'))
} else {
    KeywordUtil.markFailed('count is wrong')

    Windows.click(findWindowsObject('Teller/Post/CashCalculator_Button_OK'))
}

WebUI.delay(5)

//Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

WebUI.delay(5)


'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Close'))


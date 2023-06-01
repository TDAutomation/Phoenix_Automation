import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.*
import java.awt.event.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

CustomKeywords.'desktop.phoenix.loginktTeller'('UAT040', 'Test0040')

'clicking POST in Tool Bar Menu Bar'
Windows.click(findWindowsObject('Teller/ToolBar_Menu/Post'))

WebUI.delay(15)

Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType'))

Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType_SAV'))

Windows.click(findWindowsObject('Teller/Post/TextBox_AccountNumber'))

Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '260012278931')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '152')


WebUI.delay(5)

Windows.switchToApplication()

WebUI.delay(10)

'Closing Customer Signature Screen'
Windows.click(findWindowsObject('Teller/Post/Signature_Close'))

Robot r = new Robot()

WebUI.delay(10)

Windows.click(findWindowsObject('Teller/Post/TextBox_Amount2'))

Windows.setText(findWindowsObject('Teller/Post/TextBox_Amount2'), value)

WebUI.delay(5)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

amount = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount2'))

KeywordUtil.logInfo(amount)

cashOut = Windows.getText(findWindowsObject('Teller/Post/TextBox_CashOUT2'))

KeywordUtil.logInfo(cashOut)

'verifying Amount and Cashout Value'
if (amount.equals(cashOut)) {
    KeywordUtil.markPassed('Value in Amount and CashOut are same') //
    // Windows.click(findWindowsObject('Teller/Post/CashCalculator_Button_OK'))
} else {
    KeywordUtil.markFailed('count is wrong')
}

Windows.click(findWindowsObject('Teller/Post/Button_Post'))


Windows.click(findWindowsObject('Teller/Post/CashCalculator_1'))

Windows.setText(findWindowsObject('Teller/Post/CashCalculator_1'), '1')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'verifying Cash Out breakdown in Cash Calculator'

text = Windows.getText(findWindowsObject('Teller/Post/CashCalculator_CashDifference'))

KeywordUtil.logInfo(text)

if (text.contains('0.00')) {
	KeywordUtil.markPassed('currently count is matching')

	Windows.click(findWindowsObject('Teller/Post/CashCalculator_Button_OK'))
} else {
	KeywordUtil.markFailed('count is wrong')

	Windows.click(findWindowsObject('Teller/Post/CashCalculator_Button_OK'))
}

Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

WebUI.delay(5)

Windows.click(findWindowsObject('Teller/Post/Button_Close'))

//WebUI.delay(5)

//Windows.click(findWindowsObject('Teller/ToolBar_Menu/Log_Out'))


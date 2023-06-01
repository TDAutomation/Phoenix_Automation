import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.*
import java.awt.event.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//CustomKeywords.'desktop.phoenix.loginktTeller'('UAT040', 'test0040')
'clicking POST in Tool Bar Menu Bar'
Windows.click(findWindowsObject('Teller/ToolBar_Menu/Post'))

WebUI.delay(15)

Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType'))

Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType_CHQ'))

Windows.click(findWindowsObject('Teller/Post/TextBox_AccountNumber'))

Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '260509000101')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '101')

WebUI.delay(10)

Robot r = new Robot()

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

Windows.setText(findWindowsObject('Teller/Post/TextBox_CashIN'), '1')

WebUI.delay(5)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(15)

//Windows.switchToWindowTitle('Cash Paid/Received Calculator [TTD]')


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

'verifying Amount and CashIn Value'
cashin = Windows.getText(findWindowsObject('Teller/Post/TextBox_CashIN'))

KeywordUtil.logInfo(cashin)

amount = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount'))

KeywordUtil.logInfo(amount)

if (amount.equals(cashin)) {
    KeywordUtil.markPassed('Value in Cashin is equal to Amount')

    Windows.click(findWindowsObject('Teller/Post/Button_Post'))

    Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

    Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))
} else {
    KeywordUtil.markFailed('Value in Cashin is not equal to Amount')

    WebUI.takeScreenshot()
}

WebUI.delay(10)

Windows.click(findWindowsObject('Teller/Post/Button_Close'))

//WebUI.delay(10)

//Windows.click(findWindowsObject('Teller/ToolBar_Menu/Log_Out'))


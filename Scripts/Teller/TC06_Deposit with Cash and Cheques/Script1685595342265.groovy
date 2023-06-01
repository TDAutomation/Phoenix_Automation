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
Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType_SAV'))

Windows.click(findWindowsObject('Teller/Post/TextBox_AccountNumber'))

'enter Account Number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '660155373131')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

'enter Transaction Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '101')

WebUI.delay(5)

Robot r = new Robot()

WebUI.delay(10)

'enter Amount in CashIN'
Windows.setText(findWindowsObject('Teller/Post/TextBox_CashIN'), '400')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

'Currency Calcultor Windows get Opened'
WebUI.delay(5)

'enter Currency count'
Windows.click(findWindowsObject('Teller/Post/CashCalculator_100'))

Windows.setText(findWindowsObject('Teller/Post/CashCalculator_100'), '4')

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

WebUI.delay(5)

'Click On Item Capture Button'
Windows.click(findWindowsObject('Teller/Post/Button_Item Capture'))

'Item Capture window gets opened'
WebUI.delay(5)

'enter Bank Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_CaptureItemsWindow'), '4')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'enter Cheque Number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_CaptureItemsWindow'), '2343')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'enter Amount'
Windows.setText(findWindowsObject('Teller/Post/TextBox_CaptureItemsWindow'), '5000')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'click on Save'
Windows.click(findWindowsObject('Teller/Post/Button_Save'))

'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Item Capture_Close'))

'get value in Amont Field'
amount = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount'))

KeywordUtil.logInfo(amount)

'click on Post'
Windows.click(findWindowsObject('Teller/Post/Button_Post'))

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))
'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))


'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip2'))

'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Close'))

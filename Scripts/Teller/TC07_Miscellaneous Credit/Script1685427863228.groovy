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
Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '520800276501')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

'enter Transaction Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '105')

WebUI.delay(5)

'enter Reference'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Reference'), 'Rent')

Robot r = new Robot()

WebUI.delay(10)

'enter Amount in CashIN field'
Windows.click(findWindowsObject('Teller/Post/TextBox_CashIN'))

Windows.setText(findWindowsObject('Teller/Post/TextBox_CashIN'), value)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)


'Currency Calcultor Windows get Opened'

WebUI.delay(5)

'enter Currency count'

Windows.click(findWindowsObject('Teller/Post/CashCalculator_100'))

Windows.setText(findWindowsObject('Teller/Post/CashCalculator_100'), '5')

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

'get value from Amount Field'
amount = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount'))

KeywordUtil.logInfo(amount)

'get value from CashIN Field'
cashIn = Windows.getText(findWindowsObject('Teller/Post/TextBox_CashIN'))

KeywordUtil.logInfo(cashIn)

'verifying Amount and CashIn Value'
if (amount.equals(cashIn)) {
    KeywordUtil.markPassed('Value in Amount and CashOut are same' //
        )

		'click on Post button'
    Windows.click(findWindowsObject('Teller/Post/Button_Post'))
} else {
    KeywordUtil.markFailed('count is wrong')
}

'click on Skip'

Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

'click on Skip'

Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

WebUI.delay(5)

'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Close'))




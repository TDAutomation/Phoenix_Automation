import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.*
import java.awt.event.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//CustomKeywords.'desktop.phoenix.loginktTeller'('UAT040', 'Test0040')


'click on POST '
Windows.click(findWindowsObject('Teller/ToolBar_Menu/Post'))

WebUI.delay(15)

'click on Account Type'
Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType'))

'select Account Type'
Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType_CHQ'))

Windows.click(findWindowsObject('Teller/Post/TextBox_AccountNumber'))

'enter Account Number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '260505426902')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

'enter Transaction Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '154')

WebUI.delay(5)

'Customer Signature will gets opened'

Windows.switchToApplication()

WebUI.delay(10)

'Closing Customer Signature Screen'
Windows.click(findWindowsObject('Teller/Post/Signature_Close'))

Robot r = new Robot()

WebUI.delay(10)


Windows.click(findWindowsObject('Teller/Post/TextBox_Amount2'))

'Enter Amount in Amount Field'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Amount2'), '1')

WebUI.delay(5)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)
r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'get value in Amount Field'
amount = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount2'))

KeywordUtil.logInfo(amount)

'get value in CashOut Field'
cashOut = Windows.getText(findWindowsObject('Teller/Post/TextBox_CashOUT2'))

KeywordUtil.logInfo(cashOut)

'verifying Amount and Cashout Value'

if (amount.equals(cashOut)) {
    KeywordUtil.markPassed('Value in Amount and CashOut are same')
		 //
        // Windows.click(findWindowsObject('Teller/Post/CashCalculator_Button_OK'))
        
} else {
    KeywordUtil.markFailed('count is wrong')
}


'enter Cheque Number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Cheque'), '1')

'Click On POST'
Windows.click(findWindowsObject('Teller/Post/Button_Post'))


'Currency Calcultor Windows get Opened'

Windows.click(findWindowsObject('Teller/Post/CashCalculator_1'))

'enter Currency count'
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

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

WebUI.delay(5)

'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Close'))

WebUI.delay(5)

Windows.click(findWindowsObject('Teller/ToolBar_Menu/Log_Out'))
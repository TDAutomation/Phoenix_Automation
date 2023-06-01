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
Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '660217512903')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

'enter Transaction Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '012')

WebUI.delay(5)

Robot r = new Robot()

WebUI.delay(10)

'enter value in OnUScheque'
Windows.setText(findWindowsObject('Teller/Post/TextBox_OnUSCheque'), '120')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

'click on account type of ONUScheque'
Windows.click(findWindowsObject('Teller/Post/DropDown_ChequeAccountType'))

Windows.click(findWindowsObject('Teller/Post/Drop_Down_AccountType_CHQ'))

'enter Account Number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_ChequeAccountNumber'), '440180367201')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

'Customer Signature window will get opened'
WebUI.delay(5)

Windows.switchToApplication()

WebUI.delay(5)

'Closing Customer Signature Screen'
Windows.click(findWindowsObject('Teller/Post/Signature_Close'))

WebUI.delay(5)

'enter cheque number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_SalesChequeNumber'), '10000023')

'enter Payee name'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Payee'), 'thomas')

'enter Purchaser name'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Purchaser'), 'George')

WebUI.delay(5)

'enter Cheque number'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Cheque2'), '23')

'get value of  chargers'
charges = Windows.getText(findWindowsObject('Teller/Post/TextBox_Amount2'))

KeywordUtil.logInfo(charges)

'click on POST button'
Windows.click(findWindowsObject('Teller/Post/Button_Post'))

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip2'))

'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Close'))


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
Windows.setText(findWindowsObject('Teller/Post/TextBox_AccountNumber'), '660160861731')

Windows.click(findWindowsObject('Teller/Post/TextBox_Tran_Code'))

'enter Transaction Code'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Tran_Code'), '204')

WebUI.delay(5)

Robot r = new Robot()

WebUI.delay(10)

'enter Reference'
Windows.setText(findWindowsObject('Teller/Post/TextBox_Reference'), 'input B/O ABC Co Ltd')

'click on Item Capture Button'
Windows.click(findWindowsObject('Teller/Post/Button_Item Capture'))

'  Item Capture Window will get opened'
WebUI.delay(5)

'Enter Bank code '
Windows.setText(findWindowsObject('Teller/Post/TextBox_CaptureItemsWindow'), '0')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'Enter Cheque Number '
Windows.setText(findWindowsObject('Teller/Post/TextBox_CaptureItemsWindow'), '15245')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'Enter Amount '
Windows.setText(findWindowsObject('Teller/Post/TextBox_CaptureItemsWindow'), '2500')

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(5)

'Click on Save'
Windows.click(findWindowsObject('Teller/Post/Button_Save'))

'Click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Item Capture_Close'))

'click on POST button'
Windows.click(findWindowsObject('Teller/Post/Button_Post'))

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip'))

'click on Skip'
Windows.click(findWindowsObject('Teller/Post/PrintForms_Button_Skip2'))

'click on Close'
Windows.click(findWindowsObject('Teller/Post/Button_Close'))



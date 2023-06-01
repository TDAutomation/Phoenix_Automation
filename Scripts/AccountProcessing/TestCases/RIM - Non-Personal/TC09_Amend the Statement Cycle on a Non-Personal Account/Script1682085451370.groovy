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

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

accountNumber1 = Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

KeywordUtil.logInfo(accountNumber1)

Windows.click(findWindowsObject('Button_Close'))
window1=Windows.getText(findWindowsObject('StopCheques/Panel_WindowTitle'))
KeywordUtil.logInfo(window1)


Windows.click(findWindowsObject('RIMNonPersonal/Button_Edit'))

Windows.click(findWindowsObject('RIMNonPersonal/Button_Statements'))

Windows.click(findWindowsObject('RIMNonPersonal/Button_Statements'))

Windows.click(findWindowsObject('RIMNonPersonal/Button_Statements'))


window2=Windows.getText(findWindowsObject('StopCheques/Panel_WindowTitle'))
KeywordUtil.logInfo(window2)

Windows.click(findWindowsObject('RIMNonPersonal/Button_EditStatement'))

Windows.click(findWindowsObject('RIMNonPersonal/DropDown_CycleCode'))

WebUI.delay(5)

Robot r = new Robot()

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

//r.keyPress(KeyEvent.VK_DOWN)
//r.keyRelease(KeyEvent.VK_DOWN)
//r.keyPress(KeyEvent.VK_DOWN)
//r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_ENTER)

r.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(5)

//Windows.click(findWindowsObject('RIMNonPersonal/Button_EditStatment_Save'))
WebUI.delay(5)

Windows.click(findWindowsObject('RIMNonPersonal/Button_EditStatement_Close'))

Windows.click(findWindowsObject('RIMNonPersonal/Button_Close'))

Windows.click(findWindowsObject('RIMNonPersonal/Button_ExistingDeposit_Close'))

Windows.click(findWindowsObject('Button_Close'))


//Windows.click(findWindowsObject('StopCheques/Button_Close'))

//Windows.click(findWindowsObject('Button_Close'))


import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')

Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Transaction Batches'))

WebUI.delay(5)

Windows.click(findWindowsObject('Batch/Button_Items'))

//Windows.click(findWindowsObject('Batch/Button_Refresh'))//
WebUI.delay(15)

Windows.click(findWindowsObject('Batch/Button_Batch Items_New'))

Windows.click(findWindowsObject('Batch/DropDown_AccountType'))

WebUI.delay(5)

Windows.click(findWindowsObject('Batch/DropDown_AcccountType_PL'))

Windows.setText(findWindowsObject('Batch/TextBox_AccountNumber'), '660075283801')

Windows.setText(findWindowsObject('Batch/TransCode'), '300')

Windows.setText(findWindowsObject('Batch/TextBox_Amount'), '25')

Windows.click(findWindowsObject('Batch/Button_AddNext'))

WebUI.delay(5)

Windows.click(findWindowsObject('Batch/DropDown_AccountType'))

Windows.click(findWindowsObject('Batch/DropDown_AcccountType_CHQ'))

Windows.setText(findWindowsObject('Batch/TextBox_AccountNumber'), '830433655302')

Windows.setText(findWindowsObject('Batch/TransCode'), '172')

Windows.setText(findWindowsObject('Batch/TextBox_Amount'), '25')

Windows.setText(findWindowsObject('Batch/TextBox_ChequeNumber'), '25')

WebUI.delay(15)

Windows.click(findWindowsObject('Batch/Button_AddNewBatch_Save'))

WebUI.delay(5)

Windows.click(findWindowsObject('Batch/Button_AddNewBatch_Close'))

text = Windows.getText(findWindowsObject('Batch/GetText_Difference'))

KeywordUtil.logInfo(text)

WebUI.delay(10)

Windows.click(findWindowsObject('Batch/Button_Batch Items_Close'))

WebUI.delay(10)

Windows.click(findWindowsObject('Batch/Button_Close'))

Windows.click(findWindowsObject('Batch/Button_Yes'))
WebUI.delay(10)

Windows.click(findWindowsObject('Button_LogOut'))


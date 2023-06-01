import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.awt.*
import java.awt.event.*

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')

Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Customer'))

WebUI.delay(5)

Windows.click(findWindowsObject('NewCustomer/Address/RadialButton_RIMTYPE_NonPersonal'))

Windows.click(findWindowsObject('NewCustomer/Address/RadialButton_Residency_Resident'))

Windows.click(findWindowsObject('NewCustomer/Address/DropDown_OrgType'))

WebUI.delay(5)

Windows.click(findWindowsObject('NewCustomer/Address/DropDown_OrgType_Incorporated'))

WebUI.delay(5)

Windows.click(findWindowsObject('NewCustomer/Address/TextBox_Name1'))

WebUI.delay(5)

Windows.setText(findWindowsObject('NewCustomer/Address/TextBox_Name1'), companyName)

Windows.click(findWindowsObject('NewCustomer/Address/TextBox_Address1'))

Windows.setText(findWindowsObject('NewCustomer/Address/TextBox_Address1'), '123')

Windows.click(findWindowsObject('NewCustomer/Address/TextBox_Address2'))

Windows.setText(findWindowsObject('NewCustomer/Address/TextBox_Address2'), 'Testing Avenue')

Robot r = new Robot()

r.keyPress(KeyEvent.VK_CONTROL)

r.keyPress(KeyEvent.VK_TAB)

r.keyRelease(KeyEvent.VK_CONTROL)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(10)

Windows.click(findWindowsObject('NewCustomer/Contact/TextBox_Phone1'))

Windows.setText(findWindowsObject('NewCustomer/Contact/TextBox_Phone1'), '868-665-5847')

Windows.click(findWindowsObject('NewCustomer/Contact/DropDown_Class'))

Windows.click(findWindowsObject('NewCustomer/Contact/DropDown_Class_231'), FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < 4; i++) {
    r.keyPress(KeyEvent.VK_CONTROL)

    r.keyPress(KeyEvent.VK_TAB)

    r.keyRelease(KeyEvent.VK_CONTROL)

    r.keyRelease(KeyEvent.VK_TAB)
}

WebUI.delay(5)

Windows.click(findWindowsObject('NewCustomer/WithHolding/DropDown_TaxStatus'))

Windows.click(findWindowsObject('NewCustomer/WithHolding/DropDown_TaxStatus_Certified'), FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('NewCustomer/Address/Button_Save'))

Windows.click(findWindowsObject('NewCustomer/Address/Button_Close'))

WebUI.delay(10)

Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Search'))

//Windows.click(findWindowsObject('AutoTransfer/RadialButton_CustomerName'))
Windows.click(findWindowsObject('AutoTransfer/Textbox_LastName'))

Windows.setText(findWindowsObject('AutoTransfer/Textbox_LastName'), companyName)

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

WebUI.delay(5)

Windows.click(findWindowsObject('RIMNonPersonal/Button_Close'))

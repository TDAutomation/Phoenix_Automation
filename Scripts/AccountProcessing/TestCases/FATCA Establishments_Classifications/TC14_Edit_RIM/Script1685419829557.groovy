import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.awt.*
import java.awt.event.*

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')

Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Search'))

Windows.click(findWindowsObject('AutoTransfer/RadialButton_CustomerName'))

Windows.click(findWindowsObject('AutoTransfer/Textbox_LastName'))

Windows.setText(findWindowsObject('AutoTransfer/Textbox_LastName'), 'HSM Farms Limited')

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

WebUI.delay(5)

Windows.click(findWindowsObject('RIMNonPersonal/Button_EditRIM'))

WebUI.delay(15)

Robot r = new Robot()

for (int i = 0; i < 5; i++) {
    r.keyPress(KeyEvent.VK_CONTROL)

    r.keyPress(KeyEvent.VK_TAB)

    r.keyRelease(KeyEvent.VK_CONTROL)

    r.keyRelease(KeyEvent.VK_TAB)
}

WebUI.delay(10)

Windows.click(findWindowsObject('RIMNonPersonal/DropDown_FATCA'))

WebUI.delay(5)

Windows.click(findWindowsObject('RIMNonPersonal/DropDown_FATCA_US'))

WebUI.delay(5)

Windows.click(findWindowsObject('RIMNonPersonal/Button_EditRIM_Save'))

WebUI.delay(5)

Windows.click(findWindowsObject('RIMNonPersonal/Button_EditRIM_Close'))
WebUI.delay(5)
Windows.click(findWindowsObject('RIMNonPersonal/Button_Close'))

Windows.click(findWindowsObject('Button_LogOut'))


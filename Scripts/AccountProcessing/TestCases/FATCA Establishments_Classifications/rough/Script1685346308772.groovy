import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.awt.*
import java.awt.event.*

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')

Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Customer'))

WebUI.delay(10)

Robot r = new Robot()

r.keyPress(KeyEvent.VK_CONTROL)

r.keyPress(KeyEvent.VK_TAB)


r.keyRelease(KeyEvent.VK_CONTROL)

r.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(10)

Windows.click(findWindowsObject('NewCustomer/Contact/TextBox_Phone1'))

Windows.setText(findWindowsObject('NewCustomer/Contact/TextBox_Phone1'),'868-665-5847')
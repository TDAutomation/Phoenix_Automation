import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.*
import java.awt.event.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//CustomKeywords.'desktop.phoenix.loginbrowesr'('UAT075', 'test0075')
Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_Search'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/RadioButton_AccountNumber'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/AccountType_SAV'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), '350131241631')

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

accountNumber = Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

KeywordUtil.logInfo(accountNumber)

Windows.click(findWindowsObject('AutoTransfer/ToolBar_AutoTransfers'))

//Windows.switchToWindowTitle('Auto Transfers - [SAV - 040264603231]')
Windows.click(findWindowsObject('AutoTransfer/Button_AutoTransfer_New'))

Robot r = new Robot()

for (int i = 0; i < 3; i++) {
    r.keyPress(KeyEvent.VK_DOWN)

    r.keyRelease(KeyEvent.VK_DOWN)
}

//r.keyPress(KeyEvent.VK_DOWN)
//r.keyRelease(KeyEvent.VK_DOWN)
//r.keyPress(KeyEvent.VK_DOWN)
//r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_ENTER)

r.keyRelease(KeyEvent.VK_ENTER)

Windows.click(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_Description'))

Windows.setText(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_Description'), 'Pre-Authorized Standing Order')

Windows.click(findWindowsObject('AutoTransfer/Recurring/DropDown_TransferInformation_Balance Type'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/DropDown_TransferInformation_Balance Type_Collected'))

Windows.setText(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_Amount'), '20')

Windows.click(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_NextTransferDate'))

WebUI.delay(5)

Windows.click(findWindowsObject('AutoTransfer/Recurring/PopUp_TransferInformation'))

//Windows.click(findWindowsObject('AutoTransfer/Recurring/PopUp_TransferInformation'))
Windows.setText(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_NextTransferDate'), '04/28/2023')

Windows.setText(findWindowsObject('AutoTransfer/Recurring/Number_TransactionOccurance'), '6')

Windows.click(findWindowsObject('AutoTransfer/Recurring/DropDown_TI'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/DropDown_TI_Monthly'))

WebUI.delay(5)

r.keyPress(KeyEvent.VK_CONTROL)

r.keyPress(KeyEvent.VK_TAB)

Windows.click(findWindowsObject('AutoTransfer/Recurring/TransCode_FromAcccount'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/TransCode_FromAccount_163'))

//Windows.click(findWindowsObject('AutoTransfer/Recurring/TextBox_FromAccount_Description'))
WebUI.delay(5)

Windows.click(findWindowsObject('AutoTransfer/Recurring/TextBox_FromAccount_Description'))

Windows.sendKeys(findWindowsObject('AutoTransfer/Recurring/TextBox_FromAccount_Description'), 't')

WebUI.delay(5)


r.keyPress(KeyEvent.VK_CONTROL)

r.keyPress(KeyEvent.VK_TAB)

WebUI.delay(5)

Windows.click(findWindowsObject('AutoTransfer/Recurring/DropDown_ToInfo_AccountType'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/DropDown_ToInfo_AccountType_SAV'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/TextBox_ToAccountNumber'))

Windows.sendKeys(findWindowsObject('AutoTransfer/Recurring/TextBox_ToAccountNumber'), '350131241632')

Windows.click(findWindowsObject('AutoTransfer/Recurring/TransCode_ToAccount'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/TransCode_ToAccount_102'))

Windows.click(findWindowsObject('AutoTransfer/Recurring/TextBox_ToAccount_Description'))

Windows.sendKeys(findWindowsObject('AutoTransfer/Recurring/TextBox_ToAccount_Description'), text)

txt = Windows.getText(findWindowsObject('AutoTransfer/Recurring/TextBox_ToAccountNumber'))

KeywordUtil.logInfo(txt)




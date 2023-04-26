import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//Windows.startApplicationWithTitle('P:\\exe\\ktonline.exe', 'phoenix')
//Windows.setText(findWindowsObject('Object Repository/AutoTransfer/Text_UserID'), 'UAT075')
//Windows.setText(findWindowsObject('Object Repository/AutoTransfer/Text_Password'), 'test0075')
//Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Logon'))
//Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_OK'))
//Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_OK'))
//Windows.switchToWindowTitle('Republic Bank Limited - Business Support Services - Account Processing')
CustomKeywords.'desktop.phoenix.loginbrowesr'('UAT075', 'test0075')

Windows.click(findWindowsObject('Object Repository/AutoTransfer/ToolBar_Search'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/RadioButton_AccountNumber'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountType_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/AccountType_SAV'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), '040264603231')

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

Windows.click(findWindowsObject('Notes/Popup_Close'))

accountNumber = Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

KeywordUtil.logInfo(accountNumber)

Windows.click(findWindowsObject('AutoTransfer/ToolBar_AutoTransfers'))


//Windows.switchToWindowTitle('Auto Transfers - [SAV - 040264603231]')
Windows.click(findWindowsObject('AutoTransfer/Button_AutoTransfer_New'))


Windows.getText(findWindowsObject('AutoTransfer/AccountTransfer_New_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/AccountTransfer_New_Dropdown'))

Windows.click(findWindowsObject('AutoTransfer/from_AccountINformation'))

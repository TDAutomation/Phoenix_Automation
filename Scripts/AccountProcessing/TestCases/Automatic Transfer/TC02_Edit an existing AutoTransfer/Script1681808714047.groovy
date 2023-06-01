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

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')
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
Windows.click(findWindowsObject('AutoTransfer/Button_AutoTransfer_Edit'))

WebUI.delay(5)

Robot r = new Robot()

Windows.doubleClick(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_Amount'))

int ranNum = (((Math.random() * 3 + 8 ) as int))

String rn = Integer.toString(ranNum)

KeywordUtil.logInfo(rn)

Windows.setText(findWindowsObject('AutoTransfer/Recurring/TextBox_TransferInformation_Amount'), rn)

WebUI.delay(5)

Windows.click(findWindowsObject('AutoTransfer/Button_Save_Autotransfer'))

Windows.click(findWindowsObject('AutoTransfer/Button_Close_AutoTransfer'))

Windows.click(findWindowsObject('AutoTransfer/Button_Close_AutoTransfer_Homepage'))

Windows.click(findWindowsObject('Button_Close'))
Windows.click(findWindowsObject('Button_Close'))



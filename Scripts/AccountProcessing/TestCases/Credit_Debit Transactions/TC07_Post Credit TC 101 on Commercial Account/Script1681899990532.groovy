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

Windows.click(findWindowsObject('AutoTransfer/AccountType_CHQ'))

Windows.click(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'))

//accountNumber = '250506081301'

Windows.setText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber'), accountNumber)

Windows.click(findWindowsObject('Object Repository/AutoTransfer/Button_Search'))

accountNumber2 = Windows.getText(findWindowsObject('Object Repository/AutoTransfer/AccountNumber_Validate'))

KeywordUtil.logInfo(accountNumber2)

if (accountNumber2.contains(accountNumber)) {
    KeywordUtil.markPassed('Account Number is valid')
} else {
    KeywordUtil.markFailed('Account Number is not valid')
}

//clicking on Transactions from MenuBar
Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Transactions'))

if (Windows.verifyElementPresent(findWindowsObject('TitleBar_Transactions'), 5)) {
    KeywordUtil.logInfo('Newly opened window is Transactions')
} else {
    KeywordUtil.logInfo('No Newly opened window found')
}

accountNumber3 = Windows.getText(findWindowsObject('TitleBar_Transactions'))

KeywordUtil.logInfo(accountNumber3)

if (accountNumber3.contains(accountNumber)) {
    KeywordUtil.markPassed('Account Number is valid')
} else {
    KeywordUtil.markFailed('Account Number is not valid')
}


//amount="10"
//code="101"
Windows.setText(findWindowsObject('Transactions/EditBox_TransCode'), code)

Windows.setText(findWindowsObject('Transactions/TextBox_Amount'), amount)

Windows.click(findWindowsObject('Transactions/DropDwon_GL_Offset'))

Windows.click(findWindowsObject('Transactions/DropDown_GL_Offset_WIP'))

Windows.click(findWindowsObject('Transactions/Button_Post'))

Windows.click(findWindowsObject('Transactions/Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_History'))

if (Windows.verifyElementPresent(findWindowsObject('TitleBar_Transactions'), 5)) {
    KeywordUtil.logInfo('Newly opened window is Transactions')
} else {
    KeywordUtil.logInfo('No Newly opened window found')
}



Windows.click(findWindowsObject('Button_View'))
txt1=Windows.getText(findWindowsObject('Transactions/Verify_TransCode'))

txt2=Windows.getText(findWindowsObject('Transactions/Verify_Amount'))

if ((txt1.equals(code)) && (txt2.contains(amount))) {
	KeywordUtil.markPassed('Account Number is valid')
} else {
	KeywordUtil.markFailed('Account Number is not valid')
}

Windows.click(findWindowsObject('Transactions/Verification_Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

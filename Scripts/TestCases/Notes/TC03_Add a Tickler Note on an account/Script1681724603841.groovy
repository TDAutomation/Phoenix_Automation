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

Windows.click(findWindowsObject('Notes/ToolBar_Notes'))

Windows.click(findWindowsObject('Notes/Notes_New'))

Windows.click(findWindowsObject('Notes/Combo_NewNotes'))

Windows.click(findWindowsObject('Notes/Dropdown_NoteType_Tickler'))

Windows.setText(findWindowsObject('Notes/Date_NextTickleDate'), '04/28/2023')

Windows.setText(findWindowsObject('Notes/Number_TickleOccurance'), '6')

Windows.click(findWindowsObject('Notes/Dropdown_TickleOccurance'))

Windows.click(findWindowsObject('Notes/DropDown_TickleOccurance_month'))

Windows.click(findWindowsObject('Notes/CheckBox_Teller'))

Windows.setText(findWindowsObject('Notes/Edit_Note'), notes)



Windows.setText(findWindowsObject('Notes/Notes_Comments'), comments)

Windows.click(findWindowsObject('Notes/Notes_Save'))

 text= Windows.getText(findWindowsObject('Notes/Edit_Note'))

 KeywordUtil.logInfo(text)
 
if (notes.equals(text)) {
    KeywordUtil.markPassed('given notes is saved successfully')
} else {
    KeywordUtil.markFailed('given notes is not saved')
}

Windows.click(findWindowsObject('Notes/Notes_Close'))

Windows.click(findWindowsObject('Notes/Close'))

Windows.click(findWindowsObject('Notes/Close'))

Windows.click(findWindowsObject('Notes/Close'))


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.*
import java.awt.event.*

CustomKeywords.'desktop.phoenix.loginktonline'('UAT075', 'test0075')

Windows.click(findWindowsObject('AccountProcessing_ToolBar_MenuItems/Transaction Batches'))

Windows.click(findWindowsObject('AutoTransfer/Button_AutoTransfer_New'))


WebUI.delay(5)

Windows.click(findWindowsObject('Batch/TextBox_Description'))

WebUI.delay(5)

Windows.setText(findWindowsObject('Batch/TextBox_Description'), 'Katalon Studio')

Windows.click(findWindowsObject('Batch/Button_New Batch_Save'))

WebUI.delay(5)

Windows.click(findWindowsObject('Batch/Button_New Batch_Close'))

WebUI.delay(10)

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Batch/Button_Yes'))

WebUI.delay(5)

//Windows.click(findWindowsObject('Button_LogOut'))


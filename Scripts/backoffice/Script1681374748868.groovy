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

WebUI.openBrowser('https://tt-icbnk-off-t2.testtt.com/RBLTrinidadQA.BackOfficeUI/Login.aspx')

WebUI.setText(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/input_Username_ctl00MainHolderUserName'), 
    'testtt.com\\katalonbo2')

WebUI.setEncryptedText(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/input_Password_ctl00MainHolderPassword'), 
    'WydMlAT0xjbjLBHYQQofjQ==')

WebUI.sendKeys(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/input_Password_ctl00MainHolderPassword'), 
    Keys.chord(Keys.ENTER))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/a_Companies'))

WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/a_User Administration'))

WebUI.setText(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/input_Site Name_ctl00MainHolderCompaniesSitesFiltertxtSiteName'), 
    'holding')

WebUI.sendKeys(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/input_Site Name_ctl00MainHolderCompaniesSitesFiltertxtSiteName'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/select_Select an OptionView Users'), 
    '1', true)

WebDriver driver = DriverFactory.getWebDriver()

Thread.sleep(15)

//text=driver.findElement(By.xpath("//table[@id='ctl00_MainHolder_PanelControl1_thePanel']/tbody/tr")).getText()


//System.out.println(text)
List<WebElement> l=driver.findElements(By.xpath("//table[@id='ctl00_MainHolder_SitesGrid_MainGrid_DXHeadersRow']//*/table/tbody/tr"))
for(WebElement s:l) {
	KeywordUtil.logInfo(s.getText())
}
//WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/div_--window.__aspxServerFormID  aspnetForm_571e70'))
//for (def index : (2..7)) {
// red1 = WebUI.getText(findTestObject('BackOffice/Page_IC-Banking BackOffice/td_olawrence', [('index') : index]))
//
// KeywordUtil.logInfo(red1)
//}
red1 = WebUI.getText(findTestObject('BackOffice/Page_IC-Banking BackOffice/Page_IC-Banking BackOffice/desktop'))


	KeywordUtil.logInfo(red1)




//WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/td_Site Administrators_ctl00_MainHolder_Sit_67fe71'))
//WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/td_olawrence'))
//WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/td_Username'))
//WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/td_First Name'))
//WebUI.click(findTestObject('Object Repository/BackOffice/Page_IC-Banking BackOffice/td_Last Name'))
//WebUI.click(findTestObject('BackOffice/Page_IC-Banking BackOffice/Page_IC-Banking BackOffice/desktop'))
WebUI.closeBrowser()


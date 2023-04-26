import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

class Phoenix {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestSuite
	def login(TestCaseContext testCaseContext) {
		CustomKeywords.'desktop.phoenix.loginbrowesr'('UAT075', 'test0075')
		
		
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
@BeforeTestCase
	def loginsession2() {
	try{
		
		if (Windows.verifyElementPresent(findWindowsObject('AutoTransfer/ToolBar_Search'), 20)) {
									WebUI.delay(10)
								KeywordUtil.logInfo("Login Session already available")
		
	
		}
		}
		catch(elementfound) {
			
			if (org.openqa.selenium.NoSuchWindowException) {
				
				CustomKeywords.'desktop.phoenix.loginbrowesr'('UAT075', 'test0075')
	}
	}

	}
	
	
	
 // @AfterTestCase
	//def logout() {
	//Windows.click(findWindowsObject('Notes/Button_LogOut'))
 
//Windows.click(findWindowsObject('Notes/Button_LogOut'))
	//}
	
	@AfterTestSuite
	def logOut() {
		
		WebUI.delay(5)
	
		Windows.click(findWindowsObject('Notes/Button_LogOut'))
		
	 
	   				
	}
	
	
}
	//

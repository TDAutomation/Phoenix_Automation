import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
String batchFile= "C://OVscripts//tt-post-nightlydone.bat";
ProcessBuilder build= new ProcessBuilder(batchFile).inheritIO()
Process run=build.start()

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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), 'John Dork')

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_UP))

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_UP))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), Keys.chord(
        Keys.CONTROL, 'a', Keys.DELETE))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), Keys.chord(
        Keys.SHIFT, 'j'))

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), Keys.chord(
        'ohn Doe'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Password'), Keys.chord(
        'ThisIsNotAPassword', Keys.ENTER))

WebUI.delay(2)

WebUI.closeBrowser()


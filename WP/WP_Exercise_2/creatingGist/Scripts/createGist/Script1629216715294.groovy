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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Object Repository/Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'ahmadbustomi1507')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), 'ZWz//yfggn7NsmdgeXqtdQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Discover gists/svg_Sign out_octicon octicon-plus d-none d-_8b831b'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_Instantly share code, notes, and snip_67d86d'), 
    'WP_Exercise2.4')

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/pre_'))

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/pre_'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/div_1Solution'), 'Solution')

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/summary_Create secret gist_btn btn-primary _1a4c85'))

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/label_Create public gist                   _6a3ace'))

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/button_Create public gist'))

WebUI.click(findTestObject('Object Repository/Page_WP_Exercise2.4/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Editing gist3a92b3044df69520b34549a05438b3a3/span_Solution'))

WebUI.setText(findTestObject('Object Repository/Page_Editing gist3a92b3044df69520b34549a05438b3a3/div_1Modified Solution'), 
    'Modified Solution')

WebUI.click(findTestObject('Object Repository/Page_Editing gist3a92b3044df69520b34549a05438b3a3/button_Update public gist'))

WebUI.click(findTestObject('Object Repository/Page_WP_Exercise2.4/li_Delete'))

WebUI.click(findTestObject('Object Repository/Page_WP_Exercise2.4/button_Delete'))

WebUI.acceptAlert()

//WebUI.sendKeys(findTestObject('Object Repository/Page_WP_Exercise2.4/button_Delete'), Keys.ENTER)
WebUI.click(findTestObject('Object Repository/Page_ahmadbustomi1507s gists/a_All gists      0'))

WebUI.verifyElementText(findTestObject('Page_ahmadbustomi1507s gists/span_0'), '0')


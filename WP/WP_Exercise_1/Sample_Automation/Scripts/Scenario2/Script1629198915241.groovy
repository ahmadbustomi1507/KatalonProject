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

//1. Open default browser
WebUI.openBrowser('')

//2. Navigate to url https://www.ebay.com/
WebUI.navigateToUrl('https://www.ebay.com/')

//3. Type MacBook in the Search box
WebUI.click(findTestObject('Object Repository/search_MacBook/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_Enter your search keyword__nkw'))
WebUI.setText(findTestObject('Object Repository/search_MacBook/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_Enter your search keyword__nkw'), 
    'MacBook')

//4. Choose the search category , Computers/Tablet & Networking
WebUI.selectOptionByValue(findTestObject('Object Repository/search_MacBook/Page_Electronics, Cars, Fashion, Collectibl_475ffe/select_All CategoriesAntiquesArtBabyBooksBu_649c24'), 
    '58058', true)

//5. Click the Search button
WebUI.click(findTestObject('Object Repository/search_MacBook/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_Enter your search keyword_gh-btn'))

//6. Verify the first occurance of product list is "MacBook"
WebUI.verifyElementAttributeValue(findTestObject('search_MacBook/Page_macbook in Computers, Tablets, and Net_3b8d29/li_Apple MacBook Pro 13  Catalina  Intel  8_fb5ae9'), 
    'data-view', 'mi:1686|iid:1', 0)

//7. Verify the first result name contain a word "MacBook"
boolean checkOK = WebUI.getText(findTestObject('Object Repository/search_MacBook/Page_macbook in Computers, Tablets, and Net_3b8d29/span_Apple MacBook Pro 13  Catalina  Intel _e4f104')).indexOf(
    'MacBook') > 0
WebUI.verifyEqual(checkOK, true)


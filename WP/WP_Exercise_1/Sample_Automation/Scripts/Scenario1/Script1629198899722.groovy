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

//2. Navigate to url https://www.ebay.com
WebUI.navigateToUrl('https://www.ebay.com/')

//3. Click menu Category
WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/button_Shop by category'))

//4. Click sub-menu Cell Phones & accessories
WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/a_Cell phones  accessories'))

//5. Click Cell Phones & Smartphones
WebUI.click(findTestObject('Object Repository/Page_Cell Phones, Smartphones, Smart Watche_d1fc43/a_Cell Phones  Smartphones'))

//6. Click All Filter to add refinements to the product list
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_All Filters'))

//7. Set Screen Size to 4.0 - 4.4
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/span_Screen Size'))
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/span_4.0 - 4.4 in'))

//8. Add Price range Rp4.000.000 - Rp6.000.000
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Price'))
WebUI.setText(findTestObject('spy_fromToPrice/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/input_IDR_x-textrange__input x-textrange__input--from'), 
    '4000000')
WebUI.setText(findTestObject('spy_fromToPrice/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/input_IDR_x-textrange__input x-textrange__input--to'), 
    '6000000')

//9. Add Item location to Asia
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Item Location'))
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/label_Asia'))

//10. Apply the filter by clicking Apply button
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_Apply'))
WebUI.click(findTestObject('Page_4.0 - 4.4 Inch Cell Phones  Smartphone_1d6757/span_3 filters applied'))

//11. Verify all the tag shown using verifyTextPresent
WebUI.verifyTextPresent('3 filters applied', false)
WebUI.verifyTextPresent('4.0 - 4.4 in', false)
WebUI.verifyTextPresent('$4,000,000.00 to $6,000,000.00', false)
WebUI.verifyTextPresent('Asia', false)


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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.ada.astrapayupdate')

Mobile.swipe(0, 1000, 0, 0)

Mobile.tap(findTestObject('Astra Life Repo/android.widget.TextView0 - Astra Life'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Astra Life Repo/android.webkit.WebView0'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Astra Life Repo/android.widget.TextView0 - Copy'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 500, 0, 0)

Mobile.tap(findTestObject('Astra Life Repo/android.widget.TextView0 - Cek Sekarang Disini'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

def url = Mobile.getText(findTestObject('Astra Life Repo/android.widget.EditText0 - ilovelife.co.idproductsproduct-life801utm_sourceastrapayutm_mediumappsutm_campaignSAVEGEN5MAPutm_contentflexi-life'), 
    0)

Mobile.verifyEqual(url, 'ilovelife.co.id/products/product-life/801?utm_source=astrapay&utm_medium=apps&utm_campaign=SAVEGEN5MAP&utm_content=flexi-life')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Astra Life Repo/android.widget.ImageButton0'), 0)




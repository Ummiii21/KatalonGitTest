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
import groovy.json.JsonSlurper as JsonSlurper

Mobile.startExistingApplication('com.ada.astrapayupdate')

Mobile.setText(findTestObject('android.widget.EditText0 - No Handphone (1)'), '82114112515', 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Next (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Register'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Nama Lengkap Sesuai KTP'), 'Awann', 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email'), 'ha.s.wa.nda.im.awa.n@gmail.com', 0)

Mobile.tap(findTestObject('android.widget.EditText0 - Tanggal lahir'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Next (2)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Kode Referral'), 'XPPDEHX', 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Next (3)'), 0)

Mobile.setEncryptedText(findTestObject('android.widget.EditText0 (3)'), 'aeHFOx8jV/A=', 0)

Mobile.setEncryptedText(findTestObject('android.widget.EditText0 (5)'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('android.widget.CheckBox0'), 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.swipe(500, 1500, 0, 0)

Mobile.tap(findTestObject('android.widget.CheckBox0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Register (1)'), 0)

response = WS.sendRequest(findTestObject('API Repo/check OTP register'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '"status_code"', '200')

String jsonString = response.getResponseBodyContent()

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(jsonString)

Mobile.setText(findTestObject('android.widget.EditText0 (2)'), parsedJson.otp, 0)

Mobile.tap(findTestObject('android.widget.Button0 - Submit (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Explore'), 0)


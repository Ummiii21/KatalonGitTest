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

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - Transfer  Topup (1)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - Tarik Saldo (1)'), 0)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 - 0 (1)'), '10000', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.RelativeLayout0 (1)'), 0)

//Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - BPD JAMBI101010awan (1)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - BPD JAMBI101010BPR LESTARI TES'), 0)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 - Informasi (1)'), 'testing', 0)

Mobile.setEncryptedText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 (2)'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - Kirim (2)'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - KIRIM ULANG KODE OTP (13)'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - KIRIM ULANG KODE OTP (23)'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - KIRIM ULANG KODE OTP (33)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - OK (1)'), 0)

response = WS.sendRequest(findTestObject('API Repo/check OTP tarik saldo'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '"status_code"', '200')

String jsonString = response.getResponseBodyContent()

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(jsonString)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 (4)'), parsedJson.otp, 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - OK (1)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - OK (2)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.view.View0 (1)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - Riwayat'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - Tarik Saldo (2)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.ImageButton0 (1)'), 0)


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

//Pakai Nomor 0821141125156
//Pass 123456

Mobile.startExistingApplication('com.ada.astrapayupdate')

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Tutup Akun'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Lanjut'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Catatan (opsional)'), 0)

Mobile.setText(findTestObject('Tutup Akun Repo/android.widget.EditText0'), 'testing automation', 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Submit'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Pilih Akun Bank'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Testing'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.Button0 - Next'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.Button0 - Confirm'), 0)

Mobile.setEncryptedText(findTestObject('Tutup Akun Repo/android.widget.EditText0 (1)'), '75N1G81rm4Q=', 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.EditText0 (2)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.setEncryptedText(findTestObject('Tutup Akun Repo/android.widget.EditText0 (3)'), 'aeHFOx8jV/A=', 0)

Mobile.setText(findTestObject('Telkom Repo/android.widget.EditText0 (3)'), '000000', 0)

Mobile.tap(findTestObject('Telkom Repo/android.widget.Button0 - Submit'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)
//Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 13'), 0)
//
//Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 23'), 0)
//
//Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 23'), 0)
//
//Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 33'), 0)
//
//Mobile.tap(findTestObject('PDAM Repo/android.widget.TextView0 - OK'), 0)

response = WS.sendRequest(findTestObject('API Repo/check OTP tutup akun'))

WS.verifyResponseStatusCode(response, 200)

String jsonString = response.getResponseText()

//JsonSlurper slurper = new JsonSlurper()

//Map parsedJson = slurper.parseText(jsonString)

Mobile.setText(findTestObject('Pulsa Repo/android.widget.EditText0 (1)'), jsonString, 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.Button0 - Submit'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.Button0 - OK'), 0)

Mobile.setEncryptedText(findTestObject('Tutup Akun Repo/android.widget.EditText0 (4)'), 'aeHFOx8jV/A=', 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - OK'), 0)



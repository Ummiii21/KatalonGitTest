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

Mobile.tap(findTestObject('Paket Data Repo/android.widget.TextView0 - Tagihan  Isi Ulang'), 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.TextView0 - Paket Data'), 0)

Mobile.setText(findTestObject('Paket Data Repo/android.widget.EditText0 - Masukkan Nomor Telepon'), '085712345666', 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.Button0 - Next'), 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.Button0 - Pay'), 0)

Mobile.setEncryptedText(findTestObject('Telkom Repo/android.widget.EditText0'), '5WbaaGOlRjI=', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Telkom Repo/android.widget.EditText0 (1)'), 0)

Mobile.setEncryptedText(findTestObject('Paket Data Repo/android.widget.EditText0'), 'aeHFOx8jV/A=', 0)

Mobile.setText(findTestObject('Telkom Repo/android.widget.EditText0 (3)'), '000000', 0)

Mobile.tap(findTestObject('Telkom Repo/android.widget.Button0 - Submit'), 0)

Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 13'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 23'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 23'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PayTV Repo/android.widget.TextView0 - Kirim Kembali OTP - 33'), 0)

Mobile.tap(findTestObject('PDAM Repo/android.widget.TextView0 - OK'), 0)

response = WS.sendRequest(findTestObject('API Repo/check OTP biller'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '"status_code"', '200')

String jsonString = response.getResponseBodyContent()

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(jsonString)

Mobile.setText(findTestObject('Paket Data Repo/android.widget.EditText0 (1)'), parsedJson.otp, 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.Button0 - Submit'), 0)

Mobile.tap(findTestObject('Pulsa Repo/android.widget.Button0 - View Transaction Detail'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pulsa Repo/android.widget.TextView0 - Close'), 0)

Mobile.tap(findTestObject('Pulsa Repo/android.widget.Button0 - Back to Home'), 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.TextView0 - Riwayat'), 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.LinearLayout0 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Paket Data Repo/android.widget.ImageButton0'), 0)


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

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Transfer  Topup'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - SesamaMember'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - TIDAK'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Tarik Saldo'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - TIDAK'), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (3)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Upgrade (1)'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - Alamat (harus sesuai KTP sertakan RTRW) (1)'), 'Alamat', 
    0)

Mobile.swipe(200, 1000, 0, 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.EditText0 - Pekerjaan (harus sesuai KTP) (1)'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - Pekerjaan (harus sesuai KTP) (1)'), 'KARYAWAN', 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.LinearLayout0 (4)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.EditText0 - Jenis Identitas (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.LinearLayout0 (5)'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - No Identitas (1)'), '3264284247928374', 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - Tempat lahir (1)'), 'Tempat Lahir', 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.EditText0 - Jenis kelamin (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Pria'), 0)

Mobile.swipe(200, 500, 0, 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjutkan (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (4)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjut  (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (5)'), 0)

Mobile.tap(findTestObject('KYC Repo/GLButton0 - Take picture (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK (2)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjut  (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (6)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Kirim (1)'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - YA (3)'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Kirim Ulang Kode OTP (13)'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Kirim Ulang Kode OTP (23)'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Kirim Ulang Kode OTP (33)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK (3)'), 0)

response = WS.sendRequest(findTestObject('API Repo/check OTP KYC'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '"status_code"', '200')

String jsonString = response.getResponseBodyContent()

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(jsonString)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - xxxxxx (1)'), parsedJson.otp, 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - KONFIRMASI (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK (3)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Transfer  Topup'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - SesamaMember'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK (4)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Tarik Saldo'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK (4)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (3)'), 0)


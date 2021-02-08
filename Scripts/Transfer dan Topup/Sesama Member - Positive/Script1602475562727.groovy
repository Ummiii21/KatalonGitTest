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

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Transfer  Topup (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - SesamaMember (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - No Handphone (1)'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0 - Masukkan Nomor Telepon (1)'), '0821141125155', 
    0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (3)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 1 (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 000 (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (4)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Catatan (opsional) (1)'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0 (4)'), 'Testing Sukses', 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Submit (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (5)'), 0)

Mobile.setEncryptedText(findTestObject('Sesama Member Repo/android.widget.EditText0 (5)'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Confirm'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0 (6)'), '000000', 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Submit'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Kirim Kembali OTP - 13'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Kirim Kembali OTP - 23'), 0)

Mobile.delay(31, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Kirim Kembali OTP - 33'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - OK (1)'), 0)

response = WS.sendRequest(findTestObject('API Repo/check OTP sesama member'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '"status_code"', '200')

String jsonString = response.getResponseBodyContent()

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(jsonString)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0 (7)'), parsedJson.otp, 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Submit (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - View Transaction Detail'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Close'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Back to Home'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Riwayat'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Sesama Member'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0 (1)'), 0)


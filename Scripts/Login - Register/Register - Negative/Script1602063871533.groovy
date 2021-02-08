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

Mobile.setText(findTestObject('Register Repo/android.widget.EditText0 - No Handphone'), '810001000110', 0)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - Next'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - Register'), 0)

Mobile.setText(findTestObject('Register Repo/android.widget.EditText0 - Nama Lengkap Sesuai KTP'), 'Register Negative', 
    0)

Mobile.setText(findTestObject('Register Repo/android.widget.EditText0 - Email'), 'haswandaimawan@gmail.com', 0)

Mobile.tap(findTestObject('Register Repo/android.widget.EditText0 - Tanggal lahir'), 0)

Mobile.tap(findTestObject('Register Repo/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - Next (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - OK'), 0)

Mobile.setText(findTestObject('Register Repo/android.widget.EditText0 - haswandaimawangmail.com'), 'd.ummytestingacc35@gmail.com', 
    0)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - Next (1)'), 0)

Mobile.setText(findTestObject('Register Repo/android.widget.EditText0 - Kode Referral'), 'INVALID', 0)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - Next (2)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Repo/android.widget.TextView0 - Skip'), 0)

Mobile.setEncryptedText(findTestObject('Register Repo/android.widget.EditText0'), 'aeHFOx8jV/A=', 0)

Mobile.setEncryptedText(findTestObject('Register Repo/android.widget.EditText0 (1)'), '5WbaaGOlRjI=', 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()


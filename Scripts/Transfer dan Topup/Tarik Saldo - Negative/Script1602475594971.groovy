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

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - Transfer  Topup'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - Tarik Saldo'), 0)

//Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - YA MENGERTI'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - Kirim'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 - 0'), '10000000', 0)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 - Informasi'), 'testing', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - CIMB101010awan'), 0)

Mobile.setEncryptedText(findTestObject('Tarik Saldo Repo/android.widget.EditText0'), '5WbaaGOlRjI=', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - Kirim (1)'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 - 10000000'), '10000', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - Kirim (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - OK'), 0)

Mobile.setEncryptedText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 - 000000'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - Kirim (1)'), 0)

Mobile.setText(findTestObject('Tarik Saldo Repo/android.widget.EditText0 (1)'), '000000', 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - OK'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - OK'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.Button0 - BATAL'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.TextView0 - YA'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Tarik Saldo Repo/android.view.View0'), 0)


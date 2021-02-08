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

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Transfer  Topup'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - SesamaMember'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - No Handphone'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0 - Masukkan Nomor Telepon'), '089659790023', 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 000'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 000'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 000'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Catatan (opsional)'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0'), 'Testing Melebihi Limit', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Submit'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (2)'), 0)

Mobile.setEncryptedText(findTestObject('Sesama Member Repo/android.widget.EditText0 (1)'), '5WbaaGOlRjI=', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.EditText0 (2)'), 0)

Mobile.setEncryptedText(findTestObject('Sesama Member Repo/android.widget.EditText0 (3)'), 'aeHFOx8jV/A=', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - OK'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0 - 089659790023'), '0896597900233', 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 000'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Catatan (opsional)'), 0)

Mobile.setText(findTestObject('Sesama Member Repo/android.widget.EditText0'), 'Testing Akun Tidak Dikenali', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - Submit'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.Button0 - Next (2)'), 0)

Mobile.setEncryptedText(findTestObject('Sesama Member Repo/android.widget.EditText0 (1)'), 'aeHFOx8jV/A=', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.TextView0 - OK'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Sesama Member Repo/android.view.View0'), 0)


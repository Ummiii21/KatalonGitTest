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

Mobile.setText(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.EditText0 - No Handphone'), '82210940323', 
    0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Next'), 0)

Mobile.setEncryptedText(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.EditText0'), '5WbaaGOlRjI=', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setEncryptedText(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.EditText0'), 'aeHFOx8jV/A=', 0)

//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Skip'), 0)
//
//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next'), 0)
//
//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)
//
//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)
//
//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)
//
//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)
//
//Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Lets Go'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Keluar'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - YA'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Pindah Ke Akun Lain'), 0)

Mobile.setText(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.EditText0 - No Handphone'), '082114112515', 
    0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Next'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.EditText0 - 082114112515'), '82114112515', 
    0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Next'), 0)

Mobile.setEncryptedText(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.EditText0'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.tap(findTestObject('Login - Logout - Pindah Akun Repo/android.widget.Button0 - Lets Go'), 0)


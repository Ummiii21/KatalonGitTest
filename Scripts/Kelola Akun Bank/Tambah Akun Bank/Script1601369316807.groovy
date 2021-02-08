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

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.TextView0 - Kelola Akun Bank'), 0)

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.TextView0 - Tambah Akun Bank'), 0)

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0 - Masukkan nama bank'), 0)

Mobile.setText(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0 - Masukkan nama bank (1)'), 'Bank Central Asia', 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0 - Masukkan nomor rekening'), 0)

Mobile.setText(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0 - Masukkan nomor rekening'), '101010', 0)

Mobile.setText(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0 - Masukkan nama yang diinginkan'), 'Testing', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.Button0 - Save'), 0)

Mobile.setEncryptedText(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0'), '5WbaaGOlRjI=', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setEncryptedText(findTestObject('Kelola Akun Bank Repo/android.widget.EditText0'), 'aeHFOx8jV/A=', 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Kelola Akun Bank Repo/android.widget.ImageButton0 (1)'), 0)

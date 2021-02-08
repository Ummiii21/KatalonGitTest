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

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Tutup Akun (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Batal'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Tutup Akun (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Lanjut (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Catatan (opsional) (1)'), 0)

Mobile.setText(findTestObject('Tutup Akun Repo/android.widget.EditText0 (5)'), 'tes', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Tutup Akun Repo/android.widget.EditText0 - tes'), 'testing saldo tidak cukup', 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - Submit (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - CIMB - 101010'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - OK (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - CIMB - 101010 (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - BPD JAMBI - 101010'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.Button0 - Next (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.TextView0 - OK (1)'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Tutup Akun Repo/android.widget.ImageButton0'), 0)


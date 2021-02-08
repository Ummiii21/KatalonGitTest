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

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - Upgrade'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - Alamat (harus sesuai KTP sertakan RTRW)'), 'test', 0)

Mobile.swipe(200, 1000, 0, 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjutkan'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - Pekerjaan (harus sesuai KTP)'), 'PEKERJAAN SALAH', 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.EditText0 - Jenis Identitas'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.LinearLayout0'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - No Identitas'), '43875348793845748', 
    0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - Tempat lahir'), 'test', 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.EditText0 - Jenis kelamin'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.LinearLayout0 (1)'), 0)

Mobile.swipe(200, 500, 0, 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjutkan'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - PEKERJAAN SALAH'), 'KARYAWAN SWASTA', 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.LinearLayout0 (2)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.LinearLayout0 (3)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjutkan'), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjut '), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/GLButton0 - Take picture'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Lanjut '), 0)

Mobile.tap(findTestObject('KYC Repo/android.view.View0 (2)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - Kirim'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - YA'), 0)

Mobile.setText(findTestObject('KYC Repo/android.widget.EditText0 - xxxxxx'), '000000', 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.Button0 - KONFIRMASI'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - OK'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.ImageButton0'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - YA (1)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.ImageButton0 (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KYC Repo/android.widget.TextView0 - YA (2)'), 0)

Mobile.tap(findTestObject('KYC Repo/android.widget.ImageButton0 (1)'), 0)


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

Mobile.tap(findTestObject('Telkom Repo/android.widget.TextView0 - Tagihan  Isi Ulang'), 0)

Mobile.tap(findTestObject('Telkom Repo/android.widget.TextView0 - Telkom'), 0)

//Mobile.setText(findTestObject('Telkom Repo/android.widget.EditText0 - Masukkan Nomor Telepon'), '00000', 0)
//
//Mobile.tap(findTestObject('Telkom Repo/android.widget.Button0 - Next'), 0)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Telkom Repo/android.widget.TextView0 - OK'), 0)

Mobile.setText(findTestObject('Telkom Repo/android.widget.EditText0 - 000000'), '02187986233', 0)

Mobile.tap(findTestObject('Telkom Repo/android.widget.Button0 - Next'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pulsa Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Pulsa Repo/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Pulsa Repo/android.view.View0'), 0)

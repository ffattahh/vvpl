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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://simimaa1-498a3c4302e1.herokuapp.com/')

WebUI.click(findTestObject('Page_SiMIMA - Sistem Informasi Manajemen Sekolah/a_Masuk (10)'))

WebUI.setText(findTestObject('Page_Login - SiMIMA/input_No.HP _ Username (15)'), 'Superadmin')

WebUI.click(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (15)'))

WebUI.setEncryptedText(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (15)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Login - SiMIMA/button_Masuk Sekarang (14)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/span_Akademik (3)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/span_Pelajaran (1)'))

WebUI.click(findTestObject('Page_Akademik  Pelajaran - SiMIMA/button_add (2)'))

WebUI.setText(findTestObject('Page_Akademik  Pelajaran - SiMIMA/input_Contoh_ MAT-01 (2)'), 'BING-01')

WebUI.setText(findTestObject('Page_Akademik  Pelajaran - SiMIMA/textarea_Tulis keterangan mata pelajaran (3)'), 'Bahasa Inggris')

WebUI.click(findTestObject('Page_Akademik  Pelajaran - SiMIMA/button_Simpan Data (3)'))


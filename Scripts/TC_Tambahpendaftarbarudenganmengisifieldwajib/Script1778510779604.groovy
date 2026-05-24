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

WebUI.click(findTestObject('Page_SiMIMA - Sistem Informasi Manajemen Sekolah/a_Masuk (19)'))

WebUI.setText(findTestObject('Page_Login - SiMIMA/input_No.HP _ Username (23)'), 'Superadmin')

WebUI.click(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (23)'))

WebUI.setEncryptedText(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (23)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Login - SiMIMA/button_Masuk Sekarang (21)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/a_Tambah pendaftar baru (7)'))

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Nama lengkap (6)'), 'Brando')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Nis (6)'), '23194113')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Nama Wali (6)'), 'Suyanto')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Username Wali (6)'), 'yanto')

WebUI.click(findTestObject('Page_Tambah - SiMIMA/input_Password Wali (6)'))

WebUI.setEncryptedText(findTestObject('Page_Tambah - SiMIMA/input_Password Wali (6)'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Tambah - SiMIMA/input_Konfirmasi Password (4)'))

WebUI.setEncryptedText(findTestObject('Page_Tambah - SiMIMA/input_Konfirmasi Password (4)'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Tambah - SiMIMA/button_Simpan (7)'))


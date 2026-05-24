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

WebUI.click(findTestObject('Page_SiMIMA - Sistem Informasi Manajemen Sekolah/a_Masuk (11)'))

WebUI.setText(findTestObject('Page_Login - SiMIMA/input_No.HP _ Username (16)'), 'Superadmin')

WebUI.click(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (16)'))

WebUI.setEncryptedText(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (16)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Login - SiMIMA/button_Masuk Sekarang (15)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/a_Tambah pendaftar baru (4)'))

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Nama lengkap (3)'), 'Alexx')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Nis (3)'), '2141023')

WebUI.selectOptionByValue(findTestObject('Page_Tambah - SiMIMA/select_Jenis kelamin (2)'), 'L', false)

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Asal sekolah (2)'), 'SMP 16 ')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Tempat lahir (2)'), 'Jakarta')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Tanggal lahir (2)'), '2011-10-11')

WebUI.selectOptionByValue(findTestObject('Page_Tambah - SiMIMA/select_Wali murid (2)'), '100', false)

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Nama Wali (3)'), 'steven')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_No. HP Wali (2)'), '081237812410')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/textarea_Alamat Wali (2)'), 'PIK')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Username Wali (3)'), 'stevenn')

WebUI.setText(findTestObject('Page_Tambah - SiMIMA/input_Email Wali (2)'), 'steven77@gmail.com')

WebUI.click(findTestObject('Page_Tambah - SiMIMA/input_Password Wali (3)'))

WebUI.setEncryptedText(findTestObject('Page_Tambah - SiMIMA/input_Password Wali (3)'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Tambah - SiMIMA/input_Konfirmasi Password (2)'))

WebUI.setEncryptedText(findTestObject('Page_Tambah - SiMIMA/input_Konfirmasi Password (2)'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Tambah - SiMIMA/button_Simpan (4)'))


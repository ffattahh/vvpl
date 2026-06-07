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

WebUI.click(findTestObject('Page_SiMIMA - Sistem Informasi Manajemen Sekolah/a_Masuk (36)'))

WebUI.setText(findTestObject('Page_Login - SiMIMA/input_No.HP _ Username (40)'), 'Superadmin')

WebUI.click(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (40)'))

WebUI.setEncryptedText(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (40)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Login - SiMIMA/button_Masuk Sekarang (37)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/div_Data Anggota (1)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/a_ (13)'))

WebUI.click(findTestObject('Page_Data Siswa - SiMIMA/button_Tambah Siswa'))

WebUI.setText(findTestObject('Page_Data Siswa - SiMIMA/input_Nama lengkap siswa'), 'Rasyid')

WebUI.setText(findTestObject('Page_Data Siswa - SiMIMA/input_Nomor Induk Siswa'), '1234')

WebUI.selectOptionByValue(findTestObject('Page_Data Siswa - SiMIMA/select_Jenis Kelamin'), 'L', false)

WebUI.setText(findTestObject('Page_Data Siswa - SiMIMA/input_Asal sekolah sebelumnya'), 'SD')

WebUI.setText(findTestObject('Page_Data Siswa - SiMIMA/input_Tempat lahir'), 'Pwt')

WebUI.setText(findTestObject('Page_Data Siswa - SiMIMA/input_Tanggal Lahir'), '2026-06-10')

WebUI.selectOptionByValue(findTestObject('Page_Data Siswa - SiMIMA/select_Tingkat'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Siswa - SiMIMA/select_Kelas'), '4', false)

WebUI.setText(findTestObject('Page_Data Siswa - SiMIMA/input_Contoh_ Budi Susanto'), 'b')

WebUI.click(findTestObject('Page_Data Siswa - SiMIMA/div_Abyasa Mansur'))

WebUI.click(findTestObject('Page_Data Siswa - SiMIMA/button_muridSubmitText'))


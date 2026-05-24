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

WebUI.click(findTestObject('Page_SiMIMA - Sistem Informasi Manajemen Sekolah/a_Masuk (6)'))

WebUI.setText(findTestObject('Page_Login - SiMIMA/input_No.HP _ Username (11)'), 'Superadmin')

WebUI.click(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (11)'))

WebUI.setEncryptedText(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (11)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Login - SiMIMA/button_Masuk Sekarang (10)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/span_Akademik (2)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/span_Tahun Ajaran (2)'))

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/button_Tambah Tahun Ajaran (2)'))

WebUI.setText(findTestObject('Page_Tahun Ajaran - SiMIMA/input_Contoh_ 2025_2026 (1)'), '2025/2026')

WebUI.setText(findTestObject('Page_Tahun Ajaran - SiMIMA/input_tahun_mulai (2)'), '04-05-2026')

WebUI.setText(findTestObject('Page_Tahun Ajaran - SiMIMA/input_tahun_selesai (2)'), '27-07-2026')

WebUI.selectOptionByValue(findTestObject('Page_Tahun Ajaran - SiMIMA/select_semester_aktif (2)'), 'Genap', false)

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/input_Aktifkan tahun ajaran ini'))

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/button_Simpan Data (2)'))

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/td_2025_2026'))

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/td_Genap'))

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/td_04 Mei 2026'))

WebUI.click(findTestObject('Page_Tahun Ajaran - SiMIMA/td_Selesai'))


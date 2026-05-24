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

WebUI.click(findTestObject('Page_SiMIMA - Sistem Informasi Manajemen Sekolah/a_Masuk (20)'))

WebUI.setText(findTestObject('Page_Login - SiMIMA/input_No.HP _ Username (24)'), 'Superadmin')

WebUI.click(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (24)'))

WebUI.setEncryptedText(findTestObject('Page_Login - SiMIMA/input_Kata Sandi (24)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Login - SiMIMA/button_Masuk Sekarang (22)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/div_Akademik (3)'))

WebUI.click(findTestObject('Page_Dashboard - SiMIMA/a_ (2)'))

WebUI.click(findTestObject('Page_Akademik  Pelajaran - SiMIMA/span_edit'))

WebUI.click(findTestObject('Page_Akademik  Pelajaran - SiMIMA/input_edit_kode_mapel'))

WebUI.doubleClick(findTestObject('Page_Akademik  Pelajaran - SiMIMA/input_edit_kode_mapel'))

WebUI.setText(findTestObject('Page_Akademik  Pelajaran - SiMIMA/input_edit_kode_mapel'), '')

WebUI.setText(findTestObject('Page_Akademik  Pelajaran - SiMIMA/input_edit_nama_mapel'), 'Pendidikan Jasmani dan Olahraga')

WebUI.setText(findTestObject('Page_Akademik  Pelajaran - SiMIMA/textarea_edit_keterangan'), 'belajar tentang pendidikan jasmani dan olahraga')

WebUI.click(findTestObject('Page_Akademik  Pelajaran - SiMIMA/button_Update Data'))


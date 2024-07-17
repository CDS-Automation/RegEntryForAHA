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

WebUI.navigateToUrl('https://dev3xpressreg.cdsreg.com/register/strk0225/group/login.asp')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_International Stroke Conference 2025/select_Please Select                    CDSCDS'), 
    '30049', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Password_CompanyPassword'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Password_btnContinue'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/a_Registrations'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/a_Add a Registrant'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_International Stroke Conference 2025/select_Please Select                    Adm_32dbd2'), 
    'M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_International Stroke Conference 2025/select_Please Select                    Stu_c92663'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_International Stroke Conference 2025/select_Please Select                    Adm_9ccbd0'), 
    '6001', true)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_First Name_FirstName'), 
    First_Name)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_LastFamily Name_LastName'), 
    Last_Name)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Badge First Name_NickName'), 
    Last_Name)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Job Title_Title'), Job_Title)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Institution_Company'), 'CDS')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/label_Community Facility'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Address_Street'))

WebUI.switchToWindowTitle('International Stroke Conference 2025')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/div_CDS8771 Shining Drive71Montreal, QC H1N_e1a770'))

WebUI.switchToWindowTitle('International Stroke Conference 2025')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Address_Street'), '8771 Shining Drive')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Address 2_Street2'), '71')

WebUI.switchToWindowTitle('International Stroke Conference 2025')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/div_CDS8771 Shining Drive71Montreal, QC H1N_e1a770'))

WebUI.switchToWindowTitle('International Stroke Conference 2025')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_ZipPostal Code_Zipcode'), 
    'H1N2J4')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_City_City'), '')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_City_City'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/label_Business Address'))

WebUI.switchToWindowTitle('International Stroke Conference 2025')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/div_CDS8771 Shining Drive71Montreal, QC H1N_e1a770'))

WebUI.doubleClick(findTestObject('Object Repository/Page_International Stroke Conference 2025/div_CDS8771 Shining Drive71Montreal, QC H1N_e1a770'))

WebUI.switchToWindowTitle('International Stroke Conference 2025')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Phone_Phone'), '4440001111')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Email_Email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Confirm Email_ConfirmEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_NPI Number_ExtraInfo70'), 
    'N/A')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_International Stroke Conference 2025/select_Please Select                    21 _7791df'), 
    '22-34', true)

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_I accept the Photography Waiver_ExtraInfo66'))

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Contact Name_ExtraInfo65'), 
    'Alexis')

WebUI.setText(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Contact Phone_ExtraInfo67'), 
    '4440001111')

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Password_btnContinue'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_httpswww.state.gov_btnContinue'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_In-Person Full Conference  Group Prof_fd7640'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Password_btnContinue'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Password_btnContinue'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/label_Thanks, but not this time'))

WebUI.click(findTestObject('Object Repository/Page_International Stroke Conference 2025/input_Password_btnContinue'))

WebUI.click(findTestObject('Page_International Stroke Conference 2025/Sign out'))

//println("$First_Name - $Last_Name - $Job_Title - $Institution - $Address - $ZipPostal_Code - $Phone - $Email - $NPI_Number -$Contact_Name - $Contact_Phone")


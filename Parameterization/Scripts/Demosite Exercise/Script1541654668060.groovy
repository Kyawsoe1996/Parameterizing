import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_Login_UserName'), 
    'Kyaw')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_Login_Password'), 
    'Soe')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/select_SelectMr.Ms.'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_Initial_Initial'), 
    'Kyaw')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input__FirstName'), 'SOe')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_Middle Name_MiddleName'), 
    'Moe')

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_MaleFemale_Male'))

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_EnglishHindi_Hindi'))

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/input_EnglishHindi_Save'))

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Execute Automation/a_HtmlPopup'))

WebUI.switchToWindowTitle('Popup Window')

WebUI.selectOptionByValue(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/select_SelectMr.Ms.'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input_Initial_Initial'), 'Kyaw')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input__FirstName'), 'Soe ')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input_Middle Name_MiddleName'), 
    'Moe')

WebUI.setText(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input__LastName'), 'MOe')

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input_GenderMaleFemale_Male'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/select_SelectIndiaUSASingapore'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input_Country_Save'))

WebUI.click(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input_Country_Save'))

WebUI.doubleClick(findTestObject('Object Repository/Demosite Object Repository/Page_Popup Window/input_Country_Save'))

WebUI.closeBrowser()


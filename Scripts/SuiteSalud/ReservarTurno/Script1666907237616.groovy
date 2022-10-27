import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://www.ingdlopez.evsis.com/testing/turnos/")
selenium.click("id=btn-make-appointment")
selenium.click("id=txt-username")
selenium.type("id=txt-username", "David")
selenium.type("id=txt-password", "Testing")
selenium.click("id=btn-login")
selenium.click("id=combo_facility")
selenium.select("id=combo_facility", "label=Buenos Aires")
selenium.click("id=chk_hospotal_readmission")
selenium.click("id=radio_program_medicaid")
selenium.click("id=txt_visit_date")
selenium.type("id=txt_visit_date", ("14/01/2022").toString())
selenium.click("id=txt_comment")
selenium.type("id=txt_comment", ("Me duele el dedo.").toString())
selenium.click("id=btn-book-appointment")
selenium.click("id=menu-toggle")
selenium.click("link=Historia")
assertEquals("14/01/2022", selenium.getText("class=panel-heading"));
assertEquals("Buenos Aires", selenium.getText("id=facility"));
assertEquals("Sí", selenium.getText("id=hospital_readmission"));
assertEquals("Osde", selenium.getText("id=program"));
assertEquals("Me duele el dedo.", selenium.getText("id=comment"));
selenium.click("xpath=//a[@id='menu-toggle']/i")
selenium.click("link=Salir")

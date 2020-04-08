package Orghrm.TR;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/AD/Documents/SELENIUM/orghrm/orghrm/loginpage.feature", plugin = {"pretty" ,"html:Reports/Cucumber-html-reoprt" , "json:Reports/Cucumber.json"} , glue="ORG.orghrm")

public class OrgHrmTR {

}

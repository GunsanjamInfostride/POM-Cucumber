package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		
		features = {"C:\\Users\\GunsanjamKaur\\eclipse-workspace\\com.POMwithcucumber.bdd\\src\\test\\java\\FeatureFiles\\LoginPom.feature"},
		glue = {"StepDefinition"},
		dryRun=false,
		monochrome=true,
		strict=true,
		plugin= {"pretty","json:Reports/Cucumber.json",
				"junit:Reports/XMLReports.xml",
				"html:Reports/cucumberReport"
				}
		
)

public class TestRunner 
{
	
}

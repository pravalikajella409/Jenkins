package runner;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = "stepDef",
		tags = "@SanityTest and @E2ETest",
//		plugin = {"pretty", "html:target/cucumber/report.html",
//				"json:target/cucumber/report.json",
//		"junit:target/cucumber/report.xml"}
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//monochrome = true
		//dryRun = false
				)
 
public class HotelSearch {
 
}
System.out.println("Git");
System.out.println("Done");
System.out.println("End");

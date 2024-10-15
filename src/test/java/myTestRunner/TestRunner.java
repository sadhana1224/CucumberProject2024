package myTestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //first 2 mandatory-feature and glue
        //features = "Features", //no need to specify the feature file name, if we wnat we can specify
        //glue = "stepDefinitions", //need to specify the folder name of step definition file
       // features = "C:/Users/sadha/IdeaProjects/CucumberProject/Features/Tagging.feature",
        features = "C:/Users/sadha/IdeaProjects/CucumberProject/Features/hooks.feature",
      glue = {"stepDefinitions"},
        //    dryRun =true,   //by default dry value is false, if we want we make it true , it will verify all the steps are mapped or not,
        plugin = {"pretty", "html:target/test-output", "json:target/json_output/cucumber.json", "junit:target/junit_xml_output/cucumber.xml"},
        //generate 3 diff reprts--html and JSOn,XML-- you can use any one of the format for reports
        //for reports new folder need to be creared
        //dryRun =true,
        monochrome=true, //it will give the dry run information
        //strict=false //it will check if any step is not defined in the step definition file, if step is not there it will throw an error
// strict option was removed in later versions of Cucumber.
      // tags="@sanitytest" //-->working single tag
     //  tags = "@sanitytest or  @Regression"  //-->or working, only and is not working
        tags="not @sanitytest " //this will ignore smoke test cases //working
       // tags={"@sanitytest","@smoke"}   //and not working

)
public class TestRunner {

}

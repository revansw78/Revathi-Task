package taskwork_ui;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/taskwork_ui",
       // glue =  "src/test/java/taskwork_ui/stepdefinitions",
        glue =  {"taskwork_ui.stepdefinitions","taskwork_ui.myUtils"
        },
        tags = "@MotorDutyAssessment",
        monochrome = true,
        plugin = {"rerun:target/rerun.txt"})



public class uiTest {
}

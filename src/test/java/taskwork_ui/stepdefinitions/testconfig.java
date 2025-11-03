package taskwork_ui.stepdefinitions;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {testconfig.class})
public class testconfig {
}

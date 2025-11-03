package taskwork_ui.myUtils;


import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;


import io.cucumber.java.Before;
import org.openqa.selenium.edge.EdgeOptions;

public class Browserconfig
{
    @Before public static void setupAll(){
        Configuration.browser = "edge";
        Configuration.browserCapabilities =
                new EdgeOptions().addArguments("--remote-allow-origins=*");
        WebDriverManager.edgedriver().setup();

    }


    }


package xfleet.tests.cucumber.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import xfleet.utilities.ConfigurationReader;
import xfleet.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before                                  // @Before(order = 2) --> priority will run 2
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"+ConfigurationReader.getProperty("environment")));
    }


    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
        System.out.println("AFTER");
    }






//    @Before("@storemanager")  // @Before(value = "@storemanager" , order = 1) --> priority will run 1
//    public void setupForStoreManager(Scenario scenario){
//        System.out.println("BEFORE FOR STORE MANAGER");
//    }
//
//
//    @After
//    public void teardownForStoreManager(Scenario scenario){
//        System.out.println("AFTER FOR STORE MANAGER");
//    }


}

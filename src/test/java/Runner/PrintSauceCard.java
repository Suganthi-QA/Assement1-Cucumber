package Runner;

import Base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature",glue="Steps",publish=true,monochrome=true)
public class PrintSauceCard extends BaseClass {

}

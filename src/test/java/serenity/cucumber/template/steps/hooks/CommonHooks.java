package serenity.cucumber.template.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonHooks {
  
  @Before
  public void setupScenario(Scenario scenario) {
    System.out.println("CommonHooks.setupEscenario... OK");
  }
  
  @After
  public void tearDownScenario(Scenario scenario) {
    System.out.println("CommonHooks.tearDownScenario... OK");
  } 
}

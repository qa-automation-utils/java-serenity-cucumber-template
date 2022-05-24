package serenity.cucumber.template.steps.theme01;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Theme01Hooks {
  
  @Before
  public void setupScenario(Scenario scenario) {
    System.out.println("Theme01Hooks.setupEscenario... OK");
  }
  
  @After
  public void tearDownScenario(Scenario scenario) {
    System.out.println("Theme01Hooks.tearDownScenario... OK");
  } 
}

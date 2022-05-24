package serenity.cucumber.template.steps.theme02;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Theme02Hooks {
  
  @Before
  public void setupScenario(Scenario scenario) {
    System.out.println("Theme02Hooks.setupEscenario... OK");
  }
  
  @After
  public void tearDownScenario(Scenario scenario) {
    System.out.println("Theme02Hooks.tearDownScenario... OK");
  } 
}

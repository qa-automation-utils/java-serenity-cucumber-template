package serenity.cucumber.template.steps.themeOne;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ThemeOneHooks {
  
  @Before
  public void setupScenario(Scenario scenario) {
    System.out.println("Theme01Hooks.setupEscenario... OK");
  }
  
  @After
  public void tearDownScenario(Scenario scenario) {
    System.out.println("Theme01Hooks.tearDownScenario... OK");
  } 
}

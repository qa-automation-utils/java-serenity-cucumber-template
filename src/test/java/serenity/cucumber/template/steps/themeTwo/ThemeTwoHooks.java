package serenity.cucumber.template.steps.themeTwo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ThemeTwoHooks {
  
  @Before
  public void setupScenario(Scenario scenario) {
    System.out.println("Theme02Hooks.setupEscenario... OK");
  }
  
  @After
  public void tearDownScenario(Scenario scenario) {
    System.out.println("Theme02Hooks.tearDownScenario... OK");
  } 
}

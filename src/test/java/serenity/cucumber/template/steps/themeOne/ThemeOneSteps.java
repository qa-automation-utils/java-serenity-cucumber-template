package serenity.cucumber.template.steps.themeOne;

import io.cucumber.java.en.*;

public class ThemeOneSteps {
  
  @Given("^precondiciones del escenario T01-C01-.+ \"?([^\"]+)\"?$")
  public void givenMethod01(String parameter) {
    System.out.println("Given Method T01-C01... " + parameter);
  }
  
  @When("^paso a paso del escenario T01-C01-.+$")
  public void whenMethod01() {
    System.out.println("When Method T01-C01... OK");
  }
  
  @Then("^resultado del escenario T01-C01-.+ \"?([^\"]+)\"?$")
  public void thenMethod01(String parameter) {
    System.out.println("Then Method T01-C01... " + parameter);
  }
}

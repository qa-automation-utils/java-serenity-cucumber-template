package serenity.cucumber.template.steps.theme02;

import io.cucumber.java.en.*;

public class Theme02Steps {
  
  @Given("^precondiciones del escenario T02-C02-.+ \"?([^\"]+)\"?$")
  public void givenMethod01(String parameter) {
    System.out.println("Given Method T02-C02... " + parameter);
  }
  
  @When("^paso a paso del escenario T02-C02-.+$")
  public void whenMethod01() {
    System.out.println("When Method T02-C02... OK");
  }
  
  @Then("^resultado del escenario T02-C02-.+ \"?([^\"]+)\"?$")
  public void thenMethod01(String parameter) {
    System.out.println("Then Method T02-C02... " + parameter);
  }
}

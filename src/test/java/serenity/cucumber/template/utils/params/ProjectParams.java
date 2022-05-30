package serenity.cucumber.template.utils.params;

import com.qa.automation.utils.java.utils.params.JavaUtilsParams;

import static com.qa.automation.utils.java.utils.params.ProjectConfigProperties.*;

public final class ProjectParams extends JavaUtilsParams {

  // GRADLE INPUT PARAMS --------------------------------------------------------------------------------------------------------

  public static final String TEST_ENVIRONMENT = (System.getProperty("TestEnvironment") != null) ? System.getProperty("TestEnvironment") : getAsString("default.test.environment");

  // PARAMS FROM PROJECT CONFIG PROPERTIES FILE (project.config.properties) -----------------------------------------------------
}

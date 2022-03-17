import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefenition"},
        tags = "@Smoke"
)

public class RunnerTest
{
    @BeforeClass
    public static void beforeAll() throws Exception
    {
        RestAssured.filters(new AllureRestAssured());
    }
}

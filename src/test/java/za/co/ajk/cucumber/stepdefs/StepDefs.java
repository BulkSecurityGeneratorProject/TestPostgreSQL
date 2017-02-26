package za.co.ajk.cucumber.stepdefs;

import za.co.ajk.TestPostgreSqlApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestPostgreSqlApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

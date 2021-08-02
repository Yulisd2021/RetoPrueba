package com.choucairtesting.automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/from.feature",
        glue="com.choucairtesting.test.stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        tags="@regression")
public class FromRunner {
}
package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/feature", glue = "stepdefinitions",
tags = "@background_concept",stepNotifications = true,monochrome = true)
//please use "@passing_values_from_examples, @background_concept, ~@regression" in tags
// for including multiple scenarios with tag @background_concept  and excluding scenarios with
//tag @regression
public class RunnerClass {

}

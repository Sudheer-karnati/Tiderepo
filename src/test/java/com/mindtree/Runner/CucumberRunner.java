package com.mindtree.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\Features", glue = { "com.mindtree.Runner" })
public class CucumberRunner {

}

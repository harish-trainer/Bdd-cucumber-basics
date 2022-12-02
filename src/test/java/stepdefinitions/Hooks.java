package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	/*
	 * (value = "@first", order = 1) (value = "@first", order = 0)
	 */
	@Before(value = "@first", order = 1)
	public void beforeStepForFirstScenario1() {
		System.out.println("deva works for doss");
	}

	@After(value = "@first", order = 0)
	public void afterStepForFirstScenario0() {
		System.out.println("deva kills kamalesh");
	}

	/*
	 * (value = "@first", order = 1) (value = "@first", order = 0)
	 */
	  @After(value = "@first", order = 1)
	  public void afterStepForFirstScenario1()
	  { System.out.println("doss gets killed"); }
	  
	  @Before(value = "@first", order = 0)
	  public void
	  beforeStepForFirstScenario0() {
	  System.out.println("deva losses his father"); }
	 

	
	
	  ///for second scenario
	  
	  @Before(value = "@second", order = 0) public void
	  beforeStepForSecondScenario0() {
	  System.out.println("Dilli needs to be released from jail"); }
	  
	  @After(value = "@second", order = 1) public void
	  afterStepForsecondScenario1() { System.out.println("Adaikalam sees Dilli"); }
	  
	  @After(value = "@second", order = 0) public void
	  afterStepForsecondScenario0() {
	  System.out.println("Adaikalam tells Rolex about Dilli"); }
	  
	  
	  @Before(value = "@second", order = 1) public void
	  beforeStepForSecondScenario1() {
	  System.out.println("Dilli accepted that he knows to drive lorry"); }
	 

}

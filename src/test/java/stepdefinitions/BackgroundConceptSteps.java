package stepdefinitions;



import io.cucumber.java.en.*;

public class BackgroundConceptSteps {
	@Given("the movie start")
	public void the_movie_start() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("--------movie started------------");
	}
	@Given("the movie title populates")
	public void the_movie_title_populates() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("--------24------------");
	}
	@Given("Mani finds the time machine")
	public void mani_finds_the_time_machine() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Mani finds the time machine");
	}
	@When("he uses the machine")
	public void he_uses_the_machine() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("he uses the machine");
	}
	@Then("he faces the problem")
	public void he_faces_the_problem() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("he faces the problem");
	}

	//second scenario
	@Given("hero and friend finds the time machine")
	public void hero_and_friend_finds_the_time_machine() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hero and friend finds the time machine");
	}
	@When("they uses it to make money")
	public void they_uses_it_to_make_money() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("they uses it to make money");
	}
	@Then("they faces the problem")
	public void they_faces_the_problem() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("they faces the problem");
	}
}

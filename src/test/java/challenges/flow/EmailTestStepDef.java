package challenges.flow;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import flow.IAgent;


public class EmailTestStepDef {

	IAgent user;
    EmailApp app = new EmailApp();

		@Given("A User sends an <message> message")
		public void User_Sends_Message() throws Throwable {
			
		}
		@When("The message is converted by the Adapter")
		public void Message_is_converted_by_Adapter() throws Throwable {
			
		}
		@Then("The Message server should contain the <message> message in the queue")
		public void Message_server_should_contain_the_message() throws Throwable {
			
		}
}


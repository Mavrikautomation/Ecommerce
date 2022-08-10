package stepDefinations;
import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Home Loan landing page$")
    public void user_is_on_home_loan_landing_page() throws Throwable {
    	System.out.println("User now on the loanding page");
    }

   @When("^User login into application with \"([^\"]*)\"valid username and password \"([^\"]*)\"$")
        public void user_login_into_application_with_somethingvalid_username_and_password_something(String strArg1, String strArg2) throws Throwable {
	   
            System.out.println(strArg1);
            System.out.println(strArg2);
    	}
   @When("^User login with following details$")
   public void user_login_with_following_details(DataTable data) throws Throwable {
	   List<List<String>> Obj =data.asLists();
	  System.out.println(Obj.get(0).get(0));
	  System.out.println(Obj.get(0).get(1));
	  System.out.println(Obj.get(0).get(2));
	  System.out.println(Obj.get(0).get(3));
	  System.out.println(Obj.get(0).get(4));
	  
   }
   
    
   @When("^User login in to application with (.+) username and password (.+)$")
   public void user_login_in_to_application_with_username_and_password(String username, String password) throws Throwable {
      System.out.println(username);
      System.out.println(password);
       
   }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("User on Home page Now");
        
    }
    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }

}

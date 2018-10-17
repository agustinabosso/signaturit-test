package com.siganturit.steps;

import com.siganturit.pages.*;

import org.jbehave.core.annotations.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FacebookSteps {
    private FacebookPage page;

    public FacebookSteps(FacebookPage facebookPage){
        this.page = facebookPage;
    }

    @Given("I am on Facebook.com")
    public void goToPage() {
        page.go();
    }

    @When("I login using following username $username and password $password")
    public void login(String username, String password) {
        page.loginWithValidCredentials(username, password);
    }

    @When("I post $comment comment")
    public void postComment(String comment) throws Exception{
        page.writeAndPostComment(comment);
    }

    @Then("I validate the login was successful")
    public void validateLoginSuccessful() {
        assertTrue(page.getUserName().isDisplayed());
    }

    @Then("I validate $comment comment was successfully posted")
    public void validateCommentPosted(String comment) {
        assertEquals(comment, page.getComments().get(0).getText());
    }
}

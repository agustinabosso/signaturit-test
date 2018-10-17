package com.siganturit.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.*;
import static org.seleniumhq.selenium.fluent.Period.secs;

/**
 * Page object defining the facebook page
 */

public class FacebookPage extends BasePage{
    public static final String FACEBOOK_PAGE_URL = "https://www.facebook.com/";

    private By inputEmail           = id("email");
    private By inputPassword        = id("pass");
    private By loginButton          = id("loginbutton");
    private By userName             = id("userNav");
    private By commentPosted        = cssSelector(".userContentWrapper p");
    private By commentArea          = xpath("//*[@name='xhpc_message']");

    /**
     * Default constructor
     * @param webDriverProvider
     */
    public FacebookPage(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
    }

    @Override
    protected String getPageURL() {
        return FACEBOOK_PAGE_URL;
    }

    public void loginWithValidCredentials(String username, String password) {
        within(secs(5)).input(inputEmail).clearField().sendKeys(username);
        input(inputPassword).clearField().sendKeys(password);
        label(loginButton).click();
    }

    public WebElement getUserName() {
        return findElement(userName);
    }

    public void writeAndPostComment(String comment) throws Exception{
        textarea(commentArea).sendKeys(comment).submit();
        Thread.sleep(10000);
    }

    public List<WebElement> getComments() {
        return findElements(commentPosted);
    }
}

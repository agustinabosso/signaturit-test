package com.siganturit.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import java.util.concurrent.TimeUnit;


public abstract class BasePage extends FluentWebDriverPage {

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public BasePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    /**
     * Maximize the browser and access the previously set URL
     */
    public void go() {
        manage().window().maximize();
        get(getPageURL());
        manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    /**
     * Maximize the browser and access the provided URL
     */
    public void go(String URL) {
        manage().window().maximize();
        get(URL);
        manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    /**
     * Returns the page URL
     *
     * @return
     */
    protected abstract String getPageURL();
}

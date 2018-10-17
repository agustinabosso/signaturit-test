Meta:
@facebook

Narrative:

In order to test login and post functionality
As a facebook user
I want to login with my credentials and post a comment

Scenario: Regular login in Facebook and post a comment

Given I am on Facebook.com
When I login using following username agustinabosso7@gmail.com and password olapic123
Then I validate the login was successful
When I post Hello word comment
Then I validate Hello word comment was successfully posted
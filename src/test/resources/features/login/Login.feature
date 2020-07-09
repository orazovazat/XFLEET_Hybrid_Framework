@VY1-75
Feature: User should be able to login

  	@storemanager
	Scenario: Log in as a store manager
		Given user is on landing page
		Then user logs in as store manager
		And user verifies that "Dashboard" page name is displayed
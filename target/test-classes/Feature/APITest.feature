Feature: Test API status and total number of currencies

Scenario: Validate HTTP status and response
	Given open the endpoint url
	When validate HTTP status code
	Then get and validate currency
	
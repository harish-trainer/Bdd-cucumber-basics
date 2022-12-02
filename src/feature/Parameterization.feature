@Parameterization
Feature: To explain the diffrent types of Parameterization

@passing_values_from_step
Scenario: To show case passing values from step

Given user login to orangehrmlive url
When he enters the user name as "Admin" and password as "Admin12345"
Then he sees the error message

#-----------------------------------------------------------------------------------------

@passing_values_from_examples
Scenario Outline: To show case passing values from step

Given user login to orangehrmlive url
When he enters the user name as "<user name>" and password as "<password>"

@valid_credentials
Examples:
| user name | password	|
| Admin			|	admin123	|

@invalid_credentials
Examples:
| user name | password	|
| admin			|	admin			|

#You can notice that there can be many examples and each examples can contain many lines
#the tag name in Examples Line 21(eg. user name) should be same in step Line 17(eg. user name).
#tags can be feature level, scenario level, example level.
#-----------------------------------------------------------------------------------------

@data_table_without_header
Scenario: To show case data table without header

Given user login to orangehrmlive url
When he enters the following user name
	|			username1		|
	|	    username2		|
	|			username3		|	  
	|     username4		|
	
#-----------------------------------------------------------------------------------------

@data_table_with_header	
Scenario: To show case data table with header

Given user login to orangehrmlive url
When he enters the following credentials
	|		user name	|		password		|
	|			wrong		|	   passw			|
	|			USER		|	   bix				|
Then he sees the error message
	
#-----------------------------------------------------------------------------------------
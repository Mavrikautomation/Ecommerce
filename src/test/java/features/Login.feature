Feature: Application Login

@SmockTest
Scenario: Home Page default login
Given User is on Home Loan landing page
When User login into application with "ABCDF"valid username and password "12345"
Then Home page is populated
And Cards are displayed "true"

@SmockTest
Scenario: Home Page default login
Given User is on Home Loan landing page
When User login into application with "GHIJK"valid username and password "678910"
Then Home page is populated
And Cards are displayed "false"
@SmockTest
Scenario: Home Page default login
Given User is on Home Loan landing page
When User login with following details
| jenny | abcd | John@abc.com | Australia | 2345432 |
Then Home page is populated
And Cards are displayed "false"
@RegTest
Scenario Outline: Home Page default login
Given User is on Home Loan landing page
When User login in to application with <Username> username and password <Password>
Then Home page is populated
And Cards are displayed "false"

Examples:
|Username|Password|
|user1   |Pass1   |
|user2   |Pass2   |
|user3   |Pass3   |


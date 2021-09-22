Feature: login into commerce site

  Scenario: User login into commerce site
    Given user navigates the commerce site having tittle
    Then user validates the page "Your store. Login"
    And user enter the usserid as "admin@yourstore.com" and password as "admin"
    And user clicks on login button
    Then user should be navigated to dashboard page "Dashboard / nopCommerce administration"

    Scenario Outline: User login into commerce site with different id's
      Given user navigates the commerce site having tittle
      Then user validates the page "Your store. Login"
      And enters following login details
        | username | <email> |
        | password | <pass>  |
      And user clicks on login button
      Examples:
        | email               | pass  |
        | admin@yourstore.com | admin |
        | admin12@yourstore.com | admin1 |

  Scenario: Add new customer
    Given user navigates the commerce site having tittle
    Then user validates the page "Your store. Login"
    And user enter the usserid as "admin@yourstore.com" and password as "admin"
    And user clicks on login button
    Then user should be navigated to dashboard page "Dashboard / nopCommerce administration"
    When user clicks on customer main menu
    And user clicks on customers option
   Then user should navigate to customer page "Customers / nopCommerce administration"
    When user clicks on Add new Button
   Then user should navigate to addnew customer page "Add a new customer / nopCommerce administration"
    When user enter the new customers details
    And Click on save button
    Then user should validate the message "The new customer has been added successfully"

    Scenario: Search customer by emailid
      Given user navigates the commerce site having tittle
      Then user validates the page "Your store. Login"
      And user enter the usserid as "admin@yourstore.com" and password as "admin"
      And user clicks on login button
      Then user should be navigated to dashboard page "Dashboard / nopCommerce administration"
      When user clicks on customer main menu
      And user clicks on customers option
      Then user should navigate to customer page "Customers / nopCommerce administration"
      When user enters email id in emailid feild "victoria_victoria@nopCommerce.com"
      And  user click on search button
      Then user search the customeremail id in customer table

      Scenario: Search customer by name
        Given user navigates the commerce site having tittle
        Then user validates the page "Your store. Login"
        And user enter the usserid as "admin@yourstore.com" and password as "admin"
        And user clicks on login button
        Then user should be navigated to dashboard page "Dashboard / nopCommerce administration"
        When user clicks on customer main menu
        And user clicks on customers option
        Then user should navigate to customer page "Customers / nopCommerce administration"
        When user enters first name
        And user enter last name
        And  user click on search button
        Then user validate the customer name in customer table


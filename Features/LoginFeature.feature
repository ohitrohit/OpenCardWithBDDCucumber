Feature: Login

Scenario: Successfully Login with valid Credentials
     Given User Launch Chrome browser
     When User Open URL "https://admin-demo.nopcommerce.com/login"
     And User entered Email as "admin@yourstore.com" and Password as "admin"
     And Click on Login
     Then Page title should be "Dashboard / nopcommerce administeration"
     When User Click on Log out link
     Then Page title should be "Your store. Login"
     And Close broswer
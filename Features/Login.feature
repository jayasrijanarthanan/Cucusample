Feature: Facebook
Scenario: Login Credentials
Given BrowserLaunch
Given Open the URL "https://admin-demo.nopcommerce.com/"
When Enter Username "admin@yourstore.com"
When Enter Password "admin"
Then Click
Then Login Successfully

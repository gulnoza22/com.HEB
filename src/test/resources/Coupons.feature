Feature: Automating digital coupons
@coupons
Scenario: Testing digital coupons
Given the user is on home page and clicks on login button
When the user logs in with email "akodirov@harmonytx.org" and password "e1n9v7a9r" 
Then the user should verify if user name is displayed on home page and clicks on coupons link 
When the user clicks Select Digital Coupons button from Coupons page
Then the user should click on all select coupon buttons on Digital Coupons page


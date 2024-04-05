Feature: Swaglab postive functionality of product
Scenario: Verify the product with id 

Given Enter the username
And Enter the password
When click the login button
And Choose the product item 
And click add to cart
And Click cart icon
And Click the Checkout button
And Enter the Firstname
And Enter the Lastname
And Enter the pincode
And Click continue
Then Verify the sauce card number and print in the console

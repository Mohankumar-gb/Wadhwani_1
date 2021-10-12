Feature: Login cucumber

@tags
Scenario Outline: Login Functionality with valid credentials
Given Student is on the Learnwise Login Page
When Student should enter valid "<username>" 
And Student should select next Button
Then Student should verify success message
Examples:
|username|
|admin@admin.com|

@tags2
Scenario Outline: Check next button is enabled or not
Given Student is on the Learnwise Login Page
When Student should not enter any mail id "<username>" 
And Student should check next button is enabled
Then Student should verify its enabled or not
Examples:
|username|
||

@tags3
Scenario Outline: Login Functionality with invalid credentials
Given Student is on the Learnwise Login Page
When Student should enter invalid "<username>" 
Then Student should verify get accept message
Examples:
|username|
|file123@gmail.com|

@tags4
Scenario Outline: Login Functionality with valid credentials
Given Student is on the Learnwise Login Page
When Student should enter the valid email"<username>" 
And Student should select the next Button
Then Student should enter the valid password "<passkey>"
Then Should should verify passkey successfully entered
Examples:
|username|passkey|      
|admin@admin.com|admin|
@tags5
Scenario Outline: New password with uppercase letter
Given Student is on the Learnwise Login Page
When Student should enter  valid email"<username>" 
And Student should select  next Button
Then Student should enter  valid  uppercase password "<passkey>"
Then Should should verify uppercase passkey successfully entered
Examples:
|username|passkey|      
|admin@admin.com|ADMIN|


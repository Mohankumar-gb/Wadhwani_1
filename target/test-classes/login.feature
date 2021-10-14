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
@tags6
Scenario Outline: New password with uppercase letter 
Given Student is on the Learnwise Login Page
When Student should enter a valid email"<username>" 
And Student should select a next Button
Then Student should enter  the valid lowercase and uppercase password "<passkey>"
Then Student should verify the lowercase and uppercase passkey successfully entered
Examples:
|username|passkey|      
|admin@admin.com|AdmiN|
@tags7
Scenario Outline: New password with the combination of alphabets,special characters and digits as new password
Given Student is on the Learnwise Login Page
When Student should enter an valid email"<username>" 
And Student should select an next Button
Then Student should enter  a valid lowercase and uppercase password with special characters and digits "<passkey>"
Then Student should verify a alphabets,special characters and digits successfully entered
Examples:
|username|passkey|      
|admin@admin.com|adm12@#|
@tags8
Scenario Outline: Login page with text in confirm password
Given Student is on the Learnwise Login Page
When Student should enter  an valid email"<username>" 
And Student should select an  next Button
Then Student should enter  valid   password "<password>"
Then Student should verify  password successfully entered
Examples:
|username|password|      
|admin@admin.com|admin|
@tags9
Scenario Outline: Confirm password with lowercase letter
Given Student is on the Learnwise Login Page
When Student should enter  a valid email"<username>" 
And Student should select a  next Button
Then Student should enter  valid   password with lowercase letter "<password>"
Then Student should verify  password with lowercase letter successfully entered
Examples:
|username|password|      
|admin@admin.com|admin|
@tags10
Scenario Outline: Confirm password with lowercase letter and uppercase letter
Given Student is on the Learnwise Login Page
When Student should enter  a valid email"<username>" 
And Student should select a next Button
Then Student should enter  valid   password with lowercase letter and uppercase letter"<password>"
Then Student should verify  password with lowercase letter and uppercase letter successfully entered
Examples:
|username|password|      
|admin@admin.com|AdmiN|
@tags11
Scenario Outline: Confirm password with alphabets,digits and special characters
Given Student is on the Learnwise Login Page
When Student should enter  a valid email"<username>" 
And Student should select a next Button
Then Student should enter  valid   password with alphabets,digits and special characters"<password>"
Then Student should verify  password with alphabets,digits and special characters successfully entered
Examples:
|username|password|      
|admin@admin.com|Admin12#|
@tags12
Scenario Outline: Login Functionality with valid credentials and tick the EULA checkbox
Given Student is on the Learnwise Login Page
When Student should enter the valid email"<username>" 
And Student should select the next Button
And Student should enter the Institution code"<code>"
And Student should renter the valid email"<username>"
Then Student should enter the valid password "<passkey>"
Then Student should enter the valid confirm password "<password>"
Then Student should select the language
Then Student should tick the Eula checkbox

Then Should should verify  successfully entered
Examples:
|username|code|username|passkey|password|     
|rushikore@gmail.com|QAPI5260|rushikore@gmail.com|admin|admin|
@tags13
Scenario Outline: Login Functionality with valid credentials and tick the EULA checkbox
Given Student is on the Learnwise Login Page
When Student should enter an valid email"<username>" 
And Student should select an next Button
And Student should enter an Institution code"<code>"
And Student should renter an valid email"<username>"
Then Student should enter an valid password "<passkey>"
Then Student should enter an valid confirm password "<password>"
Then Student should select an language
Then Student should tick an Eula checkbox
Then Student should click an Eula hyperlink
Then Should should verify its successfully entered
Examples:
|username|code|username|passkey|password|     
|rushikore@gmail.com|QAPI5260|rushikore@gmail.com|admin|admin|
@tags14
Scenario Outline: Signin button not enabled without entering three fields
Given Student is on the Learnwise Login Page
When Student should enter the valid email"<username>" 
And Student should select the next Button
And Student should enter  Institution code"<code>"
And Student should renter  valid email"<username>"
Then Student should enter  valid password "<passkey>"
Then Student should enter  valid confirm password "<password>"
Then Student should select  language
Then Student should tick  Eula checkbox
Then Student should click Eula hyperlink
Then Should should verify its not  enabled
Examples:
|username|code|username|passkey|password|     
|wadhwaani@gmail.com|QAPI5260|||admin|
@tags15
Scenario Outline: Random password with error message
Given Student is on the Learnwise Login Page
When Student should enter an valid email"<username>" 
And Student should select an next Button
And Student should enter an Institution code"<code>"
And Student should renter an valid email"<username>"
Then Student should enter an valid password "<passkey>"
Then Student should enter an valid confirm password "<password>"
Then Student should select an language
Then Student should tick an Eula checkbox
Then Student should click an Eula hyperlink
Then Should should verify its show error message
Examples:
|username|code|username|passkey|password|     
|wadhwaani@gmail.com|QAPI5260|rushikore@gmail.com|adm12|admin|
@tags16
Scenario Outline: Signin button is not enabled withouttick the checkbox
Given Student is on the Learnwise Login Page
When Student should enter an valid email"<username>" 
And Student should select an next Button
And Student should enter an Institution code"<code>"
And Student should renter an valid email"<username>"
Then Student should enter an valid password "<passkey>"
Then Student should enter an valid confirm password "<password>"
Then Student should select an language
Then Student should click an Eula hyperlink
Then Should should verify its not enabled without tick the checkbox
Examples:
|username|code|username|passkey|password|     
|wadhwaani@gmail.com|QAPI5260|rushikore@gmail.com|adm12|admin|
@tags17
Scenario Outline: Login Functionality with valid credentials
Given Faculty is on the Learnwise Login Page
When Faculty should enter valid "<username>" 
Then Faculty should verify success message
Examples:
|username|
|qapital.faculty@yopmail.com|
@tags18
Scenario Outline: Login Functionality with invalid credentials
Given Faculty is on the Learnwise Login Page
When Faculty should enter invalid "<username>" 
Then Faculty should verify its enter success message
Examples:
|username|
|qapital.com|
@tags19
Scenario Outline: Login Functionality with invalid password
Given Faculty is on the Learnwise Login Page
When Faculty should enter invalid "<username>"
And Faculty should click next Button
Then Faculty should enter the invalid password"<password>"
Then Faculty should verify its  success message
Examples:
|username|password|
|qapital.faculty@yopmail.com|1234|


@tags20
Scenario Outline: Login Functionality with invalid password
Given Faculty is on the Learnwise Login Page
When Faculty should enter invalid "<username>"
And Faculty should click next Button
Then Faculty should enter the invalid password"<password>"
And Faculty should click the Sign in Button
Then Faculty should verify its  success message
Examples:
|username|password|
|qapital.faculty@yopmail.com|1234|


@tags21
Scenario Outline: Forgot password is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty click the forgot password"<forgot password>"
Then Faculty should verify its successfully click 
Examples:
|username|      
|qapital.faculty@yopmail.com|





















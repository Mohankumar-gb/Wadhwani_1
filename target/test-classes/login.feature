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
|admin@admin.com|QAPI5260|admin@admin.com|admin|admin|
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
|admin@admin.com|QAPI5260|admin@admin.com|admin|admin|
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



@tags22
Scenario Outline: Signin button is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty enter the password"<password>"
Then Faculty click on signin button
Then Faculty should verify  successfully click 
Examples:
|username|password|   
|qapital.faculty@yopmail.com|Pass@123|

@tags23
Scenario Outline: Dashboard is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty enter the password"<password>"
Then Faculty click on signin button
Then click on dashboard Button
Then Faculty should verify  dashboard successfully click 
Examples:
|username|password|   
|qapital.faculty@yopmail.com|Pass@123|
@tags24
Scenario Outline: Index is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty enter the password"<password>"
Then Faculty click on signin button
Then click on dashboard Button
Then Faculty should click on index Button
Then Faculty should verify index successfully click 
Examples:
|username|password|   
|qapital.faculty@yopmail.com|Pass@123|
@tags25
Scenario Outline: Resume is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty enter the password"<password>"
Then Faculty click on signin button
Then click on dashboard Button
Then Faculty should click on Resume Button
Then Faculty should verify resume successfully click 
Examples:
|username|password|   
|qapital.faculty@yopmail.com|Pass@123|
@tags26
Scenario Outline: course plan is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty enter the password"<password>"
Then Faculty click on signin button
Then click on dashboard Button
Then Faculty should click on course plan Button
Then Faculty should verify course plan successfully click 
Examples:
|username|password|   
|qapital.faculty@yopmail.com|Pass@123|
@tags27
Scenario Outline: other course is click or not
Given Faculty is on the Learnwise Login Page
When Faculty should enter an valid email"<username>" 
And Faculty click the next Button
Then Faculty enter the password"<password>"
Then Faculty click on signin button
Then click on dashboard Button
Then Faculty should click on other course Button
Then Faculty should verify other course  successfully click 
Examples:
|username|password|   
|qapital.faculty@yopmail.com|Pass@123|


@tags28
Scenario Outline: Login Functionality with valid credentials
Given Faculty is on the Learnwise Login Page
When Faculty should enter valid "<username>" 
And Faculty should select next Button
Then Faculty should verify an success message
Examples:
|username|
|subham@gmail.com|

@tags29
Scenario Outline: Check next button is enabled or not
Given faculty is on the Learnwise Login Page
When faculty should not enter any mail id "<username>" 
And faculty should check next button is enabled
Then faculty should verify its enabled or not
Examples:
|username|
||

@tags30
Scenario Outline: Login Functionality with invalid credentials
Given faculty is on the Learnwise Login Page
When faculty should enter invalid "<username>" 
Then faculty should verify get accept message
Examples:
|username|
|file123@gmail.com|

@tags31
Scenario Outline: Login Functionality with valid credentials
Given faculty is on the Learnwise Login Page
When faculty should enter the valid email"<username>" 
And faculty should select the next Button
Then faculty should enter the valid password "<passkey>"
Then faculty should verify passkey successfully entered
Examples:
|username|passkey|      
|subham@gmail.com|pass|
@tags32
Scenario Outline: Login Functionality with the valid credentials
Given Student is on the Learnwise Login Page
When Student should enter an valid email"<username>" 
And Student should select an next Button
Then Student should enter an valid password "<passkey>"
Then Student should verify password successfully entered
Examples:
|username|passkey|      
|rushikore@gmail.com|pass|
@tags33
Scenario Outline: Course button is click or not
Given Student is on the Learnwise staging Login Page
When Student should enter an valid email"<username>" 
And Student click the next Button
Then student enter the password"<password>"
Then Student click the signin Button
Then Student click the  course Button
Then Student should verify its course button successfully click 
Examples:
|username|password|      
| samya@gmail.com|pass|

@tags34
Scenario Outline: Join button is click or not without entering batchid
Given Student is on the Learnwise staging Login Page
When Student should enter an valid email"<username>" 
And Student click the next Button
Then student enter the password"<password>"
Then Student click the signin Button
Then Student click the  course Button
Then Student click join Button
Then Student should verify its join button successfully click 
Examples:
|username|password|      
| samya@gmail.com|pass|
@tags35
Scenario Outline: Join button is click or not with entering batchid
Given Student is on the Learnwise staging Login Page
When Student should enter an valid email"<username>" 
And Student click the next Button
Then student enter the password"<password>"
Then Student click the signin Button
Then Student click the  course Button
Then Student enter the batch id"<id>"
Then Student click join Button
Then Student should verify its join button successfully click ornot
Examples:
|username|password|id|      
| samya@gmail.com|pass|1234|
@tags36
Scenario Outline: Join button is click or not with entering batchid
Given Student is on the Learnwise staging Login Page
When Student should enter an valid email"<username>" 
And Student click the next Button
Then student enter the password"<password>"
Then Student click the signin Button
Then Student click the  course Button
Then Student enter the batch id"<id>"
Then Student click an join Button
Then Student should verify its join button  click ornot
Examples:
|username|password|id|      
| samya@gmail.com|pass|1234|

















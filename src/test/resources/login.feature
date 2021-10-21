Feature: Login cucumber

  @tag
  Scenario Outline: Login Functionality with valid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    And Student should select next Button
    Then Student should verify success message

    Examples: 
      | username        |
      | admin@admin.com |

  @tag2
  Scenario Outline: Check next button is enabled or not
    Given Student is on the Learnwise Login Page
    When Student should not enter any mail id "<username>"
    And Student should check next button is enabled
    Then Student should verify its enabled or not

    Examples: 
      | username |
      |          |

  @tag3
  Scenario Outline: Login Functionality with invalid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter invalid "<username>"
    Then Student should verify get accept message

    Examples: 
      | username          |
      | file123@gmail.com |

  @tag4
  Scenario Outline: Login Functionality with valid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter the valid email"<username>"
    And Student should select the next Button
    Then Student should enter the valid password "<passkey>"
    Then Should should verify passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | admin   |

  @tag5
  Scenario Outline: New password with uppercase letter
    Given Student is on the Learnwise Login Page
    When Student should enter  valid email"<username>"
    And Student should select  next Button
    Then Student should enter  valid  uppercase password "<passkey>"
    Then Should should verify uppercase passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | ADMIN   |

  @tag6
  Scenario Outline: New password with uppercase letter
    Given Student is on the Learnwise Login Page
    When Student should enter a valid email"<username>"
    And Student should select a next Button
    Then Student should enter  the valid lowercase and uppercase password "<passkey>"
    Then Student should verify the lowercase and uppercase passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | AdmiN   |

  @tag7
  Scenario Outline: New password with the combination of alphabets,special characters and digits as new password
    Given Student is on the Learnwise Login Page
    When Student should enter an valid email"<username>"
    And Student should select an next Button
    Then Student should enter  a valid lowercase and uppercase password with special characters and digits "<passkey>"
    Then Student should verify a alphabets,special characters and digits successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | adm12@# |

  @tag8
  Scenario Outline: Login page with text in confirm password
    Given Student is on the Learnwise Login Page
    When Student should enter  an valid email"<username>"
    And Student should select an  next Button
    Then Student should enter  valid   password "<password>"
    Then Student should verify  password successfully entered

    Examples: 
      | username        | password |
      | admin@admin.com | admin    |

  @tag9
  Scenario Outline: Confirm password with lowercase letter
    Given Student is on the Learnwise Login Page
    When Student should enter  a valid email"<username>"
    And Student should select a  next Button
    Then Student should enter  valid   password with lowercase letter "<password>"
    Then Student should verify  password with lowercase letter successfully entered

    Examples: 
      | username        | password |
      | admin@admin.com | admin    |

  @tag10
  Scenario Outline: Confirm password with lowercase letter and uppercase letter
    Given Student is on the Learnwise Login Page
    When Student should enter  a valid email"<username>"
    And Student should select a next Button
    Then Student should enter  valid   password with lowercase letter and uppercase letter"<password>"
    Then Student should verify  password with lowercase letter and uppercase letter successfully entered

    Examples: 
      | username        | password |
      | admin@admin.com | AdmiN    |

  @tag11
  Scenario Outline: Confirm password with alphabets,digits and special characters
    Given Student is on the Learnwise Login Page
    When Student should enter  a valid email"<username>"
    And Student should select a next Button
    Then Student should enter  valid   password with alphabets,digits and special characters"<password>"
    Then Student should verify  password with alphabets,digits and special characters successfully entered

    Examples: 
      | username        | password |
      | admin@admin.com | Admin12# |

  @tag12
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
      | username        | code     | username        | passkey | password |
      | admin@admin.com | QAPI5260 | admin@admin.com | admin   | admin    |

  @tag13
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
      | username        | code     | username        | passkey | password |
      | admin@admin.com | QAPI5260 | admin@admin.com | admin   | admin    |

  @tag14
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
      | username            | code     | username | passkey | password |
      | wadhwaani@gmail.com | QAPI5260 |          |         | admin    |

  @tag15
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
      | username            | code     | username            | passkey | password |
      | wadhwaani@gmail.com | QAPI5260 | rushikore@gmail.com | adm12   | admin    |

  @tag16
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
      | username            | code     | username            | passkey | password |
      | wadhwaani@gmail.com | QAPI5260 | rushikore@gmail.com | adm12   | admin    |

  @tag17
  Scenario Outline: Login Functionality with valid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter valid "<username>"
    Then Faculty should verify success message

    Examples: 
      | username                    |
      | qapital.faculty@yopmail.com |

  @tag18
  Scenario Outline: Login Functionality with invalid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    Then Faculty should verify its enter success message

    Examples: 
      | username    |
      | qapital.com |

  @tag19
  Scenario Outline: Login Functionality with invalid password
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    And Faculty should click next Button
    Then Faculty should enter the invalid password"<password>"
    Then Faculty should verify its  success message

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com |     1234 |

  @tag20
  Scenario Outline: Login Functionality with invalid password
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    And Faculty should click next Button
    Then Faculty should enter the invalid password"<password>"
    And Faculty should click the Sign in Button
    Then Faculty should verify its  success message

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com |     1234 |

  @tag21
  Scenario Outline: Forgot password is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty click the forgot password"<forgot password>"
    Then Faculty should verify its successfully click

    Examples: 
      | username                    |
      | qapital.faculty@yopmail.com |

  @tag22
  Scenario Outline: Signin button is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then Faculty should verify  successfully click

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag23
  Scenario Outline: Dashboard is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then click on dashboard Button
    Then Faculty should verify  dashboard successfully click

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag24
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
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag25
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
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag26
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
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag27
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
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag28
  Scenario Outline: Login Functionality with valid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter valid "<username>"
    And Faculty should select next Button
    Then Faculty should verify an success message

    Examples: 
      | username         |
      | subham@gmail.com |

  @tag29
  Scenario Outline: Check next button is enabled or not
    Given faculty is on the Learnwise Login Page
    When faculty should not enter any mail id "<username>"
    And faculty should check next button is enabled
    Then faculty should verify its enabled or not

    Examples: 
      | username |
      |          |

  @tag30
  Scenario Outline: Login Functionality with invalid credentials
    Given faculty is on the Learnwise Login Page
    When faculty should enter invalid "<username>"
    Then faculty should verify get accept message

    Examples: 
      | username          |
      | file123@gmail.com |

  @tag31
  Scenario Outline: Login Functionality with valid credentials
    Given faculty is on the Learnwise Login Page
    When faculty should enter the valid email"<username>"
    And faculty should select the next Button
    Then faculty should enter the valid password "<passkey>"
    Then faculty should verify passkey successfully entered

    Examples: 
      | username         | passkey |
      | subham@gmail.com | pass    |

  @tag32
  Scenario Outline: Login Functionality with the valid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter an valid email"<username>"
    And Student should select an next Button
    Then Student should enter an valid password "<passkey>"
    Then Student should verify password successfully entered

    Examples: 
      | username            | passkey |
      | rushikore@gmail.com | pass    |

  @tag33
  Scenario Outline: Course button is click or not
    Given Student is on the Learnwise staging Login Page
    When Student should enter an valid email"<username>"
    And Student click the next Button
    Then student enter the password"<password>"
    Then Student click the signin Button
    Then Student click the  course Button
    Then Student should verify its course button successfully click

    Examples: 
      | username        | password |
      | samya@gmail.com | pass     |

  @tag34
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
      | username        | password |
      | samya@gmail.com | pass     |

  @tag35
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
      | username        | password | id   |
      | samya@gmail.com | pass     | 1234 |

  @tag36
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
      | username        | password | id   |
      | samya@gmail.com | pass     | 1234 |

  @tag37
  Scenario Outline: Check next button is enabled or not
    Given Student is on the Learnwise Login Page
    When Student should not enter any mail id "<username>"
    And Student should check next button is enabled
    Then Student should verify its enabled or not

    Examples: 
      | username |
      |          |

  @tag38
  Scenario Outline: Login Functionality with invalid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter invalid "<username>"
    Then Student should verify get accept message

    Examples: 
      | username          |
      | file123@gmail.com |

  @tag39
  Scenario Outline: Login Functionality with valid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter the valid email"<username>"
    And Student should select the next Button
    Then Student should enter the valid password "<passkey>"
    Then Should should verify passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | admin   |

  @tag40
  Scenario Outline: New password with uppercase letter
    Given Student is on the Learnwise Login Page
    When Student should enter  valid email"<username>"
    And Student should select  next Button
    Then Student should enter  valid  uppercase password "<passkey>"
    Then Should should verify uppercase passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | ADMIN   |

  @tag41
  Scenario: Joining courses
    Given User should be in home page
    When User should click on course
    Then User should start the course

  @tag42
  Scenario: Click on create Batch
    Given User should be in couRse
    When User should click on courses
    Then User should able to Create A Batch

  @tag43
  Scenario: Entering Batch Details
    Given Be in course page
    When click on create batch
    Then Enter details to create batch

  @tag44
  Scenario: Copy Batch Details
    Given User should be in home page on course
    When User should click Create BATCH
    Then Click on copy batch

  @tag45
  Scenario: Enter copy batch details
    Given User should be in course page
    When User should click Copy BATCH
    Then Enter Batch deTails

  @tag46
  Scenario: Clicking on Start Course
    Given User should be in coursepage
    When User should click on Start course
    Then User should see coursedetails

  @tag47
  Scenario: Changing Batch
    Given User should be in course details page
    When User should see the batch names in dropdown options
    Then User should select other batch

  @tag48
  Scenario: Faculty should give mock test
    Given Faculty should be in courses details
    When click on mock test
    Then click on play button

  @tag49
  Scenario: Faculty should take Quizzes
    Given Faculty should be in Quizzes page
    When Faculty should click on quizzes
    Then Faculty should able see the quizzes

  @tag50
  Scenario: Faculty taking Quizzes
    Given Faculty should be in Quizzespage
    When Faculty should click Quizzes
    Then Faculty should click on take quizzes

  @tag51
  Scenario: Faculty should view quizz results
    Given Faculty should be in Quizz page
    When Faculty should should take Quizz
    Then Faculty should click on view quizz Results

  @tag52
  Scenario: Faculty should take quizz
    Given Faculty should attempt Quizz
    When Faculty should take quizz
    Then Faculty should click on submit

  @tag53
  Scenario: Verify Faculty should view Practice Venture
    Given Faculty  dhould bein Quizzes
    When Faculty should see th Practice Venture
    Then Faculty should click on Practice Venture

  @tag54
  Scenario: Verify Faculty should view PV Milestones
    Given Faculty is in Quizzes
    When Faculty should see th PV Milestones
    Then Faculty should click on PV Milestones

  @tag55
  Scenario: Verify Faculty should click on faculty notes
    Given Faculty is in Quizzes Module
    When Faculty should see th Faculty Notes
    Then Faculty should click on Faculty Notes

  @tag56
  Scenario: Verify Faculty should see the lessons
    Given Faculty should be in QuizzesModule
    When Faculty should see the lessons
    Then Faculty should click on lessons

  @tag57
  Scenario: Verify Faculty should click on report tab
    Given Faculty should login To thePage
    When Faculty should see the report module
    Then Faculty should click on Report Module

  @tag58
  Scenario: Verify Faculty should click on Notification icon
    Given Faculty should login
    When Faculty should see the Notification icon
    Then Faculty should click onNotification icon

  @tag59
  Scenario: Faculty should take quizz again
    Given Faculty should attempt Quizz again
    When Faculty should take quizz again
    Then Faculty should Re-attempt quizz

  @tag60
  Scenario: Faculty should be in teaching mode
    Given Faculty should be inCoursE
    When Faculty should click on START COURSe
    Then Faculty should click on teaching

  @tag61
  Scenario: Faculty should be in Manage Batches
    Given Faculty is inCoursE
    When Faculty should see the Manage Batches
    Then Faculty should click on Manage Batches

  @tag62
  Scenario: Faculty should EDIT Manage Batches
    Given Faculty Should Be inCoursEPage
    When Faculty should see the edit symbol Manage Batches
    Then Faculty should click onedit symbol Manage Batches

  @tag63
  Scenario: Faculty should be in Chat box Manage Batches
    Given Faculty is inCoursEPage
    When Faculty should see the Chat box
    Then Faculty should click on Chat box

  @tag64
  Scenario: Faculty should be in Manage Students
    Given Faculty is ManageBATches
    When Faculty should see the Manage Students
    Then Faculty should click on Manage Students

  @tag65
  Scenario: Faculty should be in Run lessons
    Given Facultyis in CoursE page
    When Faculty should see the Run lessons
    Then Faculty should click on Run lessons

  @tag66
  Scenario: Faculty should be in No Upcoming Module
    Given Faculty view CoursE pages
    When Faculty should see the No Upcoming Module
    Then Faculty should click on No Upcoming Module

  @tag67
  Scenario: Faculty should Close Batch
    Given Faculty should be in active batches (Manage Batches) page
    When Faculty should see the Close Batch
    Then Faculty should click on Close Batch

  @tag68
  Scenario: Faculty should ReOpen batch
    Given Faculty should be in active batches
    When Faculty should see the ReOpen batch
    Then Faculty should click on ReOpen batch

  @tag69
  Scenario: Faculty should share his thoughts through chat
    Given Faculty should be in ACtiveBatches
    When Faculty should see chatIcon
    Then Faculty should click on  chat icon and share his thoughts

  @tag70
  Scenario: Faculty should send his thoughts
    Given Faculty is in ActiveBatches page
    When Faculty should see the CHatBox
    Then Faculty should click on send

  @tag71
  Scenario: Faculty should save and submit quizz
    Given Faculty should view quizz
    When Faculty should see the Save and continue
    Then Faculty should click save and submit

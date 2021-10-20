Feature: Login cucumber

  @tags
  Scenario Outline: Login Functionality with valid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    And Student should select next Button
    Then Student should verify success message

    Examples: 
      | username        |
      | admin@admin.com |

  @tags2
  Scenario Outline: Check next button is enabled or not
    Given Student is on the Learnwise Login Page
    When Student should not enter any mail id "<username>"
    And Student should check next button is enabled
    Then Student should verify its enabled or not

    Examples: 
      | username |
      |          |

  @tags3
  Scenario Outline: Login Functionality with invalid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter invalid "<username>"
    Then Student should verify get accept message

    Examples: 
      | username          |
      | file123@gmail.com |

  @tags4
  Scenario Outline: Login Functionality with valid credentials
    Given Student is on the Learnwise Login Page
    When Student should enter the valid email"<username>"
    And Student should select the next Button
    Then Student should enter the valid password "<passkey>"
    Then Should should verify passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | admin   |

  @tags5
  Scenario Outline: New password with uppercase letter
    Given Student is on the Learnwise Login Page
    When Student should enter  valid email"<username>"
    And Student should select  next Button
    Then Student should enter  valid  uppercase password "<passkey>"
    Then Should should verify uppercase passkey successfully entered

    Examples: 
      | username        | passkey |
      | admin@admin.com | ADMIN   |

  #Courses Module
  @tag6
  Scenario: Joining courses
    Given User should be in home page
    When User should click on course
    Then User should start the course

  @tag7
  Scenario: Click on create Batch
    Given User should be in couRse
    When User should click on courses
    Then User should able to Create A Batch

  @tag8
  Scenario: Entering Batch Details
    Given Be in course page
    When click on create batch
    Then Enter details to create batch

  @tag9
  Scenario: Copy Batch Details
    Given User should be in home page on course
    When User should click Create BATCH
    Then Click on copy batch

  @tag10
  Scenario: Enter copy batch details
    Given User should be in course page
    When User should click Copy BATCH
    Then Enter Batch deTails

  @tag11
  Scenario: Clicking on Start Course
    Given User should be in coursepage
    When User should click on Start course
    Then User should see coursedetails

  @tag12
  Scenario: Changing Batch
    Given User should be in course details page
    When User should see the batch names in dropdown options
    Then User should select other batch

  @tag13
  Scenario: Faculty should give mock test
    Given Faculty should be in courses details
    When click on mock test
    Then click on play button

  @tag14
  Scenario: Faculty should take Quizzes
    Given Faculty should be in Quizzes page
    When Faculty should click on quizzes
    Then Faculty should able see the quizzes

  @tag15
  Scenario: Faculty taking Quizzes
    Given Faculty should be in Quizzespage
    When Faculty should click Quizzes
    Then Faculty should click on take quizzes

  @tag16
  Scenario: Faculty should view quizz results
    Given Faculty should be in Quizz page
    When Faculty should should take Quizz
    Then Faculty should click on view quizz Results

  @tag17
  Scenario: Faculty should take quizz
    Given Faculty should attempt Quizz
    When Faculty should take quizz
    Then Faculty should click on submit

  @tag18
  Scenario: Verify Faculty should view Practice Venture
    Given Faculty  dhould bein Quizzes
    When Faculty should see th Practice Venture
    Then Faculty should click on Practice Venture

  @tag19
  Scenario: Verify Faculty should view PV Milestones
    Given Faculty is in Quizzes
    When Faculty should see th PV Milestones
    Then Faculty should click on PV Milestones

  @tag20
  Scenario: Verify Faculty should click on faculty notes
    Given Faculty is in Quizzes Module
    When Faculty should see th Faculty Notes
    Then Faculty should click on Faculty Notes

  @tag21
  Scenario: Verify Faculty should see the lessons
    Given Faculty should be in QuizzesModule
    When Faculty should see the lessons
    Then Faculty should click on lessons

  @tag22
  Scenario: Verify Faculty should click on report tab
    Given Faculty should login To thePage
    When Faculty should see the report module
    Then Faculty should click on Report Module

  @tag23
  Scenario: Verify Faculty should click on Notification icon
    Given Faculty should login
    When Faculty should see the Notification icon
    Then Faculty should click onNotification icon

  @tag24
  Scenario: Faculty should take quizz again
    Given Faculty should attempt Quizz again
    When Faculty should take quizz again
    Then Faculty should Re-attempt quizz

  @tag25
  Scenario: Faculty should be in teaching mode
    Given Faculty should be inCoursE
    When Faculty should click on START COURSe
    Then Faculty should click on teaching

  @tag26
  Scenario: Faculty should be in Manage Batches
    Given Faculty is inCoursE
    When Faculty should see the Manage Batches
    Then Faculty should click on Manage Batches

  @tag27
  Scenario: Faculty should EDIT Manage Batches
    Given Faculty Should Be inCoursEPage
    When Faculty should see the edit symbol Manage Batches
    Then Faculty should click onedit symbol Manage Batches

  @tag28
  Scenario: Faculty should be in Chat box Manage Batches
    Given Faculty is inCoursEPage
    When Faculty should see the Chat box
    Then Faculty should click on Chat box

  @tag29
  Scenario: Faculty should be in Manage Students
    Given Faculty is ManageBATches
    When Faculty should see the Manage Students
    Then Faculty should click on Manage Students

  @tag30
  Scenario: Faculty should be in Run lessons
    Given Facultyis in CoursE page
    When Faculty should see the Run lessons
    Then Faculty should click on Run lessons

  @tag31
  Scenario: Faculty should be in No Upcoming Module
    Given Faculty view CoursE pages
    When Faculty should see the No Upcoming Module
    Then Faculty should click on No Upcoming Module

  @tag32
  Scenario: Faculty should Close Batch
    Given Faculty should be in active batches (Manage Batches) page
    When Faculty should see the Close Batch
    Then Faculty should click on Close Batch

  @tag33
  Scenario: Faculty should ReOpen batch
    Given Faculty should be in active batches
    When Faculty should see the ReOpen batch
    Then Faculty should click on ReOpen batch

  @tag34
  Scenario: Faculty should share his thoughts through chat
    Given Faculty should be in ACtiveBatches
    When Faculty should see chatIcon
    Then Faculty should click on  chat icon and share his thoughts

  @tag35
  Scenario: Faculty should send his thoughts
    Given Faculty is in ActiveBatches page
    When Faculty should see the CHatBox
    Then Faculty should click on send

  @tag36
  Scenario: Faculty should save and submit quizz
    Given Faculty should view quizz
    When Faculty should see the Save and continue
    Then Faculty should click save and submit
    
    
    
    @tag37
    Scenario: Student should 
    Given Student should 
    When Student should see th
    Then Student should click
    

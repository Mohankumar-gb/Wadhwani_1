Feature: Login cucumber

  @tag
  Scenario Outline: Login Functionality with valid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter valid "<username>"
    Then Faculty should verify success message

    Examples: 
      | username                    |
      | qapital.faculty@yopmail.com |

  @tag1
  Scenario Outline: Login Functionality with invalid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    Then Faculty should verify its enter success message

    Examples: 
      | username    |
      | qapital.com |

  @tag2
  Scenario Outline: Login Functionality with invalid password
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    And Faculty should click next Button
    Then Faculty should enter the invalid password"<password>"
    Then Faculty should verify its  success message

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com |     1234 |

  @tag3
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

  @tag4
  Scenario Outline: Forgot password is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty click the forgot password"<forgot password>"
    Then Faculty should verify its successfully click

    Examples: 
      | username                    |
      | qapital.faculty@yopmail.com |

  @tag5
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

  @tag6
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

  @tag7
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

  @tag8
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

  @tag9
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

  @tag10
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

  @tag11
  Scenario Outline: Login Functionality with valid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter valid "<username>"
    And Faculty should select next Button
    Then Faculty should verify an success message

    Examples: 
      | username         |
      | subham@gmail.com |

  @tag12
  Scenario Outline: Check next button is enabled or not
    Given faculty is on the Learnwise Login Page
    When faculty should not enter any mail id "<username>"
    And faculty should check next button is enabled
    Then faculty should verify its enabled or not

    Examples: 
      | username |
      |          |

  @tag13
  Scenario Outline: Login Functionality with invalid credentials
    Given faculty is on the Learnwise Login Page
    When faculty should enter invalid "<username>"
    Then faculty should verify get accept message

    Examples: 
      | username          |
      | file123@gmail.com |

  @tag14
  Scenario Outline: Login Functionality with valid credentials
    Given faculty is on the Learnwise Login Page
    When faculty should enter the valid email"<username>"
    And faculty should select the next Button
    Then faculty should enter the valid password "<passkey>"
    Then faculty should verify passkey successfully entered

    Examples: 
      | username         | passkey |
      | subham@gmail.com | pass    |

  @tag15
  Scenario: Joining courses
    Given User should be in home page
    When User should click on course
    Then User should start the course

  @tag16
  Scenario: Click on create Batch
    Given User should be in couRse
    When User should click on courses
    Then User should able to Create A Batch

  @tag17
  Scenario: Entering Batch Details
    Given Be in course page
    When click on create batch
    Then Enter details to create batch

  @tag18
  Scenario: Copy Batch Details
    Given User should be in home page on course
    When User should click Create BATCH
    Then Click on copy batch

  @tag19
  Scenario: Enter copy batch details
    Given User should be in course page
    When User should click Copy BATCH
    Then Enter Batch deTails

  @tag20
  Scenario: Clicking on Start Course
    Given User should be in coursepage
    When User should click on Start course
    Then User should see coursedetails

  @tag21
  Scenario: Changing Batch
    Given User should be in course details page
    When User should see the batch names in dropdown options
    Then User should select other batch

  @tag22
  Scenario: Faculty should give mock test
    Given Faculty should be in courses details
    When click on mock test
    Then click on play button

  @tag23
  Scenario: Faculty should take Quizzes
    Given Faculty should be in Quizzes page
    When Faculty should click on quizzes
    Then Faculty should able see the quizzes

  @tag24
  Scenario: Faculty taking Quizzes
    Given Faculty should be in Quizzespage
    When Faculty should click Quizzes
    Then Faculty should click on take quizzes

  @tag25
  Scenario: Faculty should view quizz results
    Given Faculty should be in Quizz page
    When Faculty should should take Quizz
    Then Faculty should click on view quizz Results

  @tag26
  Scenario: Faculty should take quizz
    Given Faculty should attempt Quizz
    When Faculty should take quizz
    Then Faculty should click on submit

  @tag27
  Scenario: Verify Faculty should view Practice Venture
    Given Faculty  dhould bein Quizzes
    When Faculty should see th Practice Venture
    Then Faculty should click on Practice Venture

  @tag28
  Scenario: Verify Faculty should view PV Milestones
    Given Faculty is in Quizzes
    When Faculty should see th PV Milestones
    Then Faculty should click on PV Milestones

  @tag29
  Scenario: Verify Faculty should click on faculty notes
    Given Faculty is in Quizzes Module
    When Faculty should see th Faculty Notes
    Then Faculty should click on Faculty Notes

  @tag30
  Scenario: Verify Faculty should see the lessons
    Given Faculty should be in QuizzesModule
    When Faculty should see the lessons
    Then Faculty should click on lessons

  @tag31
  Scenario: Verify Faculty should click on report tab
    Given Faculty should login To thePage
    When Faculty should see the report module
    Then Faculty should click on Report Module

  @tag32
  Scenario: Verify Faculty should click on Notification icon
    Given Faculty should login
    When Faculty should see the Notification icon
    Then Faculty should click onNotification icon

  @tag33
  Scenario: Faculty should take quizz again
    Given Faculty should attempt Quizz again
    When Faculty should take quizz again
    Then Faculty should Re-attempt quizz

  @tag34
  Scenario: Faculty should be in teaching mode
    Given Faculty should be inCoursE
    When Faculty should click on START COURSe
    Then Faculty should click on teaching

  @tag35
  Scenario: Faculty should be in Manage Batches
    Given Faculty is inCoursE
    When Faculty should see the Manage Batches
    Then Faculty should click on Manage Batches

  @tag36
  Scenario: Faculty should EDIT Manage Batches
    Given Faculty Should Be inCoursEPage
    When Faculty should see the edit symbol Manage Batches
    Then Faculty should click onedit symbol Manage Batches

  @tag37
  Scenario: Faculty should be in Chat box Manage Batches
    Given Faculty is inCoursEPage
    When Faculty should see the Chat box
    Then Faculty should click on Chat box

  @tag38
  Scenario: Faculty should be in Manage Students
    Given Faculty is ManageBATches
    When Faculty should see the Manage Students
    Then Faculty should click on Manage Students

  @tag39
  Scenario: Faculty should be in Run lessons
    Given Facultyis in CoursE page
    When Faculty should see the Run lessons
    Then Faculty should click on Run lessons

  @tag40
  Scenario: Faculty should be in No Upcoming Module
    Given Faculty view CoursE pages
    When Faculty should see the No Upcoming Module
    Then Faculty should click on No Upcoming Module

  @tag41
  Scenario: Faculty should Close Batch
    Given Faculty should be in active batches (Manage Batches) page
    When Faculty should see the Close Batch
    Then Faculty should click on Close Batch

  @tag42
  Scenario: Faculty should ReOpen batch
    Given Faculty should be in active batches
    When Faculty should see the ReOpen batch
    Then Faculty should click on ReOpen batch

  @tag43
  Scenario: Faculty should share his thoughts through chat
    Given Faculty should be in ACtiveBatches
    When Faculty should see chatIcon
    Then Faculty should click on  chat icon and share his thoughts

  @tag44
  Scenario: Faculty should send his thoughts
    Given Faculty is in ActiveBatches page
    When Faculty should see the CHatBox
    Then Faculty should click on send

  @tag45
  Scenario: Faculty should save and submit quizz
    Given Faculty should view quizz
    When Faculty should see the Save and continue
    Then Faculty should click save and submit

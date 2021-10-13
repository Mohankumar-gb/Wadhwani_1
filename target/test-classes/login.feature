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
  @tags6
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
  Scenario: Verify Faculty should view Practice Venture
    Given Faculty  dhould bein Quizzes
    When Faculty should see th Practice Venture
    Then Faculty should click on Practice Venture

  @tag18
  Scenario: Verify Faculty should view PV Milestones
    Given Faculty is in Quizzes
    When Faculty should see th PV Milestones
    Then Faculty should click on PV Milestones

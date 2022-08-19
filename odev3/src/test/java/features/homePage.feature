@LoginPage
Feature: Home Page

  @Login
  Scenario: Login
    Given User is on Home page
    When click oturum ac button in the top right
    Then should see Login Page
    When enter e-posta and click ileri button
    When enter şifre and ileri button
    Then should see page



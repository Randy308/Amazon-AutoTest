Feature: Login

  Scenario: Login with valid credentials
    Given I am on login page
    When I login with "randyh308@gmail.com" and password "c3czM3RDNG40cnkxNA=="
    Then I should see "Hola Randy" in the profile

  Scenario: Login with invalidated password
    Given I am on login page
    When I login with "henryvargastames@gmail.com" and password "HenryDaniel"
    Then I should see "La dirección de correo electrónico o la contraseña son incorrectas."

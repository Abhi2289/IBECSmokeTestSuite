
Feature: Verify the Bundle publishing from EMR To CDR for R4
 
  Scenario: Verfiy the ADT Message are getting Published to R4 
    Given The ADT Message is send to EMRA 
    And   The Message is proccessed successfully
    Then  Verify the bundle Mapping 
@MotorDutyAssessment

  Feature: Checking motor vehicle stamp duty in Service NSW website
  Scenario Outline: User access SNSW website and check Motor vehicle stamp duty
    Given User access Motor duty website "<url>"
    When user click on Check online button
    Then user is taken to Calcultor page assert the text
    Then user click on Yes button and enter "<amount>"
    Then click on Calculate button popup opened
    Then Assert Content in the popup

    Examples:
      | url                                                                     |amount|
      | https://www.service.nsw.gov.au/transaction/check-motor-vehicle-stamp-duty|45000|

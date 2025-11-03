@APItasktest
Feature: Creating API test for Fetch and assert

  Scenario Outline: Creating feature for GET openLibrary and Assert data
    Given Invoked the Get Authors from "<url>" and "<authorid>"
    When deserialise the response array to a OpenLibrary
    Then validate the OpenLibrary content
    Examples:
      | url        | authorid |
      | https://openlibrary.org/authors|/OL1A.json|
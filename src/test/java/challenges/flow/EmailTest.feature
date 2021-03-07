Feature: Challenge

  Scenario: User sends a message to a Message Server.
    Given A User sends an <message> message
    When The message is converted by the Adapter
    Then The Message server should contain the <message> message in the queue
    
    
    
    
	Examples:
	|message|
	|hello|
@main
Feature: IRCTC Buy TICKETS

Background: 
	Given launch the browser and url

@smoke @sanity @regression
Scenario: Buy Ticket
 Given user enters value or clicks on from field with one dim map
 |location1|Chennai|
 |location2|Koyambedu|
 |location3|Central|
 #When user enters value or clicks on to field with one dim list
 #|Maharastra|Kada| 
 #Then validate the date
 #When user clicks on search

#@sanity @smoke
 #Scenario: Buy Ticket
 #Given user enters value or clicks on from field with one dim map
 #|location1|Chennai|
 #|location2|Koyambedu|
 #|location3|Central|
 #When user enters value or clicks on to field with one dim list
 #|Maharastra|Kada| 
 #Then validate the date
 #When user clicks on search
 #
 #
 #@smoke @regression
 #Scenario: Buy Ticket
 #Given user enters value or clicks on from field with one dim map
 #|location1|Chennai|
 #|location2|Koyambedu|
 #|location3|Central|
 #When user enters value or clicks on to field with one dim list
 #|Maharastra|Kada| 
 #Then validate the date
 #When user clicks on search


#Scenario Outline: Buy Ticket
 #Given user enters value or clicks on from field "<Start>"
 #When user enters value or clicks on to field "<End>"
 #|Maharastra|Kada| 
 #Then validate the date
 #When user clicks on search
 #
 #Examples: 
 #|Start|End|
 #|Chennai|Maharastra|
 #|Koyambedu|Delhi|
 #|Central|Pune|
 
 
#Scenario: Buy Ticket2
 #Given user enters value or clicks on from fields 
 #When user enters value or clicks on to fields 
 #Then validating date 
 #When user click on search
	
#Scenario Outline:
#Examples:
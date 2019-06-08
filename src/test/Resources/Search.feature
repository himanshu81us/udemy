Feature: search

  Scenario: search cources using valid data
    Given i enter url as "https://www.udemy.com/"
    Then i should see Learn it. Do it. as page title
#    When i enter "Automation" in search box
#    And i select "automation" from the dropdown box
#    Then i should see result url as "https://www.udemy.com/courses/search/?q=automation&src=sac&kw=automation"
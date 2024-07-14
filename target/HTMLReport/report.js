$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/LoginFunctionalityUsingDataTable.feature");
formatter.feature({
  "name": "To Validate the Login Functionality in  Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the  username and password functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Launch the  Browser and to maximize the Web page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_Launch_the_Browser_and_to_maximize_the_Web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the FB application url in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_pass_the_FB_application_url_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the username by passing values",
  "rows": [
    {
      "cells": [
        "Username 1",
        "san12345"
      ]
    },
    {
      "cells": [
        "Username 2",
        "Sandyraj"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_validate_the_username_by_passing_values(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To vaidate the password by passing Values in the password field",
  "rows": [
    {
      "cells": [
        "Password 1",
        "Password 2"
      ]
    },
    {
      "cells": [
        "Sanu@6699",
        "Pass@3197"
      ]
    },
    {
      "cells": [
        "Rajesh@6699",
        "SandhyaRaj@3679"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_vaidate_the_password_by_passing_Values_in_the_password_field(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinitionfiletestcheck.StepDefenesionDataTable.to_vaidate_the_password_by_passing_Values_in_the_password_field(StepDefenesionDataTable.java:47)\r\n\tat ✽.To vaidate the password by passing Values in the password field(file:src/test/resources/LoginFunctionalityUsingDataTable.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the login button for validation",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_click_the_login_button_for_validation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check wheather it will navigate to the home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_check_wheather_it_will_navigate_to_the_home_page_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the web page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenesionDataTable.to_close_the_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
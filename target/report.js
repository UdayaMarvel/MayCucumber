$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/IRCTC.feature");
formatter.feature({
  "name": "IRCTC Buy TICKETS",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "launch the browser and url",
  "keyword": "Given "
});
formatter.match({
  "location": "BuyTicket_Stepdefinition.launch_the_browser_and_url()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"in.co.irctc.BuyTicket_Stepdefinition.driver\" is null\r\n\tat in.co.irctc.BuyTicket_Stepdefinition.launch_the_browser_and_url(BuyTicket_Stepdefinition.java:56)\r\n\tat ✽.launch the browser and url(./src/test/resources/IRCTC.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Buy Ticket",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user enters value or clicks on from field with one dim map",
  "rows": [
    {
      "cells": [
        "location1",
        "Chennai"
      ]
    },
    {
      "cells": [
        "location2",
        "Koyambedu"
      ]
    },
    {
      "cells": [
        "location3",
        "Central"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "BuyTicket_Stepdefinition.user_enters_value_or_clicks_on_from_field_with_one_dim_map(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});
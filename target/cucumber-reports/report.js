$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Modules.feature");
formatter.feature({
  "name": "Navigating To Modules",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@modules"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User can see correct number of Baby Nests products",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user navigates to \"\u003cfirstmodule\u003e\" module",
  "keyword": "Given "
});
formatter.step({
  "name": "the user navigates to \"\u003csecondmodule\u003e\" second module",
  "keyword": "When "
});
formatter.step({
  "name": "the user navigates to \"\u003cthirdmodule\u003e\" second module",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cnumberofresults\u003e\" items should be found",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstmodule",
        "secondmodule",
        "thirdmodule",
        "numberofresults"
      ]
    },
    {
      "cells": [
        "Home \u0026 Living",
        "Bedding",
        "Baby Nests",
        "3,764"
      ]
    },
    {
      "cells": [
        "Home \u0026 Living",
        "Kitchen \u0026 Dining",
        "Drink \u0026 Barware",
        "3,110,298"
      ]
    },
    {
      "cells": [
        "Jewelry",
        "Necklaces",
        "Chains",
        "149,633"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user click on searchbox",
  "keyword": "Given "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.theUserClickOnSearchbox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can see correct number of Baby Nests products",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@modules"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Home \u0026 Living\" module",
  "keyword": "Given "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Bedding\" second module",
  "keyword": "When "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_second_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Baby Nests\" second module",
  "keyword": "And "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_second_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"3,764\" items should be found",
  "keyword": "Then "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.items_should_be_found(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c3,76[4]\u003e but was:\u003c3,76[3]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.etsy.step_definitions.HomeLiving_stepdefinitions.items_should_be_found(HomeLiving_stepdefinitions.java:54)\r\n\tat ✽.\"3,764\" items should be found(file:///C:/Users/murat/IdeaProjects/testbee/src/test/resources/features/Modules.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "User can see correct number of Baby Nests products");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user click on searchbox",
  "keyword": "Given "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.theUserClickOnSearchbox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can see correct number of Baby Nests products",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@modules"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Home \u0026 Living\" module",
  "keyword": "Given "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Kitchen \u0026 Dining\" second module",
  "keyword": "When "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_second_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Drink \u0026 Barware\" second module",
  "keyword": "And "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_second_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"3,110,298\" items should be found",
  "keyword": "Then "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.items_should_be_found(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c3,11[0,29]8\u003e but was:\u003c3,11[1,67]8\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.etsy.step_definitions.HomeLiving_stepdefinitions.items_should_be_found(HomeLiving_stepdefinitions.java:54)\r\n\tat ✽.\"3,110,298\" items should be found(file:///C:/Users/murat/IdeaProjects/testbee/src/test/resources/features/Modules.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "User can see correct number of Baby Nests products");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user click on searchbox",
  "keyword": "Given "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.theUserClickOnSearchbox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can see correct number of Baby Nests products",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@modules"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Jewelry\" module",
  "keyword": "Given "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Necklaces\" second module",
  "keyword": "When "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_second_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Chains\" second module",
  "keyword": "And "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.the_user_navigates_to_second_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"149,633\" items should be found",
  "keyword": "Then "
});
formatter.match({
  "location": "com.etsy.step_definitions.HomeLiving_stepdefinitions.items_should_be_found(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c149,6[33]\u003e but was:\u003c149,6[57]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.etsy.step_definitions.HomeLiving_stepdefinitions.items_should_be_found(HomeLiving_stepdefinitions.java:54)\r\n\tat ✽.\"149,633\" items should be found(file:///C:/Users/murat/IdeaProjects/testbee/src/test/resources/features/Modules.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", "User can see correct number of Baby Nests products");
formatter.after({
  "status": "passed"
});
});
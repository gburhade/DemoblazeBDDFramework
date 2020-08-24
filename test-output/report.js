$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PERENNIAL-QA/Desktop/Gaurav/Eclipse Workspace/DemoblazeBDDframework/src/main/java/Features/Placeorder.feature");
formatter.feature({
  "line": 1,
  "name": "Demoblaze Place order feature",
  "description": "",
  "id": "demoblaze-place-order-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Demoblaze Place order test",
  "description": "",
  "id": "demoblaze-place-order-feature;demoblaze-place-order-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is available on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Store",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on Log in menu",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#Data tables"
    }
  ],
  "line": 9,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "gauravburhade",
        "Lmessi@10"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user click on Samsung galaxy s6",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user click on Add to cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify product is added",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Cart menu",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Place order",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Data tables"
    }
  ],
  "line": 21,
  "name": "fill the user details and click on Purchase button",
  "rows": [
    {
      "cells": [
        "Name",
        "Country",
        "City",
        "CreditCard",
        "Month",
        "Year"
      ],
      "line": 22
    },
    {
      "cells": [
        "tom",
        "India",
        "Nashik",
        "HDFC",
        "July",
        "2020"
      ],
      "line": 23
    },
    {
      "cells": [
        "peter",
        "Holland",
        "Amsterdams",
        "BON",
        "August",
        "2020"
      ],
      "line": 24
    },
    {
      "cells": [
        "Leo",
        "Argentina",
        "BuenoAires",
        "BOA",
        "August",
        "2020"
      ],
      "line": 25
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "verify confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "placeOrderStepDefinition.user_is_available_on_login_page()"
});
formatter.result({
  "duration": 17238031400,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.title_of_login_page_is_Store()"
});
formatter.result({
  "duration": 16581400,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.user_click_on_Log_in_menu()"
});
formatter.result({
  "duration": 102723800,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 890930300,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 60785600,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 23112274000,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.user_click_on_Samsung_galaxy_s()"
});
formatter.result({
  "duration": 2493810400,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.user_click_on_Add_to_cart_button()"
});
formatter.result({
  "duration": 1754333200,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.verify_product_is_added_to_cart()"
});
formatter.result({
  "duration": 3047971300,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.click_on_Cart_menu()"
});
formatter.result({
  "duration": 3624745500,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.click_on_Place_order()"
});
formatter.result({
  "duration": 3069900700,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.fill_the_user_details_and_click_on_Purchase_button(DataTable)"
});
formatter.result({
  "duration": 23883587900,
  "status": "passed"
});
formatter.match({
  "location": "placeOrderStepDefinition.verify_confirmation_message()"
});
formatter.result({
  "duration": 33014000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h2[text()\u003d\u0027Thank you for your purchase!\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SKEPB81\u0027, ip: \u0027192.168.43.161\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\PERENN~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58409}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: acaab201b46e3436b8acfdb1e854993e\n*** Element info: {Using\u003dxpath, value\u003d//h2[text()\u003d\u0027Thank you for your purchase!\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinitions.placeOrderStepDefinition.verify_confirmation_message(placeOrderStepDefinition.java:148)\r\n\tat ✽.Then verify confirmation message(C:/Users/PERENNIAL-QA/Desktop/Gaurav/Eclipse Workspace/DemoblazeBDDframework/src/main/java/Features/Placeorder.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "placeOrderStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});
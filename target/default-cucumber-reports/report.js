$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Coupons.feature");
formatter.feature({
  "name": "Automating digital coupons",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing digital coupons",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@coupons"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on home page and clicks on login button",
  "keyword": "Given "
});
formatter.match({
  "location": "HEBCouponsStepDefs.the_user_is_on_home_page_and_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with email \"tadjichka@gmail.com\" and password \"hebdemo1\"",
  "keyword": "When "
});
formatter.match({
  "location": "HEBCouponsStepDefs.the_user_logs_in_with_email_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should verify if user name is displayed on home page and clicks on coupons link",
  "keyword": "Then "
});
formatter.match({
  "location": "HEBCouponsStepDefs.the_user_should_verify_if_user_name_is_displayed_on_home_page_and_clicks_on_coupons_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Select Digital Coupons button from Coupons page",
  "keyword": "When "
});
formatter.match({
  "location": "HEBCouponsStepDefs.the_user_clicks_Select_Digital_Coupons_button_from_Coupons_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should click on all select coupon buttons on Digital Coupons page",
  "keyword": "Then "
});
formatter.match({
  "location": "HEBCouponsStepDefs.the_user_should_click_on_all_select_coupon_buttons_on_Digital_Coupons_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
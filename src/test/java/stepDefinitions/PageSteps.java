package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pages.AboutPage;
import pages.BlogPage;
import pages.ContactPage;
import pages.HomePage;
import pages.InternAdvPage;
import pages.LeadershipPage;
import pages.NewsPage;
import pages.PeoplePage;
import pages.PrivacyPolicyPage;
import pages.TermsAndConPage;
import pages.WorkPage;
import utils.PageTitles;
import utils.TestUtil;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import org.junit.Assert;

import base.TestBase;

@RunWith(Cucumber.class)
public class PageSteps extends TestBase {

	TestUtil testUtil;
	HomePage homePage;
	PageTitles pageTitles;
	AboutPage aboutpage;
	BlogPage blogpage;
	ContactPage contactPage;
	InternAdvPage iacPage;
	LeadershipPage leadershipPage;
	NewsPage newsPage;
	PeoplePage peoplePage;
	PrivacyPolicyPage privacyPolicyPage;
	TermsAndConPage termsAndConPage;
	WorkPage workPage;
	
	public PageSteps() {
		super();
	}

	@Given("^User is landing on home page and accepting cookies window$")
	public void user_is_landing_on_home_page_and_accepting_cookies_window() throws Throwable {
		testUtil = new TestUtil();
		homePage = new HomePage();
		pageTitles = new PageTitles();
		aboutpage = new AboutPage();
		blogpage = new BlogPage();
		contactPage = new ContactPage();
		iacPage = new InternAdvPage();
		leadershipPage = new LeadershipPage();
		newsPage = new NewsPage();
		peoplePage = new PeoplePage();
		privacyPolicyPage = new PrivacyPolicyPage();
		termsAndConPage = new TermsAndConPage();
		workPage = new WorkPage();

		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
	}

	@When("^Scrolling down$")
	public void scrolling_down() throws Throwable {

		TestUtil.scrollPage(400);
		Thread.sleep(500);

	}

	@When("^User clicking on \"([^\"]*)\" button on \"([^\"]*)\" menu$")
	public void user_clicking_on_something_button_on_something_menu(String button, String menu) throws Throwable {
		if (menu.contentEquals("top")) {
			if (button.contentEquals("about")) {
				TestUtil.highLightElement(homePage.About);
				homePage.ClickOnAboutTop();
			} else if (button.contentEquals("Work")) {
				TestUtil.highLightElement(homePage.Work);
				homePage.ClickOnWorkTop();
			} else if (button.contentEquals("blog")) {
				TestUtil.highLightElement(homePage.Blog);
				homePage.ClickOnBlogTop();
			} else if (button.contentEquals("contact")) {
				TestUtil.highLightElement(homePage.Contact);
				homePage.ClickOnContactTop();
			} else if (button.contentEquals("search")) {
				TestUtil.highLightElement(homePage.SearchButton);
				homePage.SearchWindow();
			} else {
				log.error("Please give a right menu name");
			}
		} else if (menu.contentEquals("lower")) {
			if (button.contentEquals("about")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.About_down);
				homePage.ClickOnAboutDown();
			} else if (button.contentEquals("Work")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Work_down);
				homePage.ClickOnWorkDown();
			} else if (button.contentEquals("blog")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Blog_down);
				homePage.ClickOnBlogDown();
			} else if (button.contentEquals("contact")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Contact_down);
				homePage.ClickOnContactDown();
			} else {
				log.error("Please give a right menu name");
			}
		} else {
			log.error("Please provide as a menu top or lower anything else is wrong");
		}
	}

	@When("^User is hovering on \"([^\"]*)\"$")
	public void user_is_hovering_on_something(String hover) throws Throwable {
		if (hover.contentEquals("about")) {
			TestUtil.highLightElement(homePage.About);
			homePage.AboutSubMenu();
		} else {
			log.error("please provide right hovering target");
		}
	}

	@When("^User clicks on all boxes at Driven by our values$")
	public void user_clicks_on_all_boxes_at_driven_by_our_values() throws Throwable {
		homePage.OurValuesExpand();
	}

	@When("^User checking which box is active before refresh$")
	public void user_checking_which_box_is_active_before_refresh() throws Throwable {
		homePage.WhatPeopleBeforeRefreshPage();
	}

	@When("^User clicks on boxes at what people are saying$")
	public void user_clicks_on_boxes_at_what_people_are_saying() throws Throwable {
		homePage.WhatPeopleClicking();
	}

	@When("^Scrolling into view \"([^\"]*)\"$")
	public void scrolling_into_view_something(String element) throws Throwable {
		if (element.contentEquals("ClientDanfoss")) {
			homePage.DafossScroll();
		}
	}
	
	 @When("^clicking on \"([^\"]*)\"$")
	    public void clicking_on_something(String element) throws Throwable {
		 if (element.contentEquals("learn_more")) {
			 Thread.sleep(500);
			 TestUtil.highLightElement(homePage.LearnMoreButton);
				homePage.LearnMoreButton();
			}
			else if (element.contentEquals("privacy_policy")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Privacy_Policy);
				homePage.PrivacyPolicy();
			}
			else if (element.contentEquals("termsAndCon")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.TermsNcon);
				homePage.TermsAndConButton();
			}
			else if (element.contentEquals("AiAndTheRiseVideo")) {
				TestUtil.scrollIntoView(homePage.PlayVideo1);
				Thread.sleep(500);
				homePage.AiAtTheRiseVideoOpen();
			}
		 
	    }
	 
	 @When("^clicking on submenu(.+)$")
	    public void clicking_on_submenu(String submenu) throws Throwable {
		 if (submenu.contentEquals("locationsDown")) {
			 Thread.sleep(500);
			 TestUtil.highLightElement(homePage.Locations_down);
				homePage.AboutSubMenuLocationsDown();
			}
			else if (submenu.contentEquals("careersDown")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Careers_down);
				homePage.AboutSubMenuCareersDown();
			}
			else if (submenu.contentEquals("leadershipDown")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Leadership_down);
				homePage.AboutSubMenuLeadershipDown();
			}
			else if (submenu.contentEquals("newsDown")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.News_down);
				homePage.AboutSubMenuNewsDown();
			}
			else if (submenu.contentEquals("awardsDown")) {
				Thread.sleep(500);
				TestUtil.highLightElement(homePage.Awards_down);
				homePage.AboutSubMenuAwardsDown();
			}
	    }

	@Then("^The page title is \"([^\"]*)\"$")
	public void the_page_title_is_something(String title) throws Throwable {
		if (title.contentEquals(pageTitles.homeTitle)) {
			Assert.assertEquals(homePage.verifyHomePageTitle(), pageTitles.homeTitle);
			
		} else if (title.contentEquals(pageTitles.aboutTitle)) {
			Assert.assertEquals(aboutpage.verifyAboutPageTitle(), pageTitles.aboutTitle);

		} /*else if (title.contentEquals(pageTitles.awardsTitle)) {
			Assert.assertEquals(awardsPage.verifyAwardsPageTitle(), pageTitles.awardsTitle);

		}*/ else if (title.contentEquals(pageTitles.blogTitle)) {
			Assert.assertEquals(blogpage.verifyBlogPageTitle(), pageTitles.blogTitle);

		} /*else if (title.contentEquals(pageTitles.careersTitle)) {
			Assert.assertEquals(careersPage.verifyCareersPageTitle(), pageTitles.careersTitle);

		}*/ else if (title.contentEquals(pageTitles.contactTitle)) {
			Assert.assertEquals(contactPage.verifyContactPageTitle(), pageTitles.contactTitle);

		} else if (title.contentEquals(pageTitles.InterAdvTitle)) {
			Assert.assertEquals(iacPage.verifyInternAdvTitle(), pageTitles.InterAdvTitle);

		} else if (title.contentEquals(pageTitles.leadershipTitle)) {
			Assert.assertEquals(leadershipPage.verifyLeadershipPageTitle(), pageTitles.leadershipTitle);

		} else if (title.contentEquals(pageTitles.newsTitle)) {
			Assert.assertEquals(newsPage.verifyNewsPageTitle(), pageTitles.newsTitle);

		} else if (title.contentEquals(pageTitles.peopleTitle)) {
			Assert.assertEquals(peoplePage.verifyPeoplePageTitle(), pageTitles.peopleTitle);

		} else if (title.contentEquals(pageTitles.privacyTitle)) {
			Assert.assertEquals(privacyPolicyPage.verifyPrivacyPageTitle(), pageTitles.privacyTitle);

		} else if (title.contentEquals(pageTitles.termsTitle)) {
			Assert.assertEquals(termsAndConPage.verifyTermsPageTitle(), pageTitles.termsTitle);

		} else if (title.contentEquals(pageTitles.workTitle)) {
			Assert.assertEquals(workPage.verifyWorkPageTitle(), pageTitles.workTitle);

		}
		else {
			log.error("Please give a right page title");
		}

	}
	
	 @Then("^The title is (.+)$")
	    public void the_title_is(String titles) throws Throwable {
		 if (titles.contentEquals(pageTitles.homeTitle)) {
				Assert.assertEquals(homePage.verifyHomePageTitle(), pageTitles.homeTitle);
			} else if (titles.contentEquals(pageTitles.aboutTitle)) {
				Assert.assertEquals(aboutpage.verifyAboutPageTitle(), pageTitles.aboutTitle);

			} /*else if (titles.contentEquals(pageTitles.awardsTitle)) {
				Assert.assertEquals(awardsPage.verifyAwardsPageTitle(), pageTitles.awardsTitle);

			}*/ else if (titles.contentEquals(pageTitles.blogTitle)) {
				Assert.assertEquals(blogpage.verifyBlogPageTitle(), pageTitles.blogTitle);

			} /*else if (title.contentEquals(pageTitles.careersTitle)) {
				Assert.assertEquals(careersPage.verifyCareersPageTitle(), pageTitles.careersTitle);

			}*/ else if (titles.contentEquals(pageTitles.contactTitle)) {
				Assert.assertEquals(contactPage.verifyContactPageTitle(), pageTitles.contactTitle);

			} else if (titles.contentEquals(pageTitles.InterAdvTitle)) {
				Assert.assertEquals(iacPage.verifyInternAdvTitle(), pageTitles.InterAdvTitle);

			} else if (titles.contentEquals(pageTitles.leadershipTitle)) {
				Assert.assertEquals(leadershipPage.verifyLeadershipPageTitle(), pageTitles.leadershipTitle);

			} else if (titles.contentEquals(pageTitles.newsTitle)) {
				Assert.assertEquals(newsPage.verifyNewsPageTitle(), pageTitles.newsTitle);

			} else if (titles.contentEquals(pageTitles.peopleTitle)) {
				Assert.assertEquals(peoplePage.verifyPeoplePageTitle(), pageTitles.peopleTitle);

			} else if (titles.contentEquals(pageTitles.privacyTitle)) {
				Assert.assertEquals(privacyPolicyPage.verifyPrivacyPageTitle(), pageTitles.privacyTitle);

			} else if (titles.contentEquals(pageTitles.termsTitle)) {
				Assert.assertEquals(termsAndConPage.verifyTermsPageTitle(), pageTitles.termsTitle);

			} else if (titles.contentEquals(pageTitles.workTitle)) {
				Assert.assertEquals(workPage.verifyWorkPageTitle(), pageTitles.workTitle);

			}
			else {
				log.error("Please give a right page title");
			}
	    }

	@Then("^The white logo is displayed \"([^\"]*)\"$")
	public void the_white_logo_is_displayed_something(String disp) throws Throwable {
		if(disp.contentEquals("true")) {
			Assert.assertTrue(homePage.verifyLogoAtTop());
		}
		else if(disp.contentEquals("false")) {
			Assert.assertFalse(homePage.verifyTopLogoAtScroll());
		}
		else {
			log.error("Please give right boolean condition");
		}
	}

	@Then("^The orange logo is displayed \"([^\"]*)\"$")
	public void the_orange_logo_is_displayed_something(String disp) throws Throwable {
		Thread.sleep(500);
		if(disp.contentEquals("true")) {
			Assert.assertTrue(homePage.verifyLogoScroll());
		}
		else if(disp.contentEquals("false")) {
			Assert.assertFalse(homePage.verifyLogoScrollAtTop());
		}
		else {
			log.error("Please give right boolean condition");
		}
	}

	@Then("^The search field is displayed \"([^\"]*)\"$")
	public void the_search_field_is_displayed_something(String disp) throws Throwable {
		if(disp.contentEquals("true")) {
			Assert.assertTrue(homePage.SearchWindowDisp());
		}
		else if(disp.contentEquals("false")){
			Assert.assertFalse(homePage.SearchWindowDisp());
		}
		else {
			log.error("Please give right boolean condition");
		}
	}

	@Then("^The search result should give as a result \"([^\"]*)\"$")
	public void the_search_result_for_should_give_as_a_result_something(String searchText) throws Throwable {
		Assert.assertEquals("Search Results for: "+searchText, homePage.SearchResult());
	}

	@Then("^The sub-menu should be displayed \"([^\"]*)\"$")
	public void the_submenu_should_be_displayed_something(String disp) throws Throwable {
		if(disp.contentEquals("true")) {
			Assert.assertTrue(homePage.AboutSubMenuDisp());
		}
		else if(disp.contentEquals("false")){
			log.info("No test case for this");
		}
		else {
			log.error("Please give right boolean condition");
		}
	}

	@Then("^The Iac button is displayed \"([^\"]*)\"$")
	public void the_iac_button_is_displayed_something(String disp) throws Throwable {
		if(disp.contentEquals("true")) {
			Assert.assertTrue(homePage.AboutSubMenuInterAdvCouncilDisp());
		}
		else if(disp.contentEquals("false")){
			log.info("No test case for this");
		}
		else {
			log.error("Please give right boolean condition");
		}
		
	}

	@Then("^The boxes expand slightly \"([^\"]*)\"$")
	public void the_boxes_expand_slightly_something(String bool) throws Throwable {
		
		if(bool.contentEquals("true")) {
			Assert.assertTrue(homePage.OurValuesExpandBool());
		}
		else if(bool.contentEquals("false")){
			log.info("No test case for this");
		}
		else {
			log.error("Please give right boolean condition");
		}
	}

	@Then("^Before refresh and after refresh results should be different$")
	public void before_refresh_and_after_refresh_results_should_be_different() throws Throwable {
		Assert.assertTrue(homePage.WhatPeopleRefreshPageResult());
	}

	@Then("^With the help of sikuli clicking on pause button$")
	public void with_the_help_of_sikuli_clicking_on_pause_button() throws Throwable {
		homePage.AiAtTheRiseVideoPause();
	}

	@Then("^Screenshot and the expected image are \"([^\"]*)\"$")
	public void screenshot_and_the_expected_image_are_something(String bool) throws Throwable {
		homePage.ClientsPictureCompare();
	}
	
	@Then("^Check all the links on the \"([^\"]*)\" page$")
    public void check_all_the_links_on_the_something_page(String strArg1) throws Throwable {
		Assert.assertEquals(testUtil.LinkList(), 0);
	}
	
	 @Then("^The Full IAC button is preselected \"([^\"]*)\"$")
	    public void the_full_iac_button_is_preselected_something(String presel) throws Throwable {
		 if(presel.contentEquals("true")) {
				Assert.assertTrue(iacPage.verifyFullIAC());
			}
			else if(presel.contentEquals("false")){
				log.info("No test case for this");
			}
			else {
				log.error("Please give right boolean condition");
			}
	    }
	 
	 @Then("^Take a screenshot$")
	    public void take_a_screenshot() throws Throwable {
	        iacPage.WhenTakeScreenshot();
	    }
	 
	 @Then("^The Breadcrumbs are visible \"([^\"]*)\"$")
	    public void the_breadcrumbs_are_visible_something(String bool) throws Throwable {
	        if(bool.contentEquals("true")) {
				Assert.assertTrue(iacPage.verifyBreadcrumbs());
			}
			else if(bool.contentEquals("false")){
				log.info("No test case for this");
			}
			else {
				log.error("Please give right boolean condition");
			}
	    }
	 
	 @Then("^The services should be the same \"([^\"]*)\"$")
	    public void the_services_should_be_the_same_something(String bool) throws Throwable {
		 if(bool.contentEquals("true")) {
			 log.info("No test case for this");
			}
			else if(bool.contentEquals("false")){
				Assert.assertFalse(workPage.verifySelectedServiceResult());
			}
			else {
				log.error("Please give right boolean condition");
			}
	    }
	 
	 @Then("^The learn more button of the digital description should appear$")
	    public void the_learn_more_button_of_the_digital_description_should_appear() throws Throwable {
	        Assert.assertTrue(workPage.serviceDigitalLearnMore());
	    }

	    @And("^scroll into view \"([^\"]*)\"$")
	    public void scroll_into_view_something(String scroll) throws Throwable {
	        if(scroll.contentEquals("EduardoAguirre")) {
	        	TestUtil.scrollIntoView(iacPage.EduardoAguirre);
	        }
	        else if(scroll.contentEquals("WorkServices")) {
	        	TestUtil.scrollIntoView(workPage.Services.get(0));
	        }
	        else {
	        	log.error("Please give right scrolling target");
	        }
	    }

	    @And("^Move the mouse over \"([^\"]*)\"$")
	    public void move_the_mouse_over_something(String hover) throws Throwable {
	    	if(hover.contentEquals("EduardoAguirre")) {
	        iacPage.HoverEduardo();
	    	}
	    	else {
	    		log.error("Please give right hovering target");
	    	}
	    }

	    @And("^Take a new screenshot$")
	    public void take_a_new_screenshot() throws Throwable {
	        iacPage.AfterHoverScreenshot();
	    }

	    @And("^Compare screenshots if they changed after hovering on$")
	    public void compare_screenshots_if_they_changed_after_hovering_on() throws Throwable {
	        iacPage.compareHoverPics();
	    }


	@And("^Scrolling up$")
	public void scrolling_up() throws Throwable {
		TestUtil.scrollPage(300);
	}

	@And("^clearing the search field$")
	public void clearing_the_search_field() throws Throwable {
		homePage.SearchClear();
	}

	@And("^typing \"([^\"]*)\"$")
	public void typing_something(String text) throws Throwable {
		homePage.SearchTyping(text);
	}

	@And("^click on \"([^\"]*)\"$")
	public void click_on_something(String element) throws Throwable {
		if (element.contentEquals("magnify icon")) {
			TestUtil.highLightElement(homePage.SearchSubmit);
			homePage.SearchSubmit();
		} else if (element.contentEquals("close button")) {
			TestUtil.highLightElement(homePage.SearchClose);
			homePage.SearchWindowClose();
		}
		else if (element.contentEquals("Breadcrumb")) {
			TestUtil.highLightElement(iacPage.PeopleBreadcrumb);
			iacPage.peopleBreadcrumbClick();
		}
		else if(element.contentEquals("leadership")) {
			TestUtil.highLightElement(homePage.Leadership);
			homePage.AboutSubMenuLeadership();
		}
		else if(element.contentEquals("news")) {
			TestUtil.highLightElement(homePage.News);
			homePage.AboutSubMenuNews();
		}
		else if(element.contentEquals("SeniorLeadership")) {
			TestUtil.highLightElement(peoplePage.leadershipTextLink);
			peoplePage.LeadershipLinkClick();
		}
		else if(element.contentEquals("digital")) {
			TestUtil.highLightElement(workPage.Digital);
			workPage.clickOnServiceDigital();
		}
		else if(element.contentEquals("Iac")) {
			TestUtil.highLightElement(homePage.InterAdvisory);
			homePage.AboutSubMenuInterAdvCouncilClick();
		}
		
	}
	
	@And("^clicking on topsubmenu(.+)$")
    public void clicking_on_topsubmenu(String submenu) throws Throwable {
		if (submenu.contentEquals("locations")) {
			TestUtil.highLightElement(homePage.Locations);
			homePage.AboutSubMenuLocations();
		}
		else if (submenu.contentEquals("careers")) {
			TestUtil.highLightElement(homePage.Careers);
			homePage.AboutSubMenuCareers();
		}
		else if (submenu.contentEquals("leadership")) {
			TestUtil.highLightElement(homePage.Leadership);
			homePage.AboutSubMenuLeadership();
		}
		else if (submenu.contentEquals("news")) {
			TestUtil.highLightElement(homePage.News);
			homePage.AboutSubMenuNews();
		}
		else if (submenu.contentEquals("awards")) {
			TestUtil.highLightElement(homePage.Awards);
			homePage.AboutSubMenuAwards();
		}
		else if (submenu.contentEquals("Iac")) {
			TestUtil.highLightElement(homePage.InterAdvisory);
			homePage.AboutSubMenuInterAdvCouncilClick();
		}
    }

	@And("^User is hovering on submenu \"([^\"]*)\"$")
	public void user_is_hovering_on_submenu_something(String submenu) throws Throwable {
		if(submenu.contentEquals("leadership")) {
			homePage.AboutSubMenuInterAdvCouncil();
		}
		else {
			log.error("Please give right submenu title");
		}
		
	}

	@And("^refreshing the page$")
	public void refreshing_the_page() throws Throwable {
		homePage.refresh();
	}

	@And("^User checking which box is active after refresh$")
	public void user_checking_which_box_is_active_after_refresh() throws Throwable {
		homePage.WhatPeopleAfterRefresh();
	}

	@And("^with the help of sikuli clicking on play button$")
	public void with_the_help_of_sikuli_clicking_on_play_button() throws Throwable {
		homePage.AiAtTheRiseVideoPlay();
	}

	@And("^The video working \"([^\"]*)\"$")
	public void the_video_working_something(String bool) throws Throwable {
		
		if(bool.contentEquals("true")) {
			Assert.assertEquals("It Played", homePage.AiAtTheRiseVideoAssert());
		}
		else if(bool.contentEquals("false")){
			Assert.assertEquals("The video didn't work", homePage.AiAtTheRiseVideoAssert());
		}
		else {
			log.error("Please give right boolean condition");
		}
	}

	@And("^taking a screenshot$")
    public void taking_a_screenshot() throws Throwable {
		homePage.Screenshot();
    }
	
    @And("^Checks which service is selected \"([^\"]*)\"$")
    public void checks_which_service_is_selected_something(String serv) throws Throwable {
        if(serv.contentEquals("first")) {
        	workPage.verifySelectedServiceFirst();
        }
        else if(serv.contentEquals("second")) {
        	workPage.verifySelectedServiceSecond();
        }
    }

}
package minTest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basep.Testcl;
import pages.Webpages;

public class testproj extends Testcl {
	 public Webpages IMDB;
	  @BeforeMethod
	  public void setup() throws Exception 
	  {
		 
		  launchbrowser();
	       IMDB = new Webpages();

		}
	  @Test(priority=2)
	  public void veifyDateTestcase() throws Exception
	  {
		  String WikiTest = IMDB.verifymovieDateWiki();
		  String IMDBTest = IMDB.verifymovieDateIMDB();
		  Assert.assertEquals(WikiTest, IMDBTest);
		  System.out.println(WikiTest);
		  System.out.println("**************");
		  System.out.println(IMDBTest);
	  }
	  @Test(priority=1)
	  public void verifyMovieCountryTestCase() throws Exception
	  {
		  String WikiCountry = IMDB.verifymovieCountrywiki();
		  String IMDBCountry = IMDB.verifymovieCountryIMDB();
		  Assert.assertEquals(WikiCountry,IMDBCountry);
		  System.out.println(WikiCountry);
		  System.out.println("**********");
		  System.out.println(IMDBCountry);
		  
	  }
	  @AfterMethod
	  public void closeBrowser(ITestResult it)
	  {
		  if(ITestResult.FAILURE==it.getStatus())
		  {
	  
		  driver.close();
	  
	  
}
	  }
	  }



package testCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import modules.Flight_Finder;
import modules.LogIn_Module;
import testBase.TestBase;


public class TC_01_BrowserLooadTest extends TestBase
{	
	@Test(priority=0)
	public void LoadBrwser() throws NullPointerException, InterruptedException
	{
		Browser_Initialize();
		//Url_Load("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		
		System.out.println("line 1");
		System.out.println("line 2");
		if(1==2)
		{
			throw new SkipException("skipping remaining code....");
		}
		System.out.println("line 3");
		System.out.println("line 4");
		
		
	}
	
	
	@Test (priority=1)
	public void LoginProcess()
	{
		/*LogIn_Module loginObj = new LogIn_Module();
		
		loginObj.LoggIn_Process("akshaymarathe31", "akshaymarathe");
*/
		
	}	
	@Test (priority=2)
	public void Flight_Finding()
	{
		/*Flight_Finder FlightObj = new Flight_Finder();
		FlightObj.FlighDetail_Filling();
		FlightObj.ContinueToNext();
		driver.quit();
	*/
	}
	
	

}

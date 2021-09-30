package qaclickacademy.Mavenjava;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class RestAPITest {
	@BeforeTest
	public void postJira()
	{
		System.out.println("postJira");
		System.out.println("postJira2");
		System.out.println("postJira3");
	}
	@Test
	public void deleteTwitter()
	{
		System.out.println("deleteTwitter");
	}
}


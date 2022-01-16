package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

  @Parameters({"MyName","myAge","myAddress"})	
  @Test
  public void passingParam(@Optional("demo") String name , int age , String Address) {
	  System.out.println("the Name is :"+name);
	  System.out.println("the Age is :"+age);
	  System.out.println("the Address is :"+Address);
  }
}

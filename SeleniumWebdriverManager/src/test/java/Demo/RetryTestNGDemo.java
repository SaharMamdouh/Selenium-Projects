package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestNGDemo {
  @Test
  public void test1() {
	  System.out.println("i'm inside test1 ");
  }
  
  @Test
  public void test2() {
	  System.out.println("i'm inside test1 ");
//	  int i =1/0;
  }
  
  @Test(retryAnalyzer=Demo.RetryTest.class)
  public void test3() {
	  System.out.println("i'm inside test1 ");
	  Assert.assertTrue(0>1);
  }
}

package Demo;

import org.testng.annotations.Test;

@Test(groups={"AllClassTestGroups"})
public class GroupTests {
  @Test(groups={"sanity"})
  public void test1() {
	  System.out.println("I'm in test1");
  }
  
  @Test(groups={"sanity","smoke"})
  public void test2() {
	  System.out.println("I'm in test2");
  }
  
  @Test(groups={"sanity","regression"})
  public void test3() {
	  System.out.println("I'm in test3");
  }
  
  
  @Test
  public void test4() {
	  System.out.println("I'm in test4");
  }
  
}

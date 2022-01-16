package Demo;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
  @Test(dependsOnGroups ={"sanity.*"})
  public void test1() {
	  System.out.println("inside test1");
  }
  
  @Test(groups = "sanity1")
  public void test2() {
	  System.out.println("inside test2");
  }
  
  @Test()
  public void test3() {
	  System.out.println("inside test3");
  }
}

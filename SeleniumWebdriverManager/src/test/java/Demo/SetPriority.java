package Demo;

import org.testng.annotations.Test;

public class SetPriority {
	@Test
	public void one() {
		System.out.println("I'm in Test1");
	}
	@Test(priority=1)
	public void two() {
		System.out.println("I'm in Test2");
	}
	
	@Test(priority=1)
	public void three() {
		System.out.println("I'm in Test3");
	}
	
	}

package TestNGPractical;

import org.testng.annotations.Test;

public class Annotation {
  @Test(priority=3)
  public void method1(){
	  System.out.println("method 1 has been executed.");
  }
  
  @Test(priority=1)
  public void method2() {
	  System.out.println("method 2 has been executed.");
  }
  
  @Test(priority=2)
  public void method3() {
	  System.out.println("method 3 has been executed.");
  }
  
}

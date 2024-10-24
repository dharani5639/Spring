package springDemo;
import java.lang.*;
import java.util.*;

class A extends Practice{
	static {
		System.out.println("static 2");
	}
	{
		System.out.println("insance 2");
		
	}
	  void m1() {
		System.out.println("sub m1");
	}
}


public class Practice {
	static {
		System.out.println("static 1");
	}
	
	{
		System.out.println("instance 1");
		
	}
	  void m1() {
		System.out.println("sup m1");
	}
	public static void main(String[] args) {
			Practice d=new A();
		A e= new A();
		d.m1();
		
		
		
		
 		
	}

}

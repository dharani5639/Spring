package springTest;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import springDemo.Std;

//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
  //ApplicationContext context = new Clsasspath("C:\\Spring\\Workplace\\springDemo\\spring.xml");
  
     Std s11 = (Std) ctx.getBean("s1");
     System.out.println(s11);
     
     Std s22 = (Std) ctx.getBean("s2");
     System.out.println(s22);
     
     Std s33 = (Std) ctx.getBean("s3");
     System.out.println(s33);
     
     Std s44 = (Std) ctx.getBean("s4");
     System.out.println(s44);
     
     Std s55 = (Std) ctx.getBean("s5");
     System.out.println(s55);
     
     Std s66 = (Std)ctx.getBean("s6");
     s66.setFn("fn6");
     s66.setLn("ln6");
     s66.setAd("add6");
     System.out.println(s66);
     System.out.println("fn : "+s66.getFn()+"  ln: "+s66.getLn()+"   add: "+s66.getAd());
     
     
	}
}

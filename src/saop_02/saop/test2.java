package saop_02.saop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
   public static void main(String[] args) {
	   
	   /*
	    * 默认状态下，Spring-AOP默认使用JDK动态代理，当需要代理的对象没有实现任何接口时，才使用cglib动态代理。
	    */
	  ApplicationContext  ac=new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  
	  //使用自动代理
	  Sleepable sa=(Sleepable)ac.getBean("me");
	  sa.sleep();
   }
}

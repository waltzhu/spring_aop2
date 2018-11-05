package saop_02.saop;


@org.aspectj.lang.annotation.Aspect
public class SleepHelper {
	    @org.aspectj.lang.annotation.Pointcut("execution(* *.sleep())")  
	    public void sleeppoint(){}  
	      
	    @org.aspectj.lang.annotation.Before("sleeppoint()")  
	    public void beforeSleep(){  
	        System.out.println("˯��ǰҪ���·�!");  
	    }  
	      
	    @org.aspectj.lang.annotation.AfterReturning("sleeppoint()")  
	    public void afterSleep(){  
	        System.out.println("˯����Ҫ���·���");  
	    }  
}
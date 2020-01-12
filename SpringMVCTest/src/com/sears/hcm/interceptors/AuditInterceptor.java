package com.sears.hcm.interceptors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AuditInterceptor {
	

	@Around("execution(* com.sears.hcm.controllers.LoginController.login(..))")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		
		Object retVal =null;
		long startTime = System.currentTimeMillis();
		try{
			retVal = pjp.proceed();
			
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			long endTime = System.currentTimeMillis();
			System.out.println("Total time for Login "+(endTime-startTime));
		}
		return retVal;
		
	}
}

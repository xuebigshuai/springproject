package com.xys.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

@Aspect
@Component
public class LoginAspect {

	@Pointcut(value = "execution(* com.xys..*(..))")
	public void pointCut() {
	};

	@Before(value = "pointCut()")
	public void Before(JoinPoint point) {
		// getSignature获取方法的签名，里面包含了方法的所有信息
		Signature signature = point.getSignature();
		// 获取方法名
		String name = signature.getName();
		// 获取方法的参数
		Object[] args = point.getArgs();
		System.out.println(name + "：方法运行前...传入的参数：" + Arrays.asList(args));
	}

	@After(value = "pointCut()")
	public void After(JoinPoint point) {
		// getSignature获取方法的签名，里面包含了方法的所有信息
		Signature signature = point.getSignature();
		// 获取方法名
		String name = signature.getName();
		System.out.println(name + ":方法完成后..");
	}

	@AfterReturning(value = "pointCut()", returning = "result")
	public void AfterReturning(JoinPoint point, Object result) {
		// getSignature获取方法的签名，里面包含了方法的所有信息
		Signature signature = point.getSignature();
		// 获取方法名
		String name = signature.getName();
		System.out.println(name+":方法执行并成功后....所得的值为："+result);
	}

	@AfterThrowing(value = "pointCut()",throwing="exception")
	public void AfterThrowing(JoinPoint point, Exception exception) {

		System.out.println("方法执行了，但出现异常了.....:"+exception);

	}
	
	//环绕通知
	@Around(value = "pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object proceed=null;
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		Object[] args = joinPoint.getArgs();
		System.out.println(name + "：方法运行前(环绕通知)...传入的参数：" + Arrays.asList(args));
	    try{
	    	proceed = joinPoint.proceed(args);
	    	System.out.println("(环绕通知)方法执行完成后"+proceed);
	    	}
	    catch (Exception e) {
	    	System.out.println("(环绕通知)异常信息"+e);
	    	throw new RuntimeException();
	    	
		}
		
		return proceed;
		
	}

}

package com.xys.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Aspect
//@Component
public class Validator {
	
	@Before(value = "com.xys.aspect.LoginAspect.pointCut()")
	public void Before(JoinPoint point) {
		// getSignature获取方法的签名，里面包含了方法的所有信息
		Signature signature = point.getSignature();
		// 获取方法名
		String name = signature.getName();
		// 获取方法的参数
		Object[] args = point.getArgs();
		System.out.println(name + "：方法运行（验证切面）前...传入的参数：" + Arrays.asList(args));
	}

}

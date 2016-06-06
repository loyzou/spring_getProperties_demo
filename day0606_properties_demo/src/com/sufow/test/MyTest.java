package com.sufow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

	public static void main(String[] args) {
		
		//获取资源文件
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Sufow sufow = (Sufow)appContext.getBean("sufow");
		
		System.out.println(sufow.getUsername());
		System.out.println(sufow.getAddress());
		System.out.println(sufow.getAge());
		System.out.println(sufow.getGender());
		
	}
}

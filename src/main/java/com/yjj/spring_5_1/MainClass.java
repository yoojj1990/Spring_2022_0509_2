package com.yjj.spring_5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String configPath = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configPath);
		//스프링 컨테이너 생성(ctx)
		
		StudentInfo studentInfo1 = ctx.getBean("studentInfo", StudentInfo.class);
		studentInfo1.getStudentInfo();
		
		Student stu2 = ctx.getBean("student2", Student.class);
		
		studentInfo1.setStudent(stu2);
		
		studentInfo1.getStudentInfo();
		
		
		
		ctx.close();
		
		
	}

}

package com;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		
	DefaultListableBeanFactory f= new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(f);
	reader.loadBeanDefinitions(new ClassPathResource("bean.xml"));
	
	Student st=(Student) f.getBean("s");
	System.out.println(st);
	
	Student st1=(Student) f.getBean("s");
	System.out.println(st1);
	
	}
	
}

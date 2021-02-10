package com.yfg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");

	}

	public void AnnotTeest(){
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		//  这个错误没关系。
//		ac.scan("com.yfg");
//		IndexDao dao = ac.getBean(IndexDao.class);
//		dao.show();
//		System.out.println(dao);
	}

	/**
	 *  Environment = Profile + Property
	 */
	public void classpathxml(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
		/*
			获取 StandardEnvironment，去设置运行环境。
			参数  ： ProfileName (xml或者config.class中配置)
			Environment： Profile + Property

			private final MutablePropertySources propertySources = new MutablePropertySources(this.logger);

			StandardEnvironment 构造器会调用父类AbstractEnvironment的构造器完成该操作

			public AbstractEnvironment() {
				// 	设置用户参数，
				// 	properties files, JVM system properties, system environment variables,
				// 	JNDI, servlet context parameters, ad-hoc Properties objects,Maps, and so on.
   			 	customizePropertySources(this.propertySources);
			}
			Property :  PropertySources(父接口) - > MutablePropertySources
						->MutablePropertySources实现内部含有一个CopyOnWriteArrayList作为存储载体
						CopyOnWriteArrayList ： 内部存放 PropertySource（末尾没有s，PropertySources是PropertySource的容器）
						propertySources.addLast(PropertySource)

						PropertySource : 	PropertySource接口代表了键值对的Property来源
		 */
		context.getEnvironment().setActiveProfiles();
	}

//	public  void testmvc(){
//		DispatcherServlet
//	}

}

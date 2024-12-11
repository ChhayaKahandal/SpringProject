package com.mypack.SpringAutoWired2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");
        Employee e=context.getBean("employee",Employee.class);
        System.out.println(e);//jevha to string call hoil tevha apoap employee sobat cha address display yeil.
        //address sathi apan value xml file mdhun setter injection ne add kelya ahe.
    }
}

package org.example;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Student custA = (Student) context.getBean("studentMSG");
        custA.setMessage("Message by student");
        System.out.println("Message : " + custA.getMessage());

        Student custB = (Student) context.getBean("studentMSG");
        System.out.println("Message : " + custB.getMessage());
    }
}

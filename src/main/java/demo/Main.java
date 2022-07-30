package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Doctor staff = context.getBean(Doctor.class);
    staff.assist();
    System.out.println(staff.getQualification());
//    staff = (Nurse) context.getBean("nurse"); // We can also get a class by its id, but we need to type cast it by the class name
//    staff.assist();

    }
}
 
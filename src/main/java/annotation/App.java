package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
//        ProgrammerDao pd = new ProgrammerDao()
//        ProgrammerDao pd = new ProgrammerDao()

        ApplicationContext app = new ClassPathXmlApplicationContext("conf/spring-service.xml");

        Programmer p = (Programmer) app.getBean("programmerDao");
        System.out.println(p.getClass());
        p.code("a");

        p.sleep();




    }

}

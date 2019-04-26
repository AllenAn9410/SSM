package annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
    Aop(){
        System.out.println("****aop****");
    }
    @Before(value = "execution(* annotation.Programmer.code(String)) && args(in)",argNames = "in")
    public void begin(String in){
        System.out.println("begin");
        System.out.println(in);
    }

    @After("execution(* annotation.Programmer.code(String))")
    public void close(){
        System.out.println("close");
    }
}

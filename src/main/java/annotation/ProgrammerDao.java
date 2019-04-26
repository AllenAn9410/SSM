package annotation;

import org.springframework.stereotype.Component;

@Component
public class ProgrammerDao implements Programmer {

    @Override
    public void code(String in) {
        System.out.println("coding");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}

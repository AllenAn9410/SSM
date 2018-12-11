package tools;

import org.junit.Test;

public class TestReadFile {
    @Test
    public void test() {
        String res = ReadFile.read("./pom.xml");
        System.out.println(res);

    }

    @Test
    public void test2(){
       int a =  ReadFile.count("./反叛的大魔王.txt");
       System.err.println(a);
    }


}

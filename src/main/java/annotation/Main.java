package annotation;


import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        Java3y j3 = new Java3y();

        Programmer p = (Programmer) Proxy.newProxyInstance(j3.getClass().getClassLoader(),j3.getClass().getInterfaces(),(proxy, method, arg1)->{
            if(method.getName().equals("code")){
                method.invoke(j3,arg1);
                System.out.println("i am comming");
            } else {
                return method.invoke(j3,arg1);
            }
            return null;
        });
        p.code();
    }
}

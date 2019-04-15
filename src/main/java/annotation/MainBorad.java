package annotation;

public class MainBorad {
    String cpu;
    VidioCard vs;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setVs(VidioCard vs) {
        this.vs = vs;
    }

    void run(){
        System.out.println("mainbord");
        System.out.println(vs.getName());
        vs.display();
        System.out.println("mainbord is running");

    }

}

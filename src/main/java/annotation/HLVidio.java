package annotation;

public class HLVidio implements VidioCard {
    String name = "HLVidio";

    void setName(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("HLVidio is runnint!");
    }

    @Override
    public String getName() {
        return name;
    }
}

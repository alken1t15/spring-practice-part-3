package kz.alken1t.alex;

public class ClassicalMusic implements Music  {

    private ClassicalMusic(){}
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Destroy my method");
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
}
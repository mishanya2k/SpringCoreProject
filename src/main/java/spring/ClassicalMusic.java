package spring;

public class ClassicalMusic implements IMusic{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("doing my destroying");
    }
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }

    @Override
    public String getAuthor() {
        return "Ludwig van Beethoven";
    }
}

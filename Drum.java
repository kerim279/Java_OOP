public class Drum implements Playable{
    private String brand;

    public Drum(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public void play() {

    }
}

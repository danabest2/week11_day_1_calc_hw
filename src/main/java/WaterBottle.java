public class WaterBottle {
    private int volume;

    public WaterBottle (int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public int getAdddrink(){
        return this.volume + 10;
    }
}



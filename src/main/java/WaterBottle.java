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

    public int getEmptyvolume() {
        return this.volume - this.volume;

    }

    public int getFill(){
        if (this.volume <= 100){
            return 100 - this.volume + this.volume;
        } else {
            return 100;
        }
    }
}



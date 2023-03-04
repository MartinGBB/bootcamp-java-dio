public class SmartTv {
    boolean on = false;
    int volume = 20;
    int channel = 10;

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void increaseVolume() {
        volume += 1;
    }

    public void decreaseVolume() {
        volume -= 1;
    }
}

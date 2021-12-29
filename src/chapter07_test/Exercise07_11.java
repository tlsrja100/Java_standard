package chapter07_test;

public class Exercise07_11 {
    public static void main(String[] args) {
        MyTv3 t = new MyTv3();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

class MyTv3 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    /*
    (1) 알맞은 코드를 넣어 완성하시오.
    */
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
            return;
        }
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        }
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}

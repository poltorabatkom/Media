package tsystems.maxim.ext;

public class Audio extends Media implements IPlayerRecord {
    //скорость воспроизведения файла
    int bitRate;
    public Audio() { bitRate = 64; }

    public void setBitRate(int bitRate){
        this.bitRate =  bitRate;
    }
    public void getBitRate(int bitRate){ System.out.println(this.bitRate); }

    @Override
    public void play() {
        System.out.println(String.format("Аудио воспроизводится с битрейдом: %s", bitRate));
    }
}

package tsystems.maxim.ext;

public class Video extends Media implements IPlayerRecord {
    //размер экрана
    VideoFormats fileVideoFormat;

    public Video() { fileVideoFormat = VideoFormats.RegularTV; }

    //вернуть формат файла
    public void getFileVideoFormat(){
        System.out.println(String.format("Видео имеет формат: %s",fileVideoFormat));
    }
    public void setFileVideoFormat(VideoFormats formats){
        fileVideoFormat = formats;
    }

    @Override
    public void play() {
        System.out.println(String.format("Видео воспроизводится в формате: %s", fileVideoFormat));
    }
}

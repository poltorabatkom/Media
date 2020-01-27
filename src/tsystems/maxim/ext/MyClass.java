package tsystems.maxim.ext;

import tsystems.maxim.ext.Audio;
import tsystems.maxim.ext.TypeMessage;

import java.util.Date;

public class MyClass {
    public static void main(String[] args){
        Audio a = new Audio();
        a.autor = "ivan";
        a.date = new Date();
        a.message = "Hallo Media";
        a.type = TypeMessage.COMMENT;
        a.bitRate = 144;
        a.play();

        Video v = new Video();
        v.autor = "mark";
        v.date = new Date();
        v.message = "Hallo Video";
        v.type = TypeMessage.RECORD;
        v.play();

        Image im = new Image();
        im.autor = "peter";
        im.date = new Date();
        im.message = "Hallo Image";
        im.type = TypeMessage.REPOST;
        im.print();

        AbstractRecord[] mas = new AbstractRecord[3];
        mas[0] = a;
        mas[1] = v;
        mas[2] = im;

        for(AbstractRecord element : mas)
            element.viewContents();
    }
}

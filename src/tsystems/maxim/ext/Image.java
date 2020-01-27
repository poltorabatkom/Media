package tsystems.maxim.ext;

import java.awt.*;

public class Image extends Media implements IPrintingRecord {
    Point pictureResolution;
    public Image(){
        pictureResolution = new Point(100,100);
    }

    public Point resizeFileResolution(Point newSize){
        pictureResolution= newSize;
        return pictureResolution;
    }

    public Point getFileResolution(){
        return pictureResolution;
    }

    @Override
    public void print() {
        System.out.println(String.format("Информация о файле расрешение: %d x %d", pictureResolution.x, pictureResolution.y));
    }
}

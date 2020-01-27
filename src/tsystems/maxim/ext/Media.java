package tsystems.maxim.ext;

public class Media extends AbstractRecord {
    @Override
    public int maxSizeFile(int size) {
        return size;
    }
    String path;
    public void sendFile(){
        System.out.println("Файл отправлен!");
    }
    public void setFilePath(String path){
        this.path = path;
        System.out.println("Путь к медиафайлу установлен!");
    }
}



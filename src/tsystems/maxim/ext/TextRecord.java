package tsystems.maxim.ext;

public class TextRecord extends AbstractRecord implements IPrintingRecord {
    String text;
    void setText(String text){
        this.text = text;
    }

    @Override
    public int maxSizeFile(int size) {
        return size;
    }

    @Override
    public void print() {
        System.out.println(String.format("Вывод текста на печать: \n %s", text));
    }
}

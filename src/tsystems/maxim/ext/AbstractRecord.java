package tsystems.maxim.ext;
import java.util.Date;

/**главный родительский класс
 */
public abstract class AbstractRecord {
    String autor;
    Date date;
    String message;
    TypeMessage type;

    /**выводит информацию обо всех полях
     */
    public void viewContents(){
        System.out.println(String.format("Field: autor = %s date = %s message = %s type = %s",autor,date,message,type));
    }

/**выводит информацию о максимальном размере записи
 */
    public abstract int maxSizeFile(int size);
}
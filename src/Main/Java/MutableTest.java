import java.util.Date;

/**
 * Created by user on 12.04.2017.
 */
public class MutableTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        changeDate (date);
        System.out.println(date);
    }


    private static void changeDate (Date date){
        date.setTime(0);}
}

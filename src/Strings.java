/**
 * Created by user on 12.04.2017.
 */
public class Strings {

    public static void main(String[] args) {
        String s = "мама мыла раму";
        String s1 = "мама мыла раму";
        System.out.println(s==s1);//true

        String s2 = new String("мама мыла раму");
        String s3 = new String("мама мыла раму");
        System.out.println(s2==s3);//false
    }
}

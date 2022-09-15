package exercises;
import java.util.Arrays;

public class WordArray {
    public static void main(String[] args) {
        String drSuess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

//        String[] stringArray = drSuess.split(" ");
        String[] stringArray = drSuess.split("\\.");
        System.out.println(Arrays.toString(stringArray));
    }
}

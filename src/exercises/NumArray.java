package exercises;
import java.util.Arrays;

public class NumArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};

//        for (int number: nums) {
//            System.out.println(number);

        for (int num : nums) {
            if (num % 2 != 0) {
                int sum = 0;
                sum += num;
                System.out.println(num);
            }
        }
    }
}

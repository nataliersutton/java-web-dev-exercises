package exercises;

import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(33);
        numbers.add(2);
        numbers.add(71);
        numbers.add(89);
        numbers.add(241);
        numbers.add(301);
        numbers.add(111);
        numbers.add(400);
        numbers.add(262);


        for(int num : numbers) {
            int sum = 0;
            sum += num;
            System.out.println(sum);
            }
        }
//        System.out.println(numbers);
    }

package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class zeroLeftside {

    public static void main(String[] args) {

        int[] arr = {1,2,0,6,7,0,8,9,0};

        final  List<Integer> unique = new ArrayList<>();
        final List<Integer> numbers = new ArrayList<>();

        for (Integer a:arr) {

            if (a==0)
            {
                numbers.add(a);
            }
            else {
                unique.add(a);
            }

        }
        numbers.addAll(unique);
        System.out.println(numbers);

        }
}

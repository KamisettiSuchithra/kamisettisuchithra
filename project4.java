package suchithra;

import java.util.HashMap;
import java.util.Map;

public class project4 {

    public static void main(String[] args) {
        int[] number = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            count.put(i, 0);
        }

        for (int num : number) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    count.put(i, count.get(i) + 1);
                }
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ":" + count.get(i));
        }
    }
}

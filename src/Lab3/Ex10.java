package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введите размер массива: ");
        int length = in.nextInt();

        Integer[] intArray = new Integer[length];

        for(int i = 0; i < length; i++){
            intArray[i] = rand.nextInt(200);
        }

        Arrays.sort(intArray, Collections.reverseOrder());

        for(int i = 0; i < length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}

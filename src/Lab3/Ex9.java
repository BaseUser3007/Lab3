package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введите размер массива: ");
        int length = in.nextInt();

        int[] intArray = new int[length];
        int minNum = 2147483647;
        for(int i = 0; i < length; i++){
            intArray[i] = rand.nextInt(200);
            if(intArray[i] < minNum)
                minNum = intArray[i];
        }

        for(int i = 0; i < length; i++){
            if(intArray[i] == minNum)
                System.out.printf("индекс: %d, число: %d\n",i, intArray[i]);
        }
    }
}

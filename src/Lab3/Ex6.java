package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int length = 0;

        while(true){
            System.out.print("Введите размер массива: ");
            if(in.hasNextInt() != true){
                in.next();
                System.out.println("Введите корректное значение");
            }
            length = in.nextInt();
            if (length > 0){
                    break;
            }
            else{
                System.out.println("Введите значение > 0");
            }
        }

        int[] numbers =  new int[length];

        for(int i = 0; i != length; i++){
            numbers[i] = 5 * i + 2;
        }

        for(int nuber : numbers){
            System.out.print(nuber);
            if(nuber != numbers[numbers.length-1])
                System.out.print(" ");
            else
                System.out.println();
        }

    }
}

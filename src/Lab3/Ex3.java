package Lab3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности: ");
        int length = in.nextInt();

        while (length<3){
            System.out.println("последовательность слишком маленькая");
            length = in.nextInt();
        }

        FirstWay(length);
        SecondWay(length);
    }

    public static void FirstWay(int length){
        int[] fibonacciNumbers = new int[length];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;

        for(int i = 2; i < length; i++){
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
        }
        for (int number : fibonacciNumbers){
            System.out.printf("%d ",number);
        }
        System.out.println();
    }

    public static void SecondWay(int length){
        int firstLastNumber = 1;
        int secondLastNumber = 1;
        int number = 1;
        System.out.printf("%d ",firstLastNumber);
        System.out.printf("%d ",secondLastNumber);
        while(length-2 > 0){
            number = firstLastNumber + secondLastNumber;
            System.out.printf("%d ", number);
            secondLastNumber = firstLastNumber;
            firstLastNumber = number;
            length--;
        }
        System.out.println();
    }

}

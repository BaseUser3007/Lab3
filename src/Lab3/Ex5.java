package Lab3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите колличество чисел в сумме");
        int number = in.nextInt();

        FirstWay(number);
        SecondWay(number);
    }

    private static void SecondWay(int number) {
        for(int i = 7; number > 0; i++){
            if(i % 5 == 2 && i % 3 == 1){
                System.out.print(i + " ");
                number--;
            }
        }
        System.out.println();
    }

    private static void FirstWay(int number) {
        int temp = 7;
        while (number != 0){
            if(temp % 5 == 2 && temp % 3 == 1){
                System.out.print(temp + " ");
                number--;
            }
            temp += 15;
        }
        System.out.println();
    }
}

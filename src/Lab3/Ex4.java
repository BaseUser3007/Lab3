package Lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 целых числа");
        int first = in.nextInt(), second = in.nextInt();

        FirstWay(first, second);
        SecondWay(first, second);
    }

    private static void FirstWay(int first, int second) {
        if(first > second){
            int temp = second;
            second = first;
            first = temp;
        }

        for (int i = first; i <= second; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void SecondWay(int first, int second) {
        if(first > second){
            int temp = second;
            second = first;
            first = temp;
        }

        while (first <= second){
            System.out.print(first++ + " ");
        }
        System.out.println();
    }
}

package Timus;

import java.util.Scanner;

public class task_1493 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String tiket = in.nextLine();

        int firstNumber = SumChar(tiket.substring(0, 3));
        int secondNumber = SumChar(tiket.substring(3, 6));

        if(secondNumber - 1 == firstNumber && tiket.toCharArray()[5] != '0' || secondNumber + 1 == firstNumber && tiket.toCharArray()[5] != '9')
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    public static int SumChar(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}

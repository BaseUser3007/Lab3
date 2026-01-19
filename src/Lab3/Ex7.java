package Lab3;

import java.util.Scanner;

public class Ex7 {
    public static void main( String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int length = in.nextInt();

        char[] charArray = new char[length];

        char currentChar = 'a';
        for (int i = 0; i < length; i++) {
            charArray[i] = currentChar;
            currentChar += 2;
        }

        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}

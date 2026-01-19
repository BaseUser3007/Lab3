package Timus;

import java.util.Scanner;

public class task_1191 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int L = in.nextInt(),N = in.nextInt();
        int[] buses = new int[N];
        for(int i = 0; i < N; i++){
            buses[i] = in.nextInt();
        }

        int wait = 0;

        for(int bus : buses){
            if(L<bus){
                System.out.println("YES");
                return;
            }
            while ((L - wait) % bus != 0) {
                ++wait;
            }
            L -= wait;
            wait = 0;
        }
        System.out.println("NO");
    }
}

package Lab3;

public class Ex8 {
    public static void main(String[] args){
        int length = 10;

        char[] charArray = new char[length];

        char currentChar = 65;
        while(length != 0){
            if(currentChar != 65 && currentChar != 69 && currentChar != 73)
                System.out.print(currentChar++ + " ");
            else{
                currentChar++;
                continue;
            }
            length--;
        }
    }
}

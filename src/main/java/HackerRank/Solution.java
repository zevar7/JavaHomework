package HackerRank;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();

        if(x%2!=0){
            System.out.println("Weird");
        }
        else
            if(2 <= x && x <= 5) {
                System.out.println("Not Weird");
            }
            else
                if(6 <= x && x <= 20){
                    System.out.println("Weird");
                }
                if(x%2==0 && x>20){
                    System.out.println("Not Weird");
                }

    }
}

package Java;

import java.util.Scanner;

public class SearchGame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Mynumber=(int)(Math.random()*100);
        int usernumber;
        do {
            System.out.println("Guess the Number: ");
            usernumber=sc.nextInt();
            if(usernumber == Mynumber){
                System.out.println("WOW!!!! Task Completed");
                break;
            } else if (Mynumber < usernumber) {
                System.out.println("OOps.. Your number is bigger :( ");
            } else {
                System.out.println("OOps.. Your number is smaller :( ");
            }
        }while (usernumber >= 0);
        System.out.println("My number was :");
        System.out.println(Mynumber);
    }
}

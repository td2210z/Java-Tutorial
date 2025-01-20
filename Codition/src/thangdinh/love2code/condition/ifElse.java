package thangdinh.love2code.condition;

import java.util.Scanner;

public class ifElse {


    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }




        int time2 = 20;
        String res = (time2 < 16) ? "yes" : "no";

        System.out.println(res);



    }
}

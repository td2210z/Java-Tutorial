package dinhthang.love2code.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student2 a = new Student2("thang" , "22/10/2020", 1990);
        Student2 b = new Student2("dinh" , "22/10/2021", 1992);

        System.out.println(a.getDem());
        System.out.println(b.getDem());
    }
}

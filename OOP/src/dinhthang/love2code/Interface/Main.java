package dinhthang.love2code.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        for (int i =1 ;i <= 4; i++){
            System.out.println("so test case hien tai " + i + "\n");

            String name = cs.nextLine();
            String ns = cs.nextLine();

            double gpa = cs.nextDouble();
            cs.nextLine();

            Student s = new Student(name, ns, gpa);

            a.add(s);
        }
        Collections.sort(a , new SortGpa());
        for (Student s : a) {
            System.out.println(s);
        }
    }
}

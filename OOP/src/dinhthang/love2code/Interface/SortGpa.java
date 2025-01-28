package dinhthang.love2code.Interface;

import java.util.Comparator;

public class SortGpa implements Comparator<Student> {



    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() == s2.getGpa()) {
            return s1.getName().compareTo(s2.getName());
        }
        return s1.getGpa() > s2.getGpa() ? -1 : 1;
    }
}

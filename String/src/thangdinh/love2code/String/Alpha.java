package thangdinh.love2code.String;

public class Alpha {
    public static void main(String[] args) {
        String s = "jva 2210thang JACK thien.an.com";
        int digit = 0, lower = 0, upper = 0, special = 0;
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) digit++;
            else if(Character.isLowerCase(x)) lower++;
            else if(Character.isUpperCase(x)) upper++;
            else special++;
        }
        System.out.println("digit: " + digit);
        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);
        System.out.println("special: " + special);
    }
}

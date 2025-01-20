package thangdinh.love2code.String;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        String s1 = "18238128381283812381123123123123";
        String s2 = "192399239192393";

        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.mod(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.divide(b2));
    }
}

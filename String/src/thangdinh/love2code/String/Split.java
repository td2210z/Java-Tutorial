package thangdinh.love2code.String;

import java.util.StringTokenizer;

public class Split {
    public static void main(String[] args) {
        String s = "thang dinh nguyen la tao day";

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

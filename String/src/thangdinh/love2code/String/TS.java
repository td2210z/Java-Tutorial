package thangdinh.love2code.String;

import java.util.Map;
import java.util.TreeMap;

public class TS {
    public static void main(String[] args) {
        String s = "ThangDinhthangthang";

        /*int[] cnt = new int[256];

        for (char x : s.toCharArray()) {
            cnt[x]++;
        }
        for (int i =0; i< 256; i++) {
            if(cnt[i] != 0){
                System.out.println((char) i + " " + cnt[i]);
            }

        }*/


        TreeMap<Character , Integer> v= new TreeMap<>();

        for (char x: s.toCharArray()) {
            if(v.containsKey(x)){
                int count = v.get(x);
                count++;
                v.put(x,count);
            } else{
                v.put(x,1);
            }
        }

        for (Map.Entry<Character , Integer> x: v.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}

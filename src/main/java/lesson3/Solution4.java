package lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {

    public static void  massveUnic(String s) {
       char[] temp = s.toLowerCase().toCharArray();
       Arrays.sort(temp);
       ArrayList<Character> trek = new ArrayList();
       for (int i = 0; i < temp.length - 1; i ++){
            if(temp[i] != temp[i+1]) trek.add(temp[i]);
            else continue;
        }

       for (int f =0; f< trek.size() -1;f++) {
            System.out.print(trek.get(f));
       }
    }



    public static void main(String[] args) {
        String str = "Я у мамы программист";
        massveUnic(str);
    }
}

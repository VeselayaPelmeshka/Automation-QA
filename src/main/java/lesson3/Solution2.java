package lesson3;

public class Solution2 {
    public static void main(String[] args) {
        String str = "Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался";
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i ++){
            if (temp[i] == 'р') temp[i] = '*';
        }

        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i]);
        }
    }

}

package lesson3;


import java.util.Random;


public class Solution3 {
    public static void frames(int t){
        if (t >= 5 && t <= 155){
            if (t > 25 && t < 100) System.out.println("Число "+ t+" содержится в интервале (25;100)");
            else {System.out.println("Число "+ t+" не содержится в интервале (25;100)");}
        }
        else {System.out.println("Число "+t+" не попало в [5;155]");}
    }
    public static void main(String[] args) {
        Random random = new Random();
        int n = (155 - random.nextInt(155) + 5);
        frames(n);
    }
}

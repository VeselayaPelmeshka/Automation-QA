package lesson2;

public class Solution4 {

    public static  void printSumOfNmbers(int n) {
        int sum = 0;
        if (n < -100 || n >= 100) System.out.println("Bad number");
        else if (n < 0) {
            sum = (n / 10 + (n - (n / 10) * 10)) * (-1);
        } else {
            sum = n / 10 + (n - (n / 10) * 10);

        }
        System.out.println(sum);
    }


    public static void main(String[] args) {

        int n = -9;
        printSumOfNmbers(n);


    }
}

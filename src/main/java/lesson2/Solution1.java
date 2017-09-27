package lesson2;

public class Solution1 {

    public static void printDivision(int n, int j){
        System.out.println(n+"/"+j+" = "+ n/j+" и "+ n%j+ " в остатке");
    }

    public static void main(String[] args) {
        int n = 18;
        int j = 3;
        printDivision(n,j);
    }
}

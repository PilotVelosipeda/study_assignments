package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();

        GFG variable = new GFG();
        variable.swapTheValuesUsingThtThridVariable(a,b);
    }
}

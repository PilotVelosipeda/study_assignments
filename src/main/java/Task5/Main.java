package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");

        GFG binary = new GFG();
        binary.conversionToBinaryCode(n);
    }
}

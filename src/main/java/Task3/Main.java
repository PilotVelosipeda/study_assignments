package Task3;

public class Main {

       // System.out.println("Привет мир");

       // int a = 2;
       // int b= 3;
       // System.out.println(a + b);

        class GFG {
            public int sum(int num1, int num2) {
                return num1 + num2;
            }

            public void main(String[] args) {
                GFG calculator = new GFG();
                int sum = calculator.sum(2,3);
                System.out.println(sum);
            }
    }
}

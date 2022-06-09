import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner inputDollars = new Scanner(System.in);
        System.out.print("Please input the cents: ");
        Integer amount = inputDollars.nextInt();
        Integer dollars = amount / 100; 
        Integer cents = amount % 100;
        System.out.printf("The value is %d%s%d%s", dollars, " dollars and ", cents, " cents.");
        inputDollars.close();
    }
}

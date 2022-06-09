import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Double pi = Math.PI;
        Scanner inputRadius = new Scanner(System.in);
        System.out.print("Please input the radius: ");
        Integer inputNum = inputRadius.nextInt();
        Double area = inputNum * inputNum * pi;
        System.out.printf("The radius is: %d%s%.15f", inputNum, " The area is: ", area);
        System.out.printf("%n");
        inputRadius.close();
    }
}

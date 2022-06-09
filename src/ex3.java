import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Give me a number: ");
        Integer num = inputNum.nextInt();
        Integer times2 = num * 2;
        Integer times3 = num * 3;
        Integer times4 = num * 4;
        Integer times5 = num * 5;
        Integer times6 = num * 6;
        Integer times7 = num * 7;
        Integer times8 = num * 8;
        Integer times9 = num * 9;
        Integer times10 = num * 10;
        System.out.printf("%d%s%d", num, " x 1= ", num);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 2= ", times2);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 3= ", times3);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 4= ", times4);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 5= ", times5);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 6= ", times6);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 7= ", times7);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 8= ", times8);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 9= ", times9);
        System.out.printf("%n");
        System.out.printf("%d%s%d", num, " x 10= ", times10);
        System.out.printf("%n");
        inputNum.close();
    }
}

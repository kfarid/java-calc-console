import java.util.Scanner;

public class Hello {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number 1:  ");
        int num1 = in.nextInt();
        System.out.println("input a number 2:  ");
        int num2 = in.nextInt();

        System.out.println("select operation \n1 + \n 2 - \n 3 * \n 4 / \n 5 %");
        int sel = in.nextInt();

        switch (sel) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Your not selected operation");
        }

        in.close();
    }
}

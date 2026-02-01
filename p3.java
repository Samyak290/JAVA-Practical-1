import java.util.*;
public class P3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("Result: Distinction, Grade:A");
        } else if (marks >= 60) {
            System.out.println("Result: First Class, Grade:B");
        } else if (marks >= 40) {
            System.out.println("Result: Pass, Grade:c");
        } else {
            System.out.println("Result: Fail, Grade:F");
        }
    }
}


public class p3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operator : ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                    System.out.println("Result = " + ((float) a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}


public class p3_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series is :");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class p3_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


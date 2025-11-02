import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.print("Enter the operation( + , - , * , / ) you want to perform: ");
        char op=sc.next().charAt(0);
        float a,b;
        switch(op){
            case '+':
            System.out.print("Enter first number: ");
            a=sc.nextFloat();
            System.out.print("Enter second number: ");
            b=sc.nextFloat();
            System.out.println(a+" + "+b+" = "+(a+b));
            break;

            case '-':
            System.out.print("Enter first number: ");
            a=sc.nextFloat();
            System.out.print("Enter second number: ");
            b=sc.nextFloat();
            System.out.println(a+" - "+b+" = "+(a-b));
            break;

            case '*':
            System.out.print("Enter first number: ");
            a=sc.nextFloat();
            System.out.print("Enter second number: ");
            b=sc.nextFloat();
            System.out.println(a+" * "+b+" = "+(a*b));
            break;

            case '/':
            System.out.print("Enter first number: ");
            a=sc.nextFloat();
            System.out.print("Enter second number: ");
            b=sc.nextFloat();
            System.out.println(a+" / "+b+" = "+(a/b));
            break;
            
            default:
            System.out.println("Inavlid operation.");
        }
    }
}

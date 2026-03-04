import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println();
            System.out.println("1 Square Root");
            System.out.println("2 Factorial");
            System.out.println("3 Natural Log");
            System.out.println("4 Power");
            System.out.println("5 Addition");
            System.out.println("6 Subtraction");
            System.out.println("7 Multiplication");
            System.out.println("8 Division");
            System.out.println("9 Exit");
            System.out.println("Enter your choice : ");

            int choice = sc.nextInt();

            if(choice==1)
            {
                System.out.println("Enter the number :");
                double n = sc.nextDouble();
                System.out.println("Square root of "+n+" is : "+Math.sqrt(n));
            }
            else if(choice==2)
            {
                System.out.println("Enter the number :");
                int n = sc.nextInt();
                int fact=1;

                for(int i=1;i<=n;i++)
                    fact=fact*i;

                System.out.println("Factorial of "+n+" is : "+fact);
            }
            else if(choice==3)
            {
                System.out.println("Enter the number :");
                double n = sc.nextDouble();
                System.out.println("Log of "+n+" is : "+Math.log(n));
            }
            else if(choice==4)
            {
                System.out.println("Enter the first number :");
                double a = sc.nextDouble();
                System.out.println("Enter the second number :");
                double b = sc.nextDouble();
                System.out.println(a+" power "+b+" is : "+Math.pow(a,b));
            }
            else if(choice==5)
            {
                System.out.println("Enter first number :");
                double a = sc.nextDouble();
                System.out.println("Enter second number :");
                double b = sc.nextDouble();
                System.out.println("Result : "+(a+b));
            }
            else if(choice==6)
            {
                System.out.println("Enter first number :");
                double a = sc.nextDouble();
                System.out.println("Enter second number :");
                double b = sc.nextDouble();
                System.out.println("Result : "+(a-b));
            }
            else if(choice==7)
            {
                System.out.println("Enter first number :");
                double a = sc.nextDouble();
                System.out.println("Enter second number :");
                double b = sc.nextDouble();
                System.out.println("Result : "+(a*b));
            }
            else if(choice==8)
            {
                System.out.println("Enter first number :");
                double a = sc.nextDouble();
                System.out.println("Enter second number :");
                double b = sc.nextDouble();
                System.out.println("Result : "+(a/b));
            }
            else
                break;
        }
    }
}

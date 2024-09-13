import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welome to my calculator!");
        System.out.println("Enter your first number.");
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        System.out.println("What operation would you like to do?");
        System.out.println("Please use either +,--,*,% or /");
        String operation = s.next();
        System.out.println("Enter your second number.");
        int second = s.nextInt();
        System.out.println("Answer: ");
        if(operation.equals("+"))
        {
            System.out.println((first + second));
        }
        if(operation.equals("--"))
        {
            System.out.println((first - second));
        }
        if(operation.equals("*"))
        {
            System.out.println((first * second));
        }
        if(operation.equals("/"))
        {
            if(second != 0){
                System.out.println((first / second));
            }
            else
            {
                System.out.println("Division by 0 not possible");
            }
        }
        if(operation.equals("%"))
        {
            System.out.println(first % second);
        }
        s.close();
    }
}

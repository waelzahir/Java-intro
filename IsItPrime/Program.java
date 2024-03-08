import java.util.Scanner;  
import java.lang.Math; 

public class Program {
    public static void  main(String[] args) {
		Scanner scan=new Scanner(System.in); 
        int number = 0;
        try {
             number = scan.nextInt();
            
        } catch (Exception e) {
            System.out.println("IllegalArgument");
            System.exit(0);
        } 
        if (number < 2)
        {
            System.out.println("IllegalArgument");
            System.exit(0);
        }

        System.out.println(Program.isprime(number));
 	}
    public static int isprime(int number) {
            if (number == 2 || number == 3)
            {
                System.out.print("true ");
                return 1;
            }
            if (number % 2 != 1)
            {
                System.out.print("false ");
                return 1;
            }
            int i = 2;
            int limit =  (int)Math.sqrt(number);
            while (i < limit + 1)
            {
                if (number % i == 0)
                {
                    System.out.print("false ");
                    return i;
                }
                i++;
            }
            System.out.print("true ");
            return i;
    }
}


import java.util.Scanner;  

public class Program {
 

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
        int requests = 0;
        while (true)
        {
            int number = scan.nextInt();
            if (number == 0 || number == 1)
             continue ;
            if (number == 42)
                break;
            number = Program.acuumilate(number);
            if (Program.isprime(number))
            {
                requests++;
            }
        }
        System.out.print("Count of coffee-request :");
        System.out.println(requests);
    }
    private static int acuumilate(int number) {
        int acumilator = 0;
		number = (number > 0) ? number : number * -1;
		while (number > 0) {
			acumilator += number % 10 ;
			number /=  10;
		}
        return acumilator;
    }

    public static boolean isprime(int number) {
        if (number == 2 || number == 3)
            return true;
        if (number % 2 != 1)
            return false;
        int i = 2;
        int limit =  (int)Math.sqrt(number);
        while (i < limit + 1)
        {
            if (number % i == 0)
                return false;
            i++;
        }
        return true;
}
}


// must be processed in time
// 
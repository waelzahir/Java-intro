public class Program{
    public static void  main(String[] args) {
		int number = -479598;
		int acumilator = 0;
		number = (number > 0) ? number : number * -1;
		while (number > 0) {
			acumilator += number % 10 ;
			number /=  10;
		}
		System.out.println(acumilator);
 	}
}


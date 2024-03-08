import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program   {
    
    public static void main(String[] args) {
        try
        {

            Scanner scan = new Scanner(System.in);
            int week  =0;
            String line = "ss";
            HashMap<Integer, Integer> map = new HashMap<>();
            while (week != 18)
            {
                int wee  =0;
                line = scan.nextLine();
                if (line.equals("42"))
                    break ;
                week++;
                String[] metadatasplit = line.split(" ");
                if (!metadatasplit[0].equals("Week") )
                    throw  new Exception();        
                wee = Integer.parseInt(metadatasplit[1]) ;
                if (wee > 18)
                    throw  new Exception();
                line = scan.nextLine();
                metadatasplit = line.split(" ");
                int ming = Program.getMin(metadatasplit);
                if (ming < 1 || ming >1 || map.containsKey(wee))
                    throw  new Exception();
                    map.put(wee, ming);
                }
                Program.PrintRes(map);
                scan.close();
            }
            catch (Exception e){
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
        }
        private static void PrintRes(HashMap<Integer, Integer> map)
        {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int week = entry.getKey();
            int val = entry.getValue();
            System.out.println("Week " + week + " " + "-".repeat(val) + ">");
        }

    }
    private static int getMin(String[] grades)
    {
        int min = 10;
        for (int i = 0 ; i < grades.length ; i++)
        {
            int grade = Integer.parseInt(grades[i]);
          

            min = grade < min ? grade : min;
        }
        return min;
    }
   

}


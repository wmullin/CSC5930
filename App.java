import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); 
        int multiplier;
        //***THIS WILL ONLY WORK ON A FRIDAY AS IMPLEMENTED***
        switch (day) {
            case Calendar.SUNDAY:
                // Current day is Sunday
                break;
            case Calendar.MONDAY:
                // Current day is Monday                
                break;
            case Calendar.TUESDAY:
                // Current day is Tuesday
                break;
            case Calendar.WEDNESDAY:
                // Current day is Wednesday
                break;
            case Calendar.THURSDAY:
                // Current day is Thursday
                break;
            case Calendar.FRIDAY:
                // Current day is Friday
                ArrayList<Integer> Array = new ArrayList<Integer>();
                Random rand = new Random();
                int cap = 10;
                String s = "";
                for (int i = 0; i < 5; i++){
                    int digit = rand.nextInt(cap); 
                    Array.add(digit);
                }
                Collections.shuffle(Array);
                for (Integer x : Array) {
                    s += x.toString();
                }
                
                Integer result = Integer.parseInt(s);
                //+1 is so no multiply by zero
                multiplier = rand.nextInt(cap) + 1;
                //No negative Numbers
                int num = Math.abs(result * result * multiplier);
                String input = ""+ num;
                String first10 = "";
 
                if (input.length() > 10) 
                {
                    first10 = input.substring(0, 10);
                } 
                else
                {
                    first10 = input;
                }
                
                System.out.println(first10);
                break;
            case Calendar.SATURDAY:
                // Current day is Saturday
                break;
        }
    }
}

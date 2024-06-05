import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius (1) or celsius to Fahrenheit (2) ");
        int result = sc.nextInt();

        if(result == 1){
            // calculate fahrenheit to celsius
            System.out.println("You have to chosen Fahrenheit to Celsius ! ");
            System.out.println("Enter Fahrenheit Value:");
            double value = sc.nextInt();
            double FinalValue=(value - 32)*5/9;
            System.out.print(" Celsius ");
            System.out.println(Math.round(FinalValue*10.0/10.0));
        } else if (result == 2) {
            // Calculate Celsius to Fahrenheit
            System.out.println("You have to chosen Celsius to  Fahrenheit ! ");
            System.out.println("Enter Celsius Value:");
            double value2= sc.nextInt();
            double FinalValue = ( value2 * 9/5 )+32;
            System.out.print(" Fahrenheit ");
            System.out.println(Math.round(FinalValue*10.0/10.0));
        }else{
            System.out.println(" Invalid Input Number ");
        }
    }
}

import java.util.Scanner;
public class ScientificCalculator {
    public static void main(String[] args) {
    }
    public static void displayMenu(){
    }
    public static double add(double first,double second){
        return first+second;
    }
    public static double subtract(double first,double second){
        return first-second;
    }







    public static void performOperation(Scanner scanner){
        switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
        }
    }                        
}
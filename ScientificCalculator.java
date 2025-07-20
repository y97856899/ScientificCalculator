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
    public static double multiply(double first,double second){
        return first*second;
    }
    public static double divide(double first,double second){

        if (second==0){
            System.out.println("Error: division by zero");
            return 0;
        }
        return first/second;
    }
    public static double calculateSquareRoot(double num){
        if (num <0){
            System.out.println("Error: Cannot calculate the square root of a negative number.");
            return 0;
        }
        return Math.sqrt(num);
    }
    public static double calculatePower(double base, double exponent){
        return Math.pow(base,exponent);
    }
    public static double calculateSine(double degrees){
        double result = Math.toRadians(degrees);
        return Math.sin(result);
    }
    public static double calculateCosine(double degrees){
        double result = Math.toRadians(degrees);
        return Math.cos(result);
    }
    public static double calculateTangent(double degrees){
        if(degrees%180 == 90){
            System.out.println("Error ");
            return 0;
        }
        double result = Math.toRadians(degrees);
        return Math.tan(result);
    }
    public static double calculateNaturalLogarithm(double num){
        if(num <=0){
            System.out.println("Error: log(x) is undefined for x <= 0");
            return 0;
        }
        return Math.log(num);
    }
    public static double calculateLogarithmBase10(double num){
        if(num <=0){
            System.out.println("Error: log10(x) is undefined for x <= 0.");
            return 0;
        }
        return Math.log10(num);
    }
    public static double absolute(double num){
        return Math.abs(num);
    }
    




    public static void performOperation(Scanner scanner){
        switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;  
                    case 4:
                        result = divide(num1, num2);
                        break;
                    case 5:
                        result = calculateSquareRoot(num1);
                        break;       
                    case 6:
                        result = calculatePower(num1, num2);
                        break;
                    case 7:
                        result = calculateSine(num1);
                        break;      
                    case 8:
                        result = calculateCosine(num1);
                        break;
                    case 9:
                        result = calculateTangent(num1);
                        break;        
                    case 10:
                        result = calculateNaturalLogarithm(num1);
                        break;
                    case 11:
                        result = calculateLogarithmBase10(num1);
                        break;
                    case 12:
                        result = absolute(num1);
                        break;                
        }
    }                        
}
import java.util.Scanner;
class Bmi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the BMI calculation console! \nEnter your weight : ");
        double weight = input.nextDouble();
        System.out.print("Enter your Height :");
        double height = input.nextDouble()/100;
        
        String outputMessage = String.format("You're %s, and your BMI score is %f", Interpretation(BMICALCULATOR(height, weight)),BMICALCULATOR(height, weight));
        System.out.println(outputMessage);
        input.close();
    }
    public static double BMICALCULATOR(double Height , double Weight){
        return Weight / (Math.pow(Height, 2));
    }
    public static String Interpretation(double BMI){
        if(BMI <18.5) return "underweight";
        if(BMI>=18.5 && BMI <25) return "Normal";
        if(BMI>=25 && BMI<30) return "overweight";
        if(BMI>=30) return "obese";

        return "";
    }
}
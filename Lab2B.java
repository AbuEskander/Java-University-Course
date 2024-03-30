import java.util.Scanner;
class Lab2B{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0/9)*(fahrenheit-32);
        String OutputMessage = String.format("Fahrenheit : %f  is  %f in celsius", fahrenheit,celsius);
        System.out.println(OutputMessage);
        input.close();
    }
} 
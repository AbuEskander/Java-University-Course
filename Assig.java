import java.text.MessageFormat;
import java.util.Scanner;

class payment{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial Loan amount: ");
        double LoanAmount = input.nextDouble();
        System.out.print("Enter How long the loan will take: ");
        int Years = input.nextInt();
        System.out.print("Enter the Monthly intrest: ");
        double intrestRate = input.nextDouble()/100;
        double Monthly =  monthlyPayment(Years, intrestRate, LoanAmount);
        double Total = TotalPayment(Monthly, Years);
        String FormatedString = String.format("The Total Payment is: %f \n and the monthly payment is : %f",Total,Monthly);
        System.out.println(FormatedString);
        System.out.println("Hehe");
        System.out.println("Hehe");


    }
    public static double  monthlyPayment(int years,double intrestRate, double loanAmount){
        double Payment = (loanAmount *intrestRate)/(1-(1/Math.pow(1+intrestRate,years*12)));
        return Payment;
    }
    public static double TotalPayment (double monthlyPayment,int years){
        return monthlyPayment *(years*12);
        
    }
}
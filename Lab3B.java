import java.util.*;

class NumSqrCube{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Value : ");
        double First= input.nextInt();
        double SquaredFirst =  Math.pow(First, 2);
        double CubedFirst =  Math.pow(First, 3);
        System.out.print("Enter the Second Value : ");
        double Sec = input.nextInt();
        double SquaredSecond = Math.pow(Sec, 2);
        double CubedSecond = Math.pow(Sec, 3);
        System.out.println("Number  Square  Cube");
       for(double i = First;i<=Sec;i++){
        System.out.println(i+"    "+Math.pow(i, 2)+"    "+Math.pow(i, 3));

       }

    }
}
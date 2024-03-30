import java.util.*;

public class Negative {

public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int Num,count=0 ;
    do{
        System.out.print("Enter a negative int : ");
        Num= input.nextInt();
        if(Num>=0) count++;
    }while(Num>=0);

    System.out.println("Number of Postives : "+count);
    System.out.println("The Negative number : "+Num);

}    

}
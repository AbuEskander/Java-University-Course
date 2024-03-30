import java.util.*;

class NewExp {
    public static void main (String[] args ){
     Scanner input = new Scanner(System.in);
     int[]Inputs = {0,0,0};
     System.out.println("Enter 3 values:  ");
     
     for(int i = 0;i<3;i++){
        System.out.printf("%d Value: ",i+1);
        Inputs[i]=input.nextInt();
     }
     int Max = Inputs[0];
     for (int i : Inputs) {
        if(Max<i) Max = i;
     }
     System.out.printf("The largest Number is : %d",Max );
     
    }
}
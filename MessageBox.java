import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class MessageBox{
    public static void main(String[] args ){
        displayNameAndFaculty("Basil", "Engineering");
        displayMathOperation();
        inputNameAndFacultyAndShowThem();
    }
    //Q1.:Write a java program that displays your name on a message box and displays the name of your faculty on another message box.
    public static void displayNameAndFaculty(String name , String Faculty){
        JOptionPane.showMessageDialog(null, name);
        JOptionPane.showMessageDialog(null, Faculty);
    }
    //Q2.:Write a java program that declares two integer variables x and y and stores
    // And shows in one Message box : 1-sum of X & y 2- sub of X&y 3- 3-mult of X&y 4- Div of X&y
    public static void displayMathOperation(){
        JFrame frame = new JFrame("Calculator");
        
        JPanel panel = new JPanel();

        JTextField x = new JTextField(5);
        JTextField y = new JTextField(5);

        panel.add(new JLabel("X : "));
        panel.add(x);
        panel.add(new JLabel("Y : "));
        panel.add(y);

        int result = JOptionPane.showConfirmDialog(null,panel,"Enter Inputs :",JOptionPane.OK_CANCEL_OPTION);

        if (result != JOptionPane.OK_CANCEL_OPTION) {
            // Retrieve input values
            String input1 = x.getText();
            String input2 = y.getText();
            int X = Integer.parseInt(input1);
            int Y = Integer.parseInt(input2);
            // Do something with the inputs (e.g., print them)
            String Output = String.format("Sum of X & y : %d\nSub of X&y : %d\nMult of X&y : %d\nDiv of X&y : %d", X+Y,X-Y,X*Y,X/Y);
            JOptionPane.showMessageDialog(null,Output);
        } else {
            System.out.println("User canceled the input dialog.");
        }
    } 
    //Q3.Write a java program that asks the user to enter his name then to enter the
    //name of his university. After that the program will print his name and his
    //university over one message box.
    public static void inputNameAndFacultyAndShowThem(){
        JFrame frame = new JFrame("ID");
        

        JPanel panel = new JPanel();

        JTextField name = new JTextField(10);
        JTextField fac = new JTextField(10);

        panel.add(new JLabel("Enter name : "));
        panel.add(name);
        panel.add(new JLabel("Enter University :"));
        panel.add(fac);

        int result = JOptionPane.showConfirmDialog(null, panel,"Enter inputs :",JOptionPane.OK_CANCEL_OPTION);
        
        if (result != JOptionPane.OK_CANCEL_OPTION){
            String n = name.getText();
            String f = fac.getText();

            String OutputMessage = String.format("Name : %s \nUniversity : %s",n,f);
            JOptionPane.showMessageDialog(null, OutputMessage);
        }else{
            System.out.print("Error");
        }
    }

}
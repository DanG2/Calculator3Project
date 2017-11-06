import javax.swing.*;

public class Calculator3 {
    public static void main(String[] args) {
        String stringNumb1= new String(JOptionPane.showInputDialog("Please enter an integer"));
        String stringNumb2= new String(JOptionPane.showInputDialog("Please enter a second integer value"));
        Integer number1=new Integer(stringNumb1);
        Integer number2=new Integer(stringNumb2);
        Integer add1=new Integer(add(number1,number2));
        Integer sub1=new Integer(subtract(number1,number2));
    }
    public static Integer add (Integer a, Integer b){
        return a+b;
    }
    public static Integer subtract(Integer a, Integer b){
        System.out.println("yuh");
    }
}
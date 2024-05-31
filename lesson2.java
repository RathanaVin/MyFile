import java.util.Scanner;
import javax.swing.*;

public class lesson2{      //Input show Message Box
    public static void main(String[] args){
        Scanner show = new Scanner(System.in);
        int id;
        String name,sex;
        float salary;
        System.out.print("Input your id");
        id = show.nextInt();
        System.out.print("Input your name");
        name = show.next();
        System.out.print("Input your sex");
        sex = show.next();
        System.out.print("Input your Salary");
        salary = show.nextFloat();
        JOptionPane.showMessageDialog(null,"Your ID :"+id+ "\nYour Name :"+name+"\nYour Sex:"+sex+"\nYour Salary:"+salary);
    }
}
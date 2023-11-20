import java.util.Scanner;

public class lesson4{
    public static void main(String[] args){
        int id ;
        String name,sex,Address;
        Scanner Input = new Scanner(System.in);
        System.out.print("==================Input=====================\n");
        System.out.print("Your ID :");
        id = Input.nextInt();
        System.out.print("Your Name :");
        name = Input.next();
        System.out.print("Your Sex :");
        sex = Input.next();
        System.out.print("Your Address :");
        Address = Input.next();
        System.out.print("==================Output====================\n");
        System.out.print("\nYour ID :"+id);
        System.out.print("\nYour Name :"+name);
        System.out.print("\nYour Sex :"+sex);
        System.out.print("\nYour Address :"+Address);
        
    }
}
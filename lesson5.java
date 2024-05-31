import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;
public class lesson5{
    public static void main(String[] args){
        Scanner kak= new Scanner(System.in);
        int code;
        String name;
        int qty;
        float price;
        double total,discount,pay;
        DecimalFormat save = new DecimalFormat("####0.00");
        System.out.print("=============Input================\n");
        System.out.print(" Input Your Code :");
        code =kak.nextInt();
        System.out.print("Input Your Name :");
        name = kak.next();
        System.out.print("Input Your QTY :");
        qty = kak.nextInt();
        System.out.print("Input Your Price: ");
        price = kak.nextFloat();
        total = qty + price;

        if(total >= 1 && total < 10) discount =total* 0.1;
        else if(total >= 10 && total< 20) discount =total* 0.2;
        else if(total >= 20 && total< 30) discount =total* 0.3;
        else if(total >= 30 && total< 40) discount =total* 0.4;
        else if(total >= 40 && total< 50) discount =total* 0.5;
        else discount = total * 0.6;

        pay = total - discount;
        System.out.println("Total Dollar =" + save.format(total));
        System.out.println("Discount = " + save.format(discount));
        System.out.println("Payment = " + save.format(pay));
    }
}
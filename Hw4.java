import java.util.*;
public class Hw4{
    public static void main(String[] args){
        double sum;
        int n,i;
        String op,st;
        Scanner Input = new Scanner(System.in);
        do{
            System.out.println("A .Sum loop1");
            System.out.println("B .Sum loop2");
            System.out.println("C .Sum loop3");
            System.out.println("D .Sum loop4");
            System.out.println("E .Sum loop5");
            System.out.println("F .Sum loop6");
            System.out.print("Choose One(A-F) =");
            op = Input.next();
            System.out.print("Input Number of Loop=");
            n = Input.nextInt();
            switch(op){
                case "A":
                    case "a":{
                        sum=0.0;
                        for(i=1;i<n;i++){
                            sum=sum+i;
                        }
                        System.out.println("Sum of Loop1 ="+sum);
                    }break;
                case "B":
                    case "b":{
                        sum=0.0;
                        for(i=1;i<n;i++){
                            sum=sum+Math.sqrt(i);
                        }
                        System.out.println("Sum of Loop2 ="+sum);
                    }break;
                case "C":
                    case "c":{
                        sum=0.0;
                        for(i=1;i<n;i++){
                            sum=sum+Math.pow(i,3);
                        }
                        System.out.println("Sum of Loop3 ="+sum);
                    }break;
                case "D":
                    case "d":{
                        sum =0.0;
                        for(i=1;i<n;i++){
                            sum =sum+Math.sin(i);
                        }
                        System.out.println("Sum of Loop4 ="+sum);
                    }break;
                case "E":
                    case "e":{
                        sum=0.0;
                        for(i=1;i<n;i++){
                            sum=sum+Math.log(i);
                        }
                        System.out.println("Sum of Loop5 ="+sum);
                    }break;
            }
        System.out.println("Press Number 0  to Continue........!");
        st=Input.next();
        }while(st.equals("0"));
    }
}
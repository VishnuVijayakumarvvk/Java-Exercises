import java.util.Scanner;
public class GratestThree {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the Third number: ");
        int num3=sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1 + " is the greatest");
            }else{
                System.out.println(num3 + " is the greatest");
            }
        }else{
            if(num2>num3){
                System.out.println(num2 + " is the greatest");
            }else{
                System.out.println(num3 + " is the greatest");
            }
        }
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is greater");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" is greater");
        }else{
            System.out.println(num3+" is greater");
        }
    }
}

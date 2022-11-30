import java.util.Scanner;
public class Compare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2=sc.nextInt();
        if(number1>number2){
            System.out.println(number1 + " is greater");
        }else if (number1<number2){
            System.out.println(number2 + " is greater");
        }else{
            System.out.println(number1+" and "+ number2+" are equal");
        }
    }
}

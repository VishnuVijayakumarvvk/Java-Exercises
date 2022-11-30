import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int number=sc.nextInt();
        if(number==2 || number==3 || number==5 || number==7 ){
            System.out.println("The number is prime");
        }
        if(number%2!=0 && number%3!=0 && number%5!=0 && number%7!=0 && number!=1 && number!=0){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not a prime number");
        }
    }
}

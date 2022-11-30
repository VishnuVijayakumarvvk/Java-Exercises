import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        System.out.println("Welcome to the program");
        int firstNum;
        int secondNum;
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstNum=sc.nextInt();
        System.out.println("Enter the second number: ");
        secondNum=sc.nextInt();
        System.out.println("the sum of the number is: ");
        sum=firstNum+secondNum;
        System.out.println(sum);
    }

}

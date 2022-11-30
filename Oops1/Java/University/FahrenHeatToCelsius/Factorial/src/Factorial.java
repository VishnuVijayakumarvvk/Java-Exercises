import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int factor=sc.nextInt();
        for(int i=1;i<=factor;i++){
            fact=fact*i;
        }
        System.out.println("the Foctorial of "+factor+" is "+ fact);
    }
}

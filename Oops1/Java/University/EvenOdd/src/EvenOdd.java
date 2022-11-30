import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("The number "+number+" is even");
        }else{
            System.out.println("The number "+number+" is odd");
        }
        for(int i=1;i<=15;i++){
            if(i%2==0){
                System.out.println(i +" is even");
            }else{
                System.out.println(i + " is odd");
            }
        }
    }
}

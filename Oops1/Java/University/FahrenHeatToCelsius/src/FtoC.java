import java.util.Scanner;
public class FtoC {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature in fahrenheat: ");
        int temp=sc.nextInt();
        int celsius=((temp-32)*5)/9;
        System.out.println(celsius);
    }
}

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter elements needed: ");
        int num=sc.nextInt();
        int[] array=new int[10];
        System.out.println("enter the array elements: ");
        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.println(array[i]);
        }
    }
}

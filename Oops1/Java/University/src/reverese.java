import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                    //reading string from user
        System.out.print("After reverse string is: ");
        for(int i=s.length()-1;i>=0;--i)                //i is the length of the string
        {
            System.out.print(s.charAt(i));            //printing the character at index i-1
        }
    }
}

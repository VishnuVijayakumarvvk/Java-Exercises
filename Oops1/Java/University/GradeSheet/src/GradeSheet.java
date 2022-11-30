import java.util.Scanner;
public class GradeSheet {
    public static void main(String[] args){
        char grade='I';
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int mark=sc.nextInt();
        if(mark<=100 && mark>=80){
            grade='A';
        }else if(mark<=79 && mark>=70){
            grade='B';
        }else if(mark<=69 && mark>=60){
            grade='C';
        }else if(mark<=59 && mark>=50){
            grade='D';
        }else if(mark<=49 && mark>=0){
            grade='F';
        }else{
            System.out.println("Please Enter a valid mark:)");
        }
        switch (grade) {
            case 'A':
                System.out.println("Your grade is "+grade+" very good");
                break;
            case 'B':
                System.out.println("Your grade is "+grade+" good grade");
                break;
            case 'C':
                System.out.println("Your grade is "+grade+" ok , improve your studies");
                break;
            case 'D':
                System.out.println("Your grade is "+grade+" Study well, Try to improve");
                break;
            case 'F':
                System.out.println("Your grade is "+grade+" Failed,Study next time");
                break;
            default:
                System.out.println("please Enter a valid mark:)");
        }
    }
}

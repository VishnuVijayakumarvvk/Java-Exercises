public class Pyramid {
    public static void main(String args[]){
        int num=5;
//        for(int i=1;i<num;i++){
//            for(int j=num-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        for(int i=5;i>0;i--){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
// [2,5,4,7,9,5]
public class StarRight {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
//        for(int k=5;k>0;k--){
//            for(int l=1;l<=k;l++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for(int i=1;i<=num;i++){
//            for(int j=num-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for(int i=5;i>0;i--){
//            for(int j=num-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for(int i=1;i<=num;i++){
//            for(int j=num-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
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

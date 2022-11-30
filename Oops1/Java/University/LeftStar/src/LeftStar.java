public class LeftStar {
    public static void main(String[] args){
        int num=5;
        // mainly concentrate on i and do every things related to i
        for(int i=1;i<=5;i++){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int l=5;l>0;l--){
            for(int m=num-l;m>0;m--){
                System.out.print(" ");
            }
            for (int o=1;o<=l;o++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

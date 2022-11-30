public class Star {
    public static void main(String[] args) {
        int num = 5;
        for (int k = 1; k <= num; k++)
        {
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=num;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
public class Tcs {
    public static void bubble(int[] input){
        for(int i=input.length;i>0;i--){
            for(int j=0;i<input.length-1;j++){
                if(input[j]>input[j+1]){
                    swap(input,j,j+1);
                }
                print(input);

            }
        }
    }

    public static void swap(int[] input,int i,int j){
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }
    public static void print(int[] input){
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" , ");;
        }
    }

    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
        int[] input={87,65,128,105,67};
        System.out.println("enter array elements: ");
//        for(int i=0;i<7;i++){
//            input[i]=sc.nextInt();
//        }
        bubble(input);
    }
}

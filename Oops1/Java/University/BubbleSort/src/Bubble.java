public class Bubble {

    public static void bubble(int[] input){
        for(int j=input.length;j>0;j--){
            for(int i=0;i<input.length-1;i++){
                if(input[i]>input[i+1]){
                    swap(input,i,i+1);
                }
                print(input);
            }
        }
    }

    public static void swap(int[] input,int i,int j){
        int temp;
        temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }

    public static void print(int[] input){
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" , ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        int[] input={9,8,7,6,5,4,3,2,1};
        bubble(input);
    }
}

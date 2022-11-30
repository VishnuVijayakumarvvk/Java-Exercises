public class InsertionSort {

    public static void insertionsort(int[] input){
        for(int i=1;i<input.length;i++){
            for(int j=i;j>0;j--){
                if(input[j]<input[j-1]){
                    swap(input,j,j-1);
                }
            }
        }
        print(input);
    }

    public static void swap(int[] input,int i,int j){
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }

    public static void print(int[] output){
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" , ");
        }
    }

    public static void main(String[] args){
        int[] input={56,12,23,11,0,87,2,32};
         insertionsort(input);
    }
}

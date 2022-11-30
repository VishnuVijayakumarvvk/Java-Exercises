public class SelectionSort {

    public static void selectionsort(int[] input){
        int small;
        for(int i=0;i<input.length-1;i++){
            int index=i;
            for(int j=i+1;j<input.length;j++){
                if(input[j]<input[index]){
                    index=j;
                }
            }
            swap(input,index,i);
        }
        print(input);
    }

    public static void swap(int[] input,int j,int i){
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }

    public static void print(int[] output){
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" , ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        int[] input={9,8,7,60,5,1,3,0,56};
        selectionsort(input);
    }
}

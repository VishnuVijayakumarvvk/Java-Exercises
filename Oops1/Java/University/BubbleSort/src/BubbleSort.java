public class BubbleSort {

    public static void bubblesort(int[] input){
        for(int i=input.length;i>0;i--){
            for(int j=0;j<input.length-1;j++){
                int k=j+1;
                if(input[j]>input[k]){
                    swap(input,j,k);
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
        bubblesort(input);
    }
}

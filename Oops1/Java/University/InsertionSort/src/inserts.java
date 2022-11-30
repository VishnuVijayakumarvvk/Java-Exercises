public class inserts {
    public static void insert(int[] input){
        for(int i=1;i<input.length;i++){
            for(int j=i;j>0;j--){
                if(input[j]<input[j-1]){
                    swap(input,j,j-1);
                }
            }
        }
        print(input);
    }

    public static void swap(int[] input,int j,int k){
        int temp=input[j];
        input[j]=input[k];
        input[k]=temp;
    }
    public static void print(int[] output){
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" , ");
        }
    }

    public static void main(String[] args){
        int[] input={6,4,7,2,8,5,1};
        insert(input);
    }
}

public class Selection {

    public static void selectionsort(int[] input){
        for(int i=0;i<input.length-1;i++){
            int index=i;
            for(int j=i+1;j<input.length;j++){
                if(input[j]<input[index]){
                    index=j;
                }
            }
            swap(input,i,index);
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
        System.out.println("\n");
    }

    public static void main(String[] args){
        int[] input={9,8,4,5,6,7,1,2,3,54,77,7};
        System.out.println(input);
        selectionsort(input);
    }
}

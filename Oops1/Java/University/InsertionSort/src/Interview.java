public class Interview {
    public static int[] twoSum(int[] nums, int target) {
        int a_pointer=0;
        int b_pointer=nums.length-1;
        while(a_pointer<b_pointer){
            int  sum=nums[a_pointer]+nums[b_pointer];
            if(sum>target){
                --b_pointer;
            }else if(sum>target){
                ++a_pointer;
            }else{
                return new int[] {a_pointer,b_pointer};
            }
        }
        return new int[] {a_pointer,b_pointer} ;

    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
//        int s=twoSum(nums,target);
//        System.out.println(s);
    }
}

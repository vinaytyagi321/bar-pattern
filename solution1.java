public class solution1 {
    public  static void twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1;j<nums.length-1;j++){
            if(nums[i]+nums[j]== target){
                System.out.println("[" + i + " ," + j + "]");
            }
        }
        System.out.println();
    }
}
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target= 9;
            twoSum(nums, target);
           
            
        }
        
}



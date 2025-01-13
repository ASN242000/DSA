package LinearSearch;

public class FindNumbsersWithEvenNoOfDigits1295 {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static public int findNumbers(int[] nums) {
        int output=0, count=0;
        for(int i=0;i<nums.length;i++){
            count =0;
            while(nums[i] >0){
                nums[i] = nums[i]/10;
                count++;
            }
            if(count%2 == 0)
                output++;
        }
        return output;
    }
}


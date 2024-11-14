public class Warmup {
    public static void main(String[] args) {
        
    }
    // Question 1
    public static int findEqualLengthNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int abs = Math.abs(nums[i]);
            String numString = "" + abs;
            if (numString.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    // Question 2
    public static int largestAltitude (int[] gain) {
        int[] heights = new int[gain.length + 1];
        heights[0] = 0;
        for (int i = 1; i < heights.length; i++){
           heights[i] = heights[i - 1] + gain[i - 1];
        }
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < heights.length; i++){
            max = Math.max(heights[i], max);
        }
        return max;
    }
   

}

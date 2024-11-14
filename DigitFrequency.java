public class DigitFrequency {
    // Question 1
    public static final int NUM_DIGITS = 10;
    public static int numPassed = 0;
    public static int numTest = 1; 
    public static int test;//0
    
    public static void main(String[] args) {
        // final int [] arr = new int[5];
        // arr[1] = 5;
        // arr = new int[6];
        // final String str = "hello world";
        // str += "wwww";

        // int val;
        // System.out.println(val); 
        System.out.println(test);
    }

    // Question 3
    public static int[] digitFrequency(int n) {
        String str = "" + Math.abs(n);
        int[] appears = new int[NUM_DIGITS];
        for (int i = 0; i < str.length(); i++) { 
            int digit = str.charAt(i) - '0'; // '3' - '0' => 51 - 48 = 3
                                             // '8' - '0' => 56 - 48 = 8
            appears[digit]++; 
        }
        return appears;
    }

    // Question 3, Expansion 1
    public static int mostFrequentDigit(int n) {
        int [] appears = digitFrequency(n);
        int maxKey = 0;
        for (int i = 0; i < appears.length; i++){
            if (appears[i] > maxKey){
                maxKey = i;
            }	
        }
        return maxKey;
    }
    
    // Question 3, Expansion 2
    public static String biggestNumberPossible(int n) {
        int [] appears = digitFrequency(n);
        String num = "";
        for (int i = 0; i < appears.length; i++){
            while (appears[i] > 0){
                appears[i]--;
                num = i + num;
            }	
        }
        return num;
    }
    
    // Question 3, Expansion 3
    public static int [] digitFrequency1(int n){
        int[] appears = new int[NUM_DIGITS];
        String str = "" + Math.abs(n);
        for (int i = 0; i < str.length(); i++) { 
            int digit = str.charAt(i) - '0';
            appears[digit]++; 
        }
        return appears;

    }
}
public class TwoDArrayOps {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4}};

        int [][] arr2 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        // flatten(arr);
    }
    // Question 5
    public static int[] flatten(int[][] arr) {
        int[] flat = new int[arr.length * arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flat[index] = arr[i][j];
                index++;
            }
        }
        return flat;
    }
    // Question 5, Alternative version
    public static int[] flatten1 (int[][] arr) {
        int[] flat = new int[arr.length * arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flat[i * arr[0].length + j] = arr[i][j];
            }
        }
        return flat;
    }

    // Question 5, Expansion 1,
    public static int[] flattenNonRectangular (int[][] arr) {
        int numElemFlat = 0;
        for (int i = 0; i < arr.length; i++) {
            numElemFlat += arr[i].length;
        }
        int[] oneDArr = new int[numElemFlat];
        int index = 0; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                oneDArr[index] = arr[i][j];
                index++;
            }
        }
        return oneDArr;
    }

    // Question 5, Expansion 1, Alternative
    public static int[] flattenNonRectangular1 (int[][] arr) {
        int numElemFlat = 0;
        for (int i = 0; i < arr.length; i++) {
            numElemFlat += arr[i].length;
        }
        int[] oneDArr = new int[numElemFlat];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                oneDArr[num + j] = arr[i][j];
            }
            num += arr[i].length;
        }
        return oneDArr;
    }

    // Question 6
    public static int[][] spiralFill(int m, int n) {
        int[][] result = new int[m][n];
        // Define the boundaries
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        while (top <= bottom && left <= right) {
            // Fill the top row from left to right
            for (int i = left; i <= right; i++) {
                result[top][i] = count++;
            }
            top++;
            // Fill the rightmost column from top to bottom
            for (int i = top; i <= bottom; i++) {
                result[i][right] = count++;
            }
            right--;
           // Fill the bottom row from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = count++;
                }
                bottom--;
            }
            // Fill the leftmost column from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = count++;
                }
                left++;
            }
        }
        return result;
    }
}

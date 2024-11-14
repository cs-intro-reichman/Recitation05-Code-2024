// Question 4
public class Pascal {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		//Initialize the triangle, the triangle has N rows. 
		int[][] pascalTriangle = new int[N][];
		//Initialize the first row separately.
		//It has two extra spaces to avoid treating the edges differently.
		pascalTriangle[0] = new int[3];
		pascalTriangle[0][1] = 1;
		//Runs through the rows of Pascal triangle.
		for (int i = 1; i < N; i++) {   
			// row i has one more cell than i-1.
			int lastRow = pascalTriangle[i - 1].length;
            pascalTriangle[i] = new int[lastRow + 1];
			for (int j = 1; j < pascalTriangle[i].length - 1; j++) {
				pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
			}
		}
        //Prints the triangle, remember each row has two extra spaces.
        //Ignore them while printing.
        for (int i = 0; i < pascalTriangle.length; i++) {
            for (int j = 1; j < pascalTriangle[i].length - 1; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

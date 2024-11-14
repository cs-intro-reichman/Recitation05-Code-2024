public class MatOps {
    public static void main(String[] args) {
        
    }

    // Question 7
    public static void rowInterchange(int[][] mat, int row1, int row2) {
        int[] temp = mat[row1];
        mat[row1] = mat[row2];
        mat[row2] = temp;
    }

    // Question 7, Expansion 1
    public static void rowScaling(int[][] mat, int row, int scale) {
        for(int i = 0; i < mat[row].length ; i++){
            mat[row][i] *= scale;
        } 
    }
    
    // Question 7, Expansion 2
    public static void rowReplacement(int[][] mat, int row1, int row2, int scale) {
        for(int i = 0; i < mat[row1].length ; i++){
           mat[row1][i] += (mat[row2][i] * scale);
        } 
    }

    // Question 7, Expansion 3
    public static int[][] transpose(int[][] mat) {
        int[][] newMat = new int[mat[0].length][mat.length];
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[0].length; j++) {
                newMat[i][j] = mat[j][i];
            }
        }
        return newMat;
    }
 
    // Question 7, Expansion 4
    public static int[][] multMatrix(int[][] mat1, int[][] mat2) {
        int[][] mat = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    mat[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return mat;
    }

    // Question 7, Expansion 5
    public static int[][] columnInterchange1(int[][] mat, int col1, int col2) {
        int[][] transposed = transpose(mat);
        rowInterchange(transposed, col1, col2);
        return transpose(transposed);
    }

    // Question 7, Expansion 5, Altered version
    public static int[][] columnInterchange(int[][] mat, int col1, int col2) {
        int[][] newMat = new int [mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                newMat[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < newMat.length; i++) {
            int temp = newMat[i][col1];
            newMat[i][col1] = newMat[i][col2];
            newMat[i][col2] = temp;
        }
        return newMat;
    }
    
    
    
    
    
    
 
 
 
 
 
 
 
 
 
 
 
  
}

//Rotate Image
class Solution 
{
    public void rotate(int[][] matrix) 
    {
       for(int i = 0; i < matrix.length; i++)
       {
            for(int j = i + 1; j < matrix[i].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
       } 
       for(int i = 0; i < matrix.length; i++)
       {
            int l = 0, r = matrix.length - 1;
            while(l < r)
            {
                int temp1 = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp1;
                l++;
                r--;
            }
       }
    }
}
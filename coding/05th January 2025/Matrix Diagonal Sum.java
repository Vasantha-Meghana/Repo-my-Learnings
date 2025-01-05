//Matrix Diagonal Sum
class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int res = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                if(i == j || (i + j) == mat.length - 1)
                    res = res + mat[i][j];
            }
        }
        return res;
    }
}

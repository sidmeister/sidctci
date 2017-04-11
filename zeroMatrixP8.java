/*
Write a program check if an element in a MXN matrix is 0, its entire row and column are set to 0
*/


public class zeroMatrixP8 {

    public void Solution(int[][] matrix)
    {
        boolean[] rowArray = new boolean[matrix.length];
        boolean[]  colArray = new boolean[matrix[0].length];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    rowArray[i] = true;
                    colArray[j]=true;
                }
            }
        }

        //if rowArray index =0; make entire row = 0;
        for(int i=0;i<rowArray.length;i++)
        {
            if(rowArray[i] == true)
                nullRow(matrix,i);
        }


        //if colArray index =0; make entire col = 0;
        for(int i=0;i<colArray.length;i++)
        {
            if(colArray[i] == true)
                nullCol(matrix,i);
        }

    }

    public void nullRow(int[][] matrix,int row)
    {
        for(int i =0;i<matrix[row].length;i++)
            matrix[row][i] =0;
    }


    public void nullCol(int[][] matrix,int col)
    {
        for(int i =0;i<matrix.length;i++)
            matrix[i][col] =0;
    }

    public static void main(String[] args){
        zeroMatrixP8 z = new zeroMatrixP8();
        int[][] matrix = new int[][]{
                        {1,2,3},
                        {1,0,1},
                        {3,4,5}
        };
        z.Solution(matrix);
          for(int i =0;i<matrix.length;i++)
          {
            for(int j=0;j<matrix[i].length;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }
}
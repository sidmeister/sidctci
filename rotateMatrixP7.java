/*
Given an image represented by a N*N matrix,where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees Can you do this in place

for explanation : http://stackoverflow.com/questions/25882480/rotating-a-nxn-matrix-in-java
*/

public class rotateMatrixP7 {

    public void Solution(char[][] matrix)
    {

            if(matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) return;
            int n = matrix.length;
            for(int layer =0; layer < n/2; layer ++ )
            {
                int first = layer;
                int last = n - first -1;
                 for(int i = first;i<last;i++)
                 {
                    int offset = i -first;
                    //save top;
                    char temp = matrix[first][i];
                    //left -> top
                    matrix[first][i] = matrix[last -offset][first];
                    //bottom->left
                    matrix[last-offset][first] = matrix[last][last-offset];
                    //right->bottom
                    matrix[last][last-offset]= matrix[i][last];
                    //temp -> right
                    matrix[i][last] = temp;
                 }
            }
    }

    public static void main(String[] args){
        rotateMatrixP7 p = new rotateMatrixP7();
        char[][] matrix = new char[][]
                                 {
                                    {'A','B','C','D'},
                                     {'E','F','G','H'},
                                     {'I','J','K','L'},
                                    {'M','N','O','P'}
                                };
        p.Solution(matrix);
        for(int i =0;i<matrix.length;i++)
          {
            for(int j=0;j<matrix[i].length;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }

    }
}
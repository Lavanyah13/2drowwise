import java.util.*;

public class Row_Wise_Sum {

    public static void rowWiseSum(int[][] mat) {
        //Your code goes here
        int l= mat.length;
        for (int i = 0; i < l; i++)
        {
            int sum=0;
            for (int j = 0; j <mat[i].length; j++)
            {
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }

    }
}

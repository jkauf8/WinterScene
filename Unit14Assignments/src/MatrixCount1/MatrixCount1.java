package MatrixCount1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    			        { 6, 7, 8, 9, 0},
    			        { 6, 7, 1, 2, 5},
    				{ 6, 7, 8, 9, 0},
    				{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
		//add code
        int count = 0;
        for (int[] array : m){
            for (int i : array){
                if (i==val){
                    count = count +1;
                }
            }
        }
		return count;
    }
}

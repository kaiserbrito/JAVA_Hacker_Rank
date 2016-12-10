import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[n];
        
        //Definition of the subarray
        int A2[][] = new int[n][n];
        
        int count = 0;
        
        for(int i=0;i<n;i++){
        	A[i] = scan.nextInt();
        	
        	if(A[i]<0) count++;
        	A2[i][i] = A[i];
        	
        	for(int j=0;j<i;j++){
        		A2[j][i] = A2[j][i-1] + A[i];
        		
        		if(A2[j][i]<0) count++;
        	}
        }
        
        System.out.println(count);
        scan.close();
    }
}
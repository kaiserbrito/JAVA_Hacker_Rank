import java.util.*;

public class Solution {

        
    private static void win(int n, int m, int[] array, int i){
    	System.out.println(isSolvable(n, m, array, i) ? "YES" : "NO");
    }
    
    private static boolean isSolvable(int n, int m, int[] array, int i){
    	try {
    		if(i<0 || array[i] == 1) return false;
		} catch (ArrayIndexOutOfBoundsException e) {
			return true;
		}
    	
    	array[i] = 1;
    	
    	return isSolvable(n, m, array, i+m) || isSolvable(n, m, array, i+1) || isSolvable(n, m, array, i-1);
    }
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        
        for(int i=0;i<testCase;i++){
        	int n = in.nextInt();
        	int m = in.nextInt();
        	int[] array = new int[n];
        	
        	
        	for(int j=0;j<array.length;j++) array[j] = in.nextInt();       	
        	
        	win(n, m, array, 0); 	
        }        
    }
}
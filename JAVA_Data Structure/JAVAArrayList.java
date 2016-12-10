import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();       
        
        
        List<List<Integer>> lists = new ArrayList<>();
        
        for(int i=0;i<n;i++){
        	lists.add(new ArrayList<>());
        	
        	int d = scan.nextInt();        	
        	for(int j=0;j<d;j++){
        		lists.get(i).add(scan.nextInt());
        	}
        }
        
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
        	int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;        	
        	
        	if(x >= lists.size() || y >= lists.get(x).size()){
        		System.out.println("ERROR!");
        	} else {
        		System.out.println(lists.get(x).get(y));
        	}
        }
        scan.close();
    }
}
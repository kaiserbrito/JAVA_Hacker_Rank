import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> lists = new ArrayList<>();        
        
        for(int i=0;i<N;i++) lists.add(scan.nextInt());        
        
        int q = scan.nextInt(); scan.nextLine();
        for(int j=0;j<q;j++){
        	String str = scan.next();
        	int x = scan.nextInt();
        	
        	if(str.equals("Insert")) lists.add(x, scan.nextInt());
        	if(str.equals("Delete")) lists.remove(x);
        }
        
        scan.close();
        for(int k=0;k<lists.size();k++) System.out.print(lists.get(k) + " ");
    }
}
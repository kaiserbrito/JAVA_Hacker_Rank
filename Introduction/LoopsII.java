import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int x = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            x += a;
            
            for(int j = 0; j < n; j++){
            	x += b * (int)(Math.pow(2, j));
            	System.out.print(x+" ");
            }
            x = 0;
            System.out.println();
        }
        in.close();
    }
}
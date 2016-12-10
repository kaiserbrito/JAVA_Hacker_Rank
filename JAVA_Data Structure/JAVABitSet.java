import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;

@SuppressWarnings("unused")
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();//length of BitSets
        int M = in.nextInt();//number of operations to perform
        
        BitSet[] bitSets = new BitSet[]{new BitSet(N), new BitSet(N)};
        
        Map<String, BiConsumer<Integer, Integer>> bitOps = new HashMap<>();
        
        bitOps.put("AND", (ind1, ind2) -> bitSets[ind1-1].and(bitSets[ind2-1]));
        bitOps.put("OR", (ind1, ind2) -> bitSets[ind1-1].or(bitSets[ind2-1]));
        bitOps.put("XOR", (ind1, ind2) -> bitSets[ind1-1].xor(bitSets[ind2-1]));
        bitOps.put("SET", (ind1, ind2) -> bitSets[ind1-1].set(ind2));
        bitOps.put("FLIP", (ind1, ind2) -> bitSets[ind1-1].flip(ind2));
        
        for(int i=0;i<M;i++){
        	bitOps.get(in.next()).accept(in.nextInt(), in.nextInt());
        	System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
        in.close();
    }
}
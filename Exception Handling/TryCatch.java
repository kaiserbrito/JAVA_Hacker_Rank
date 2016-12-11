import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
			System.out.println(in.nextInt()/in.nextInt());
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
    }
}
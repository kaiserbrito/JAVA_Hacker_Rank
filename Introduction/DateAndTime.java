import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        in.close();
        
        LocalDate dw = LocalDate.of(year, month, day);
        System.out.println(dw.getDayOfWeek());
    }
}

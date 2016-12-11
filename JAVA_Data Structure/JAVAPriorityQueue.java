import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      
      PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getToken));
      
      while(totalEvents>0){
         String event = in.nextLine();
         StringTokenizer student = new StringTokenizer(event);
         
         if(student.nextToken().equals("ENTER")){
        	 String fname = student.nextToken();
        	 Double cgpa = Double.parseDouble(student.nextToken());
        	 int id = Integer.parseInt(student.nextToken());        	 
        	 
        	 priorityQueue.add(new Student(id, fname, cgpa));
        	 
         } else{
        	 priorityQueue.poll(); 
         }
         
         totalEvents--;
      }
      
      if(priorityQueue.isEmpty()){
    	  System.out.println("EMPTY");  
      } else{
    	  while(!priorityQueue.isEmpty()){
    		  System.out.println(priorityQueue.poll().getFname());
    	  }
      }
      in.close();
    }
}

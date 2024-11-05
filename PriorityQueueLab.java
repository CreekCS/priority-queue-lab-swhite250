// import statements
import java.util.*;
import java.io.*;

public class PriorityQueueLab {
    public static void main (String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        File file = new File("RandIntegers.txt");
        try{
            Scanner numsScanner = new Scanner(file);
            while(numsScanner.hasNextLine()){
                Integer value = Integer.parseInt(numsScanner.nextLine());
                pq.add(value);
            }
            System.out.println("PriorityQue contents (in natural order):");
            while (!pq.isEmpty()){
                    System.out.println(pq);
                    pq.poll();
            }   
        }
        catch (Exception e){
            System.out.println("Bro fix your file!");
            System.out.println(e.getMessage());
        }
    }
        
}


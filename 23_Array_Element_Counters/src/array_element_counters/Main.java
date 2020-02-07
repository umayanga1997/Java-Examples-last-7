package array_element_counters;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int freq[] = new int[7];
        
        for (int roll=1;roll<1000;roll++){
            ++freq[1+rand.nextInt(3)];
        }
        
        System.out.println("Face \t Frequency");
        
        for(int face=1;face<freq.length;face++){
            System.out.println(face + "\t" + freq[face]);
        }
        
    }
    
}

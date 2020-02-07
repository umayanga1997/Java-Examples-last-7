package summing_elements_of_arrays;

public class Main {

    public static void main(String[] args) {

        int array []={10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        
        for(int counter=0;counter<array.length;counter++){
            sum+=array[counter];
        }
        System.out.println("The sum of these numbers is : " + sum);
        
    }
    
}

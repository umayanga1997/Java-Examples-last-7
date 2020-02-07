package enhanced_for_loop;

public class Main {

    public static void main(String[] args) {

        int array[] = {2,4,6,8,10};
        int total =0;
        
        for(int x : array){ // for(int x=0;x<array.length;x++)
            System.out.println(x);
            total +=x;
        }
        System.out.println("Total is : " + total);
    }
    
}

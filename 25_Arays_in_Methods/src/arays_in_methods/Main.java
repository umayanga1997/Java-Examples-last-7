package arays_in_methods;

public class Main {

    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        change(array);
        
        for (int y: array){
            System.out.println(y);
        }
    }
    
    public static void change(int x[]){
        
        for (int counter=0;counter<x.length;counter++){
            x[counter]+=5;
            
        }
        
    }
}

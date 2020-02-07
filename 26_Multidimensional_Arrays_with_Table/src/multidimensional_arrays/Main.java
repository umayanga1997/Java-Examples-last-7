package multidimensional_arrays;

public class Main {

    public static void main(String[] args) {

    int array[][] ={{1,2,3,4,5},{11,22,33,44,55}};
    int array_1[][] ={{1,2,3,4,5},{11,22,33,44,55},{111,222,333,444,555}};
    
    System.out.println("This is the first array");
        display(array);
    System.out.println("This is the Second array");
        display(array_1);
    }
    
    public static void display(int x[] []){
        
        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println("");
        }
        
        /*for(int a=0;a<5;a++){
            System.out.println(a);
        }*/
    }
    
}

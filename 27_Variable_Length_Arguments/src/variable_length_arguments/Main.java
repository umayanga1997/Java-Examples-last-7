
package variable_length_arguments;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(average(45,55,84,75,84,99,53,12,225,565,536));
        
        }
    public static int average(int...numbers){
           
        int total = 0;
        for(int x:numbers)
            total+=x;
        System.out.println(total);
        //return total;  
        return  total/numbers.length;
    }
    
    
    /*int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
    */
}

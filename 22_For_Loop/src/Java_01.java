
import java.util.*;

public class Java_01 {

	public static void main(String[] args) {
		for(int a=0;a<11;a++){	
			for (int b=10;b>a;b--){
				System.out.print(b);
			}System.out.println(a);	
		}
		
		
		for(int a=0;a<11;a++){	
			for (int b=0;b<a;b++){
				System.out.print(b);
			}System.out.println(a);
		}
		
		Scanner scanner_variable = new Scanner(System.in);
		System.out.println("Enter Your Lucky Number : ");
		int x = scanner_variable.nextInt();

		for (x = x;x<10;x++){
			for (int y=0;y<x;y++){
				System.out.print(y);
			}System.out.println(x);			
		}
	}

}

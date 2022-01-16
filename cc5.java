import java.util.*;
class Generic<T>{
    ArrayList<T> A = new ArrayList<T>();
    public void get_data(T[] input_array) {
        for (int i = 0; i < input_array.length; i++) {
            A.add(input_array[i]);  // assigning input array values into array-list
        }
    }
}

public class cc5 {

	public static void main(String[] args) {

		Integer ls[]= { 111, 221, 428, 13, 372, 45 }; // declaring random array
        Generic<Integer> G = new Generic <Integer>();
        G.get_data(ls);        
		try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the index : ");
            int x = sc.nextInt();

			System.out.println("Array Element array[" + x + "]    :  " + G.A.get(x)); // accessing array element
		} catch (Exception e) {  //Exceptions
			System.out.println(
					"\nArraylistIndex Out Of Bounds Exception Caught!!!\nCheck the arraylist index you are trying to access.");
		}
		System.out.println("End of Exception Handeling!!!");
	}
}

/*
Enter the index : 45

ArraylistIndex Out Of Bounds Exception Caught!!!
Check the array index you are trying to access. 
End of Exception Handeling!!!
*/
package assementpack;

import java.util.Arrays; 

public class sort_array {   //class name
	
public static void main(String[] args){   //main method
    
    int[] my_array1 = {                    //elements in array
            1789, 2035, 1899, 1456, 2013,   
            1458, 2458, 1254, 1472, 2365,};
            
    String[] my_array2 = {                 //assign the string names
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++",
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    
    System.out.println("...................another code.............");
 
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}

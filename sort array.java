import java.util.Arrays; 
  
public class SortExample 
{ 
    public static void main(String[] args) 
    { 
     
        int[] arr = {20, 12, 4, 16, 40, 3, 110, 200}; 
  
        Arrays.sort(arr); 
  
        System.out.printf("sorted arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 
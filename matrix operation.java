import java.util.Scanner;
public class MatrixOperat {
 public static void main(String args[])
   {
      int m, n, c, d,k;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input number of rows of matrix");
      m = in.nextInt();
      System.out.println("Input number of columns of matrix");
      n  = in.nextInt();
 
      int array1[][] = new int[m][n];
      int array2[][] = new int[m][n];
      int sum[][] = new int[m][n];
      int sub[][]  =new int[m][n];
      int mul[][]  =new int[m][n];
 
      System.out.println("Input elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array1[c][d] = in.nextInt();
 
      System.out.println("Input the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array2[c][d] = in.nextInt();
 
         //sum of the matrices

      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 
             
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }

      //subtraction of the matrices

	for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sub[c][d] = array1[c][d] - array2[c][d];
     
        System.out.println("Sub of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sub[c][d]+"\t");
 
         System.out.println();

      }
      
	//multiply the matrices
     
     System.out.println("multiplying matrices");
     for(c=0;c<m;c++)
	{
	for(d=0;d<n;d++)
	  {
	   for(k=0;k<m;k++)
	   {
		mul[c][d]=mul[c][d]+array1[c][k]*array2[k][d];
	   }
	  }
	 }
    System.out.println("product is:"); 
    for(c=0;c<m;c++)
    {
	for(d=0;d<n;d++)
	{
	 System.out.println(mul[c][d]+"");	
	}
	System.out.println();
    } 
    
}
}

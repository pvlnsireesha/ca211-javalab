public class bitwiseoperators 
{
 public static void main(String[] args)
 {
  int num1 = 10, num2 = 6, num3 =2;
  
  System.out.println("value of num1 & num2 = " + (num1 & num2));
  
  System.out.println("value of num1 | num2 = " + (num1 | num2) );
  
  System.out.println("value of num1 ^ num2 = " + (num1 ^ num2));
  
  System.out.println("value of ~num1 = " + ~num1 );

  num3 = num1 <<  2;
  System.out.println("value of num1 << 1 = " + num3 );

  num3 = num1 >>  2;
  System.out.println("value of num1 >> 1  = " + num3 );
  
 }
}

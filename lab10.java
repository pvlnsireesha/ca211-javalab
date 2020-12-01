class incr
{
 static int count=0;
 static void incr()
 {
  count++;
 }
 public static void main(String args[])
 {
 lab10 c1=new lab10();
 c1.lab10();
 lab10 c2=new lab10();
 c2.lab10();
 lab10 c3=new lab10();
 c3.lab10();
 lab10 c4=new lab10();
 c4.lab10();
 System.out.println("number of objects="+count);
 }
}

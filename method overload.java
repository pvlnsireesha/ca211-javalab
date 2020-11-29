class OverloadDemo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float l, float b)
    {
        System.out.println("the area of the rectangle is "+l*b+" sq units");
    }
    void area(double b,double h)
    {
        
        System.out.println("the area of the Triangle is "+.5*b*h+" sq units");
    }
}
class OverloadMethod
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   ob.area(5);
	   ob.area(11,12);
	   ob.area(10.0,10.0);
        }
}

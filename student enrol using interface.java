import java.util.Scanner;

interface Student
{
	int studentID = 45;
	String studentName = "y.gowthami";
	String Class = "MCA" ;

	void getValue();
}

class Department implements Student
{
	int attendance;

	public void getAttendance()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Attendance: ");
		attendance = sc.nextInt();
	}

	public void getValue()
	{
		System.out.println("ID :\t" + studentID); 
		System.out.println("Name:\t" +studentName);
		System.out.println("Branch:\t" +Class);
	}
}

class Exam extends Department
{
	public void calculateAttendance()
	{
		attendance = attendance;
	}
	public boolean eligible()
	{
	if(attendance < 60)
		return false;
		else
		return true;
	}
}

public class StudentEnrolDemo
{
	public static void main(String[] args)
	{
		Exam e = new Exam();
		e.getValue();
		e.getAttendance();
		e.calculateAttendance();
		System.out.println("Eligibility :" + e.eligible());

		
	}
}	
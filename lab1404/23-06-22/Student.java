package calculate;
import java.util.Arrays;
import java.util.Scanner;
java.util.comparator;
public class Student {

	int roll;
	String name;
	String subject;
	int total_marks;
	Student(){}
    Student(int roll,String name,String subject,int total_marks)
	{
		this.roll=roll;
		this.name=name;
		this.subject=subject;
		this.total_marks=total_marks;
	}
    @Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + ", total_marks=" + total_marks
				+ "]";
	}
	
}
class StudentMain{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner Sc=new Scanner(System.in);
		System.out.println("how many Student data you want to insert:");
		int n=sc.nextInt();
		Student[] obj=new Student[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter Roll no:");
			int roll=sc.nextInt();
			System.out.println("Enter Name:");
			String name=Sc.nextLine();
			System.out.println("Enter Subject:");
			String subject=Sc.nextLine();
			System.out.println("Enter Marks");
			int marks=sc.nextInt();
			obj[i]=new Student(roll,name,subject,marks);
		}
		Arrays.sort(obj, new newcomparator());
		for(Student x:obj)
		{
			System.out.println(x+" ");
		}
	}
}



import java.util.ArrayList;
import java.util.Scanner;



public class StudentResult {
	
	public static void main(String[] args){
		
		class Student{
			private int id;
			private String fname;
			private double cgpa;
			public Student(int id, String fname, double cgpa) {
				super();
				this.id = id;
				this.fname = fname;
				this.cgpa = cgpa;
			}
			public int getId() {
				return id;
			}
			public String getFname() {
				return fname;
			}
			public double getCgpa() {
				return cgpa;
			}
		}
		
		
		Scanner in = new Scanner(System.in);
		int Cases = Integer.parseInt(in.nextLine());
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		while(Cases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			Cases--;
		}
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}

}

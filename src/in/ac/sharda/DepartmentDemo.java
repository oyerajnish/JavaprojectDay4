package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		Department d = new Department(12);
		for (int i = 1; i< 26; i++) {
			d.addStudent(new Student(i, "Rajnish"+i));
		}
		d.printStudent();
		
		
		
		
		
			
		}

	}



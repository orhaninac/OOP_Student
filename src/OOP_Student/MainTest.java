package OOP_Student;

import java.util.List;

public class MainTest {
	
	public static void listStudent(List<Student> students) {
		for(Student student :students) {
			System.out.println(student.getId()+"\t"+student.getName()+
					"\t"+student.getSurname()+"\t"+student.getIdentityonNumber());
		}
	}

	public static void main(String[] args) {
		StudentManager studentManager=new StudentManager();
		
		Student student1=new Student(1,"Orhan","İnaç","12345");
		Student student2=new Student(2,"Enes","Solak","67890");
		Student student3=new Student(3,"İbrahim","Yılmaz","24690");
		Student student4=new Student(4,"Onur","Güzel","13579");
		Student student5=new Student(4,"Onur","Nafi","13579");
		
		studentManager.addStudent(student1);
		studentManager.addStudent(student2);
		studentManager.addStudent(student3);
		studentManager.addStudent(student4);
		
		listStudent(studentManager.getAll());
		studentManager.updateStudent(student5);
		listStudent(studentManager.getAll());
		studentManager.deleteStudent(2);
		listStudent(studentManager.getAll());

	}

}

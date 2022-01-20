package OOP_Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	ArrayList<Student>students=new ArrayList<>();

	public StudentManager() {
   // TODO document why this constructor is empty
 }
	
	public void addStudent(Student student) {
		for(Student std : students)
			if(std.getIdentityonNumber().equals(student.getIdentityonNumber()) ) {
				System.out.println("Bu kimlik numarasına ait bir öğrenci zaten mevcut !!!");
				return;
			}
		students.add(student);
		System.out.println(student.getId()+" "+student.getIdentityonNumber()+" "+
				student.getName()+" "+student.getSurname()+" eklendi.");
	}
	
	public void deleteStudent(int id) {
		for (Student student : students) {
			if(student.getId() == id) {
				students.remove(student);
				System.out.println(student.getName() + " silindi!");
				return;
			}
		}
		System.out.println("Silinecek öğrenci bulunamadı");
	}
	
	public void updateStudent(Student newStudent) {
		for (Student student : students) {
			if(student.getId() == newStudent.getId()) {
				students.set(students.indexOf(student),newStudent);
				System.out.println(student.getId() + " id li kullanıcı güncellendi!");
				return;
			}
		}
		System.out.println("Güncellenecek öğrenci bulunamadı");	
	}
	
	public List<Student> getAll() {
		return this.students;
	}
	
	
}

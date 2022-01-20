package OOP_Student;

public class Student {
	private int id;
	private String name;
	private String surname;
	private String identityNumber;
	
	
	
	public Student() {
		super();
	}



	public Student(int id, String name, String surname, String identityNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getIdentityonNumber() {
		return identityNumber;
	}



	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	

}

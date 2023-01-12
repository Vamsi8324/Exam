
public class Author {
	private String name;
	private int age;
	private String gender;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}

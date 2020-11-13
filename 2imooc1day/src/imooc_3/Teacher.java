package imooc_3;

public class Teacher {
	private String name;
	private int age;
	public Teacher() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	
	public void  teacher() {
		System.out.println("爱护每一位学生！");
	}
}

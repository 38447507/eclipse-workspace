package imooc_4;

import imooc_4.Teacher;

public class PersonDome {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setName("����");
		t1.setAge(33);
		System.out.println(t1.getAge() + t1.getName());
		t1.teach();
		
		System.out.println("------------------");
		
		Teacher t2=new Teacher("����һ", 33);
		System.out.println(t2.getName()+t2.getAge());
		t2.teach();
		

	}
}

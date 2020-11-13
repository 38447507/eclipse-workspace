 package imooc_3;

public class Dome {
	
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setAge(30);
		t1.setName("ÀîÀÚ");
		System.out.println(t1.getName()+t1.getAge());
		t1.teacher();
		System.out.println("------------------");
		
		Teacher t2=new Teacher("Íõ¶¬Ò»", 33);
		System.out.println(t2.getName()+t2.getAge());
		t2.teacher();
		
	}

}

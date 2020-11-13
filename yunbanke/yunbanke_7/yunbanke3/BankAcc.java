package yunbanke3;

import java.util.Scanner;

public class BankAcc {
	private String name;
	private String id;
	private int balance;
	public BankAcc() {}
	public BankAcc(String name, String id, int balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void queryBalance(BankAcc a) {
		System.out.println("\n姓名："+a.getName()+"\n"+"账号："+a.getId()+"\n"+"余额："+a.getBalance()+"\n");
	}
	public static void addBalance(BankAcc a) {
		System.out.print("请输入存款额度：");
		Scanner num1=new Scanner(System.in);
		int s=num1.nextInt();
		a.setBalance(a.getBalance()+s);
		System.out.println("存款成功！");
	}
	public static void minusBalance(BankAcc a) {
		System.out.print("请输入取款额度：");
		Scanner num2=new Scanner(System.in);
		int s=num2.nextInt();
		a.setBalance(a.getBalance()-s);
		System.out.println("取款成功！");
	}
	public static void main(String[] args) {
		BankAcc a=new BankAcc();
		a.setBalance(100);
		a.setId("38447507");
		a.setName("艾伊斯坦");	
		//用户界面
		while(true) {
		System.out.println("-------银行--------");
		System.out.println("1.查询余额");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.退出");
		System.out.print("请输入你的选择：");
		Scanner sc=new Scanner(System.in);
		int s =sc.nextInt();
		switch (s) {
		case 1:
			queryBalance(a);
			break;
		case 2:
			addBalance(a);
			break;			
		case 3:
			minusBalance(a);
			break;
		case 4:
			System.out.println("谢谢使用！");
			System.exit(0);
		}
	}
}
	

}

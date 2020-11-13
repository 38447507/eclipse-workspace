package yunbanke1;

public class Trigon {
	private double a;
	private double b;
	private double c;
	public Trigon(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Trigon() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public void girthTrigon() {
		double d=a+b+c;
		System.out.println("�����ε��ܳ�Ϊ��"+d);
		
	}
	public void areaTrigon() {
		double p;
		double s;
		p=(a+b+c)/2;
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));//��Ҫ����
		
		System.out.println("�����ε����Ϊ��"+s);
	}


public static void main(String[] args) {

//	Trigon b=new Trigon();
//	b.setA(3);
//	b.setB(4);
//	b.setC(5);
//	b.girthTrigon();
//	b.areaTrigon();
	
	Trigon a=new Trigon(7, 8, 9);
	a.areaTrigon();
	a.girthTrigon();
}
}

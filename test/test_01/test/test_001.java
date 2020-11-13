package test;

import java.util.Scanner;

public interface test_001 {
	public static void main(String[] args) {
		System.out.printf("输入当前摄氏温度：");
		Scanner num=new Scanner(System.in);
		double C=num.nextDouble();
		double b=(9/5)*C+32;
		System.out.println("可转换为华氏温度："+b);

	}
}

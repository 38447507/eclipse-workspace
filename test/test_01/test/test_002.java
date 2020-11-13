package test;
import java.io.*;
import java.util.Scanner;
public enum test_002 {
public static void main(String[] args){
    Scanner  num=new Scanner(System.in);
    System.out.printf("请输入球体半径：");
    double r=num.nextDouble();
    System.out.println("球的半径为"+r+"\npi的值为"+Math.PI);
    double v= Math.PI*4/3*Math.pow(r,3);
    System.out.println("球体体积为："+v);
    System.out.println("******************************");
    double pi=3.14;
    System.out.printf("请输入球体半径：");
    double r1=num.nextDouble();
    System.out.println("球的半径为"+r1+"\npi的值为"+pi);
    double v1=Math.pow(r,3)*pi*4/3;
    System.out.printf("球的体积为：%s", v1);
	
}
}

package test;
import java.io.*;
import java.util.Scanner;
public enum test_002 {
public static void main(String[] args){
    Scanner  num=new Scanner(System.in);
    System.out.printf("����������뾶��");
    double r=num.nextDouble();
    System.out.println("��İ뾶Ϊ"+r+"\npi��ֵΪ"+Math.PI);
    double v= Math.PI*4/3*Math.pow(r,3);
    System.out.println("�������Ϊ��"+v);
    System.out.println("******************************");
    double pi=3.14;
    System.out.printf("����������뾶��");
    double r1=num.nextDouble();
    System.out.println("��İ뾶Ϊ"+r1+"\npi��ֵΪ"+pi);
    double v1=Math.pow(r,3)*pi*4/3;
    System.out.printf("������Ϊ��%s", v1);
	
}
}

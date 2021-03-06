package yunbanke2;
import java.util.*;
public class Matrix {
	public int[][] a;
	public Matrix(int row,int col) {
		this.a = new int[row][col];
	}
	public int getA(int row,int col) {
		return this.a[row][col];
	}
	public void setA(int row,int col,int num) {
		this.a[row][col] = num;
	}  
    public void scanner(int h,int l){//输入矩阵
    	Random random = new Random();
    	for(int i = 0; i < h; i++) {
			for(int j = 0; j < 4; j++) {
				a[i][j]= random.nextInt(100);
			}
    	}
    }
    public void print() {//输出矩阵
    	for(int i = 0;i < a.length;i++)
    	{
    		for(int j = 0;j < a[0].length;j++)
    		{
    			if(j==0)
    				System.out.print(a[i][j]);
    			else
    				System.out.print(" "+a[i][j]);
    		}
    		System.out.println();
    	}
    	System.out.println();
    	System.out.println("--------------------------");
    }
	
    public void add(Matrix m) {//两矩阵相加               重点：需要理解
    	Matrix t = new Matrix(this.a.length,m.a[0].length);
		for(int i = 0; i < m.a.length; i++) {
			for(int j = 0; j < m.a[0].length; j++) {
				t.setA(i, j, this.getA(i, j) + m.getA(i, j));
			}
		}			t.print();
    } 
	public static void main(String[] args) {
		Matrix a =new Matrix(3,4);
		Matrix b=new Matrix(3,4);
//		Random random = new Random();
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 4; j++) {
//				a.setA(i, j, random.nextInt(100));
//				b.setA(i, j, random.nextInt(100));
//			}
//	}
			a.scanner(3,4);
			b.scanner(3,4);
			a.print();
			b.print();
			a.add(b);
			
			
		
	}
}

package hw;
import java.util.*;
public class hw01_105021061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.print("���G ");
		int n=src.nextInt();
		System.out.print("ī�G�G ");
		int a=src.nextInt();
		System.out.print("�h�B�G ");
		int b=src.nextInt();
		System.out.print("��l�G ");
		int c=src.nextInt();
		
		int x=a*15+b*20+c*30;
		int p=0;
		int p1=0;
		int q=0;
		int q1=0;
		
		if(n>=x)
		{
			 p=x/50;
			p1=x%50;
			q=p1/5;
			 q1=q%5;
		}
		else
		{
			System.out.print("0");
		}
		
		System.out.println(p+"��50��");
		System.out.println(q+"��5��");
		System.out.println(q1+"��1��");
		
	}

}
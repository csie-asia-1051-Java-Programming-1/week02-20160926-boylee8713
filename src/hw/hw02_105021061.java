package hw;
import java.util.*;
public class hw02_105021061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("�k�Ϳ�J1,�k�Ϳ�J2");
		int bg=src.nextInt();
		System.out.println("����:");
		int a=src.nextInt();
		
		double sum=0;
		if(bg==1)
		{
			sum=(a-80)*0.7;
		}
		else{
			sum=(a-70)*0.6;
		}
		System.out.print("�з��魫:");
		System.out.print(sum);
		System.out.print("����");
	}

}
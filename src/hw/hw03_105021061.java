package hw;

import java.util.*;

public class hw03_105021061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("��J�褸�~:");
		int a = src.nextInt();
		
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					System.out.print("�|�~");
				}
				else
				{
					System.out.print("���~");
				}
			}
			else
			{
				System.out.print("�|�~");
			}
		}
		else
		{
			System.out.print("���~");
		}
	}
}

import java.util.Scanner;
class roman2
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:-");
		Scanner sc=new Scanner(System.in);
		int dec=sc.nextInt();
		int num[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int i=12,q;
		while(dec!=0)
		{
			q=dec/num[i];
			for(int k=0;k<q;k++)
			{
				System.out.print(roman[i]);
			}
			dec=dec%num[i];
			i--;
		}
	}	
}
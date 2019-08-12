import java.util.Scanner;
public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of chocolate squares:-");
		int n=sc.nextInt();
		System.out.println("Enter the numbers on chocolate squares:-");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter birth date:-");
		int d=sc.nextInt();
		System.out.println("Enter birth month:-");
		int m=sc.nextInt();
		int sum,count=0;
		for(int i=0;i<n-m+1;i++)
		{
			sum=arr[i];
			for(int j=i+1;j<m+i;j++)
			{
				sum+=arr[j];
			}
			if(sum==d)
				count++;
		}
		System.out.println("Ways to divide the chocolate:-"+count);
	}

}

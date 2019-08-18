package Assignment;
import java.util.Scanner;
public class spiralform {

	static void ConvertToSpiral(int arr[][],int r,int c)
	{
		int a=0,b=0,i;
		while(a<r && b<c)
		{
			for(i=b;i<c;i++)
				System.out.print(arr[a][i]+" ");
			a++;
			for(i=a;i<r;i++)
				System.out.print(arr[i][c-1]+" ");
			c--;
			if(a<r)
			{
				for(i=c-1;i>=b;i--)
					System.out.print(arr[r-1][i]+" ");
				r--;
			}
			if(b<c)
			{
				for(i=r-1;i>=a;i--)
					System.out.print(arr[i][b]+" ");
				b++;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		ConvertToSpiral(arr,r,c);
	}

}

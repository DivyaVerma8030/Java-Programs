
import java.util.Random;
class otp
{
	public static void main(String args[])
	{
		String digits="1234567890";
		String lchars="qwertyuiopasdfghjklzxcvbnm";
		String uchars="QWERTYUIOPASDFGHJKLZXCVBNM";
		String spcl="!@#$%^&*-_+=/<>.?";
		String val=digits+lchars+uchars+spcl;
		char otp[]=new char[4];
		Random r=new Random();
		for(int i=0;i<otp.length;i++)
		{
			otp[i]=val.charAt(r.nextInt(val.length()));
		}
		for(char c:otp)
			System.out.print(c);
	}
}
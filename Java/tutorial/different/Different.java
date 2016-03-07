import java.util.Scanner;

public class Different
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextLong())
		{
			long a = in.nextLong(), b = in.nextLong();
			long r = Math.abs(a - b);
			System.out.println(r);
		}
	}
}

import java.util.Scanner;

public class Conundrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String cipherText = in.next();
        int index = 0;
        int count = 0;
        while(index < cipherText.length())
        {
            for (int i = 0; i < 3; i++)
            {
                if (i == 0)
                {
                    if (cipherText.substring(index, index+1).equals("P"))
                    {
                        index++;
                    }
                    else
                    {
                        count++;
                        index++;
                    }
                }
                else if (i == 1)
                {
                    if (cipherText.substring(index, index+1).equals("E"))
                    {
                        index++;
                    }
                    else
                    {
                        count++;
                        index++;
                    }
                }
                else if (i == 2)
                {
                    if (cipherText.substring(index, index+1).equals("R"))
                    {
                        index++;
                    }
                    else
                    {
                        count++;
                        index++;
                    }
                }
            }
        }   
        System.out.println(count);
    }
}

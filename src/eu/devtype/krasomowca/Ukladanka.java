package eu.devtype.krasomowca;

/**
 * Created by zoladp on 29/05/17.
 */
public class Ukladanka
    {
    public static void main(String[] args)
        {
        int x = 3;
        while (x > 0)
            {
            if (x > 2)
                {
                System.out.print("a");
                x--;
                System.out.print("-");
                }
            if (x == 2)
                {
                System.out.print("b c");
                System.out.print("-");
                }
            if (x == 1) System.out.print("d");
            //System.out.print("-");
            x--;


            }
        }
    }

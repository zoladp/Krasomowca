package eu.devtype.krasomowca;

/**
 * Created by zoladp on 29/05/17.
 */
public class Test
    {
    public static void main(String[] args)
        {
        int x = 0;
        int y = 0;
        int roz = 0;
        while(x < 4)
            {
            //y = x -y;

            //y = y + x;

            //y = y+2;
            //if(y>4) y = y-1;

            //x = x + 1;
            //y = y + x;

            if(y < 5)
                {
                x++;
                if(y < 3) x -= 1;
                }
            y = y+2;

            System.out.print(x+""+y+" ");
            x++;
            }

        }
    }


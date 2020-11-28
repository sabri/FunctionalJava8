import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sabrouch.
 * Date: 11/24/2020
 */

public class FunctionalJava8 {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2,6);
        List<Integer> b = Arrays.asList(24,36);


        int ans = 0;

        for(int j=1;j<=100;j++)
        {
            System.out.println(j);
            boolean hh = true;
            for(int bb : b)
            {
                if(bb%j!=0)
                {
                    System.out.println(bb);
                    hh = false;
                    break;
                }
            }
            System.out.println(hh);
            if(hh)
            {
                for(int bb : a)
                {
                    System.out.println(bb);
                    if(j%bb!=0)
                    {
                        System.out.println(j);
                        hh = false;
                        break;
                    }
                }

                if(hh)
                    ans++;

            }    }
        System.out.println(ans);
    }
}


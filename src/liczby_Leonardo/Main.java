package liczby_Leonardo;

class Leonardo // rekurencyjne znajdowanie n-tej liczby Leonardo
{
    public static  int leo(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        return(leo(n - 1) + leo(n - 2) + 1);
    }
}
public class Main {
    public static void main(String[] args)
    {
        for (int i = 0 ;i < 26; i++)
        {
            System.out.println("L (" + i + ") = " + Leonardo.leo(i) + "");
        }
    }
}

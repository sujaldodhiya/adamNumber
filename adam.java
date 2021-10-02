import java.io.*;
class AdamNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number");
        int num = Integer.parseInt(br.readLine());

        int sq = num*num;

        AdamNumber obj=new AdamNumber();
        int reverse = obj.reverse(num);

        int sq_reverse = reverse*reverse;

        int rev_sq = obj.reverse(sq);

        if(rev_sq == sq_reverse)
            System.out.println("Adam Number");
        else
            System.out.println("Not Adam Number");      

    }

    int reverse(int n)
    {
        int rem, rev=0;

        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}

package PracticePrograms;

public class armStrong {

    public static void main(String[] args) {

        int num = 370;
        int exp = num;
        int result =0;
        int r =0;

        while(num!=0)
        {
            result = num%10;
            num = num/10;
            r = r+result*result*result;
        }
        if (exp==r)
        {
            System.out.println("is a amstrong : " + r);
        }
        else {
            System.out.println("is not a amstrong : " + r);
        }
    }
}

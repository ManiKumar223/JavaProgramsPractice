package PracticePrograms;

public class reverseNumber {

    public static void main(String[] args) {

        int num = 141;
        int rev =0;
        int org = num;

        while (num>0)
        {
            rev = rev*10+num%10;
            num = num/10;
        }
        if (org==rev)
        {
            System.out.println("is  a palindrome");
        }
        else {
            System.out.println("is not a palindrome");
        }
    }
}

package PracticePrograms;

public class reverseString {

    public static void main(String[] args) {

        String str = "level";
        String rev = "";
        String org = str;
        int len = str.length();

        for (int i=len-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        if (!org.equals(rev))
        System.out.println("is not a palindrome");
        else
            System.out.println("is  a palindrome");
    }
}

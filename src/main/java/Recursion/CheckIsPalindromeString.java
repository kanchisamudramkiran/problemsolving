package Recursion;

public class CheckIsPalindromeString {

    static  Boolean isValidPalindromeString(String str,int s, int e ){
        if(s == e)
            return  true;

        if(str.charAt(s) != str.charAt(e)){
            return  false;
        }
        if(s<e+1)
            return  isValidPalindromeString(str,s+1,e-1);
        return true;

            }

    public static void main(String[] args) {

        String str = "FooF";

        int n = str.length();

        if (isValidPalindromeString(str,0, n-1 ))
            System.out.println("Yes");
        else
            System.out.println("No");
    }


    }

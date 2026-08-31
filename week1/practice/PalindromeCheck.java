package week1.practice;

public class PalindromeCheck {
    static boolean isPalindromeIterative(String text){
        int i=0,j=text.length()-1;
        while(i<j){ if(text.charAt(i)!=text.charAt(j)) return false; i++; j--; }
        return true;
    }
    static boolean isPalindromeRecursive(String text){
        if(text.length()<=1) return true;
        if(text.charAt(0)!=text.charAt(text.length()-1)) return false;
        return isPalindromeRecursive(text.substring(1,text.length()-1));
    }
    static boolean isPalindromeArrayReversal(String text){
        return text.equals(new StringBuilder(text).reverse().toString());
    }
    public static void main(String[] args){
        String input="madam";
        System.out.println("Iterative:"+isPalindromeIterative(input));
        System.out.println("Recursive:"+isPalindromeRecursive(input));
        System.out.println("Array Reversal:"+isPalindromeArrayReversal(input));
    }
}

package Demo;

public class polindrome {
			public static void main(String[] args) {
	        String input = "nayan";
	        System.out.println(input + " is a palindrome? " + isPalindrome(input));
	    }


public static boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}
}

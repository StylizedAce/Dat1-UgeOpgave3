class Task1 {

public static void main(String[] args) {
System.out.println(printIfPalindrome("Hello"));

  
}


public static String printIfPalindrome(String s) {

  s = s.toLowerCase();

  StringBuilder sb = new StringBuilder(s);

  sb.reverse();
  if (s.equals(sb.toString())) {
    return "Palindrome";
  }

  else {
    return "not a palindrome";
  }
 }
}
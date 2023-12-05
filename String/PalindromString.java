package String;

public class PalindromString {

    public static boolean isPalindromString(String str) {
        boolean status = true;
        String newstring = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = newstring.length() - 1;        
        while (start <= end) {
            if (newstring.charAt(start) != newstring.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return status;
    }

    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromString(name));
    }
}

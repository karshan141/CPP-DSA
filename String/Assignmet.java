package String;

public class Assignmet {

    public static void countVovels(String str) {
        int vovels = 0;
        for (int i = 0; i < str.length(); i++) {

            if ((int) Character.toLowerCase(str.charAt(i)) == 97 || (int) Character.toLowerCase(str.charAt(i)) == 101
                    || (int) Character.toLowerCase(str.charAt(i)) == 105
                    || (int) Character.toLowerCase(str.charAt(i)) == 111
                    || (int) Character.toLowerCase(str.charAt(i)) == 117) {
                vovels++;
            }
        }
        System.out.println(vovels);
    }

    public static void main(String[] args) {
        String str = "HelloaWorld";
        String str1 = new String("ApanaCollage");
        String str2 = "ApanaCollage".replace("l", "" );

        String str3 = "ApnaCollege".replace("l", "");
        System.out.println(str2);
        countVovels(str);
    }

}

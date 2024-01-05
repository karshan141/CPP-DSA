package BitManipulation;

public class OddEven {

    public static void OddEvenNumber(int n) {
        int bit = 1;

        /*
         * n=105 bit=1;
         * 105 (in binary: 1101001)
         * & 1 (in binary: 0000001)
         * -----------------------
         * 1 (in binary: 0000001)
         * 
         */
        if ((bit & n) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        OddEvenNumber(105);
    }
}

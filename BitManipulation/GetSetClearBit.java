package BitManipulation;

public class GetSetClearBit {

    public static void getIthBit(int n, int i) {
        int bit = 1 << i;
        if ((n & bit) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static void setIthBit(int n, int i) {
        int bit = 1 << i;
        System.out.println(n | bit);
    }

    public static void clearIthBit(int n, int i) {
        int bit = ~(1 << i);
        System.out.println(n & bit);
    }

    public static void main(String[] args) {
        getIthBit(10, 3);
        setIthBit(10, 0);
        clearIthBit(10, 1);
    }
}

public class RedroverSevenThree {
    public static void main(String[] args) {
        int a = 451;
        int b = 32;
        System.out.println(opSum(a, b));
        System.out.println(opMinus(a, b));
        System.out.println(opMult(a, b));
        System.out.println(opDiv(a, b));
    }

    public static int opSum(int x, int y) {
        return x + y;
    }
    public static int opMinus(int x, int y) {
        return x - y;
    }
    public static int opMult(int x, int y) {
        return x * y;
    }
    public static int opDiv(int x, int y) {
        return x / y;
    }
}


package bs450;

public class DIFFixed {

    public static int findLast(int[] x, int y) {
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    public static int countPositive(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int lastZero_fix1(int[] x) {
        for (int i = x.length-1; i >= 0; i--) {
            if (x[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int lastZero_fix2(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[x.length - i - 1] == 0) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int oddOrPos(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i] % 2) == 1 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }
}

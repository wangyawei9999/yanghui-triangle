public class Yanghui {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i < n; i++) {
            for (int m = n; m - i > 0; m--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                int temp = getPosition(j, i);
                System.out.print(getPosition(j, i));
                while (temp < 100000) {
                    temp = temp * 10;
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static int getPosition(int x, int y) {
        if (x == 0 || y == x) {
            return 1;
        }
        return getPosition((x - 1), (y - 1)) + getPosition(x, (y - 1));
    }
}

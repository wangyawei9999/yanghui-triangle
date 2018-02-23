import java.util.ArrayList;
import java.util.List;

public class YanghuiByList {
    public static void main(String[] args) {
        System.out.println(generator(10));
    }

    private static List<List<Integer>> generator(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (n == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}

import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr = new int[] {1, 2, 3};
        System.out.println(Arrays.equals(map(arr), new int[]{2, 4, 6}));
    }
    public static int[] map(int[] arr) {
    return Arrays.stream(arr).map((i)->i*2).toArray();
    }
}

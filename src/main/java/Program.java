import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,3};
        ArrayUtils.reverse(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayUtils.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}

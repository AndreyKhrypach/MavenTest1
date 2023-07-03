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

        int[] oldArray = { 2, 3, 4, 5 };
        int[] newArray = ArrayUtils.add(oldArray, 1);
        int[] expectedArray = { 2, 3, 4, 5, 1 };

        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(expectedArray));

    }
}

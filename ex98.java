import java.util.Arrays;

public class ex98 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);


        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}

import java.util.Arrays;

public class BubbleSort {
    void sortElements(int[]a) {
        System.out.println("Array before sorting : " + Arrays.toString(a));
        int size = a.length;
        for (int i = 0; i < size - 1; i++) {// for calculating passes for example if there are n elements there will be n-1 passes
            for (int j = 0; j < size - 1; j++) {   // for comparing elements
                if (a[j + 1] < a[j]) {
                    int temp = a[j+1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting is : " + Arrays.toString(a));
    }

}

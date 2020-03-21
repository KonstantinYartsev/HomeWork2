import Constants.TestSortConstants;

import java.util.Arrays;

public class TestFixedSort {
    public static String testFixedSort() {
        System.out.println("\nТестирование класса FixedSort:\n");
        int[] array;
        String s = "Метод reverseSort класса FixedSort работает без ошибок\n";
        for (TestSortConstants t : TestSortConstants.values()) {
            System.out.printf("//Исходный массив: %s || Ожидаемый результат: %s \n",
                    Arrays.toString(t.testArray()), Arrays.toString(t.expectedArray()));
            array = t.testArray().clone();
            FixedSort.reverseSort(array);
            System.out.println(Arrays.toString(array));
            if (!Arrays.equals(t.expectedArray(), array)){
                System.out.println("Массив отсортирован неверно!");
                s = "!Метод reverseSort класса FixedSort работает некорректно!\n";
            }
        }
        return s;
    }
}

import Constants.TestSortConstants;

import java.util.Arrays;

public class TestSort {


    public static String testSort() {
        int[] array;
        System.out.println("\nТестирование класса Sort:\n");
        String s = "Метод reverseSort класса Sort работает без ошибок\n";
        for (TestSortConstants t : TestSortConstants.values()) {
            System.out.printf("//Исходный массив: %s || Ожидаемый результат: %s \n",
                    Arrays.toString(t.testArray()), Arrays.toString(t.expectedArray()));
            array = t.testArray().clone();
            Sort.reverseSort(array);
            System.out.println(Arrays.toString(array));
            if (!Arrays.equals(t.expectedArray(), array)){
                System.out.println("Массив отсортирован неверно!");
                s = "!Метод reverseSort класса Sort работает некорректно!\n";
            }
        }
        return s;
    }

}

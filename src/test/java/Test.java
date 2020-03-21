public class Test {
    public static void main(String args[ ])
    {
        String s = "\n";

        System.out.println("Начало тестирования");
        s = s + TestSort.testSort();
        s = s + TestFixedSort.testFixedSort();
        s = s + TestMap.testMap();
        System.out.println(s);

    }
}


public class TestMap {
    public static String testMap(){
        System.out.println("\nТестирование класса Map:\n");
        String s = "";
        s = s + TestCountElementsInMap.testCountElementsInMap();
        s = s + TestDeleteValueFromMap.testDeleteValueFromMap();
        return s;
    }
}

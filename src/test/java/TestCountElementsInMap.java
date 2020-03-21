import Constants.TestMapConstants;

public class TestCountElementsInMap {
    public static String testCountElementsInMap(){
        String s = "Метод countElementsInMap класса Map работает без ошибок\n";

        for (TestMapConstants t : TestMapConstants.values()) {
            int i;
            System.out.printf("//Исходные данные: %s %s || Ожидаемый результат: %d%n",
                    t.testLastName(), t.testFirstName(), t.expectedCount());
            i = Map.countElementsInMap(t.testLastName(),t.testFirstName());
            System.out.println(i);
            if (i != t.expectedCount()){
                System.out.println("Результат не совпадает с ожидаемым!");
                s = "!Метод countElementsInMap класса Map работает некорректно!\n";
            }
        }
        return s;
    }
}

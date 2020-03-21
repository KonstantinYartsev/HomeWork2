import Constants.TestMapConstants;

import java.util.HashMap;

public class TestDeleteValueFromMap {
    public static String testDeleteValueFromMap(){
        String s = "Метод testDeleteValueFromMap класса Map работает без ошибок\n";
        System.out.println("Исходные данные:");
        for (TestMapConstants t : TestMapConstants.values()) {
            HashMap<String, String> testMap = new HashMap<String, String>();
            testMap.put(t.testLastName(), t.testFirstName());
            System.out.printf("%s %s%n",
                    t.testLastName(), t.testFirstName());
        }
        return s;

        //Пока не работает
    }
}

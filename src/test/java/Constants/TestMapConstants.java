package Constants;

public enum TestMapConstants {
    PERSON_1 ("Дмитров", "Алексей", 1),
    PERSON_2 ("Ерохин", "Сергей ", 3),
    PERSON_3 ("ЯрМоЛов", "Алексей", 1),
    PERSON_4 ("Дмитрий", "Красеев", 0),
    PERSON_5 (" Ерохин", "Сергей", 3),
    PERSON_6 ("Андреев ", "Андрей ", 2),
    PERSON_7 ("Смирнов", "Владиmир", 0),
    PERSON_8 ("", "", 0),
    PERSON_9 ("Андреев", "Андрей", 2),
    PERSON_10 (new String("Дмитров"), new String("Алексей"), 1);



    private final String testLastName;
    private final String testFirstName;
    private  final int expectedCount;

    TestMapConstants(String testLastName, String testFirstName, int expectedCount) {
        this.testLastName = testLastName;
        this.testFirstName = testFirstName;
        this.expectedCount = expectedCount;
    }

    public String testLastName() {
        return testLastName;
    }

    public String testFirstName() {
        return testFirstName;
    }

    public int expectedCount() {
        return expectedCount;
    }

}

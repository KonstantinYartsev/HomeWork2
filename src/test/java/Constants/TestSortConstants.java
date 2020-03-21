package Constants;

public enum TestSortConstants {
    ARRAY_1 (new int[]{}, new int[]{}),
    ARRAY_2 (new int[]{1}, new int[]{1}),
    ARRAY_3 (new int[]{-10,5,0,-2,4,-100,0,5}, new int[]{5,5,4,0,0,-2,-10,-100}),
    ARRAY_4 (new int[]{-2,-1,0,1,2,3,4}, new int[]{4,3,2,1,0,-1,-2}),
    ARRAY_5 (new int[]{1,1,1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,1,1}),
    ARRAY_6 (new int[]{9,8,7,6,5,4,3,2,1}, new int[]{9,8,7,6,5,4,3,2,1});

    private final int[] testArray;
    private final int[] expectedArray;

    TestSortConstants(int[] testArray, int[] expectedArray) {
        this.testArray = testArray;
        this.expectedArray = expectedArray;
    }

    public int[] testArray() {
        return testArray;
    }
    public int[] expectedArray() {
        return expectedArray;
    }
}

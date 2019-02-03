public class ArrayComparator {

    public static boolean compare(int[] firstTable, int[] secondTable) {
        boolean result = false;
        if (firstTable.length == secondTable.length) {
            result = true;
            for (int i = 0; i < firstTable.length && result; i++) {
                result = firstTable[i] == secondTable[i];
            }
        }
        return result;
    }
}
public class PNBinarySearch<T extends Comparable<T>> {
    private T[] array;
    private T searchValue;
    private static int startIndexArray, endIndexArray;

    public PNBinarySearch(T[] array, T searchValue) {
        this.array = array;
        this.searchValue = searchValue;
        startIndexArray = 0;
        endIndexArray = array.length - 1;
    }

    public boolean search() {
        printArray();
        T halfValue;
        if (endIndexArray - startIndexArray != 1) {
            halfValue = this.array[(endIndexArray + startIndexArray) / 2];
        } else {
            if (this.array[startIndexArray] == this.searchValue) {
                return true;
            } else {
                return (this.array[endIndexArray] == this.searchValue);
            }
        }
        System.out.println(halfValue);
        if (halfValue.compareTo(this.searchValue) == 0) {
            return true;
        } else if (halfValue.compareTo(this.searchValue) > 0) {
            halfArray(this.array, true);
            return search();
        } else {
            halfArray(this.array, false);
            return search();
        }
    }

    private void halfArray(T[] array, boolean searchLeftTrue) {
        if (searchLeftTrue) {
            endIndexArray = (endIndexArray + startIndexArray) / 2;
        } else {
            startIndexArray = (endIndexArray + startIndexArray) / 2;
        }
    }

    private void printArray() {
        for (int i = startIndexArray; i <= endIndexArray; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

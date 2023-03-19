public class CombSort {
    private int[] array;

    public CombSort(int[] array) {
        this.array = array;
    }

    public int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    public void combSort(int[] array) {
        int gap = array.length;
        boolean swapped = true;// чтобы убедиться, что цикл выполняется

        while(gap != 1 || swapped) {
            gap = getNextGap(gap);

            swapped = false;
            for (int i = 0; i < array.length - gap; i++) {
                if (array[i] > array[i + gap]) {
                    int old = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = old;

                    swapped = true;
                }
            }
        }
    }
}

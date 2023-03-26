public class CombSort {
    private int[] array;
    private int iterations;

    public CombSort(int[] array) {
        this.array = array;
        this.iterations = 0;
    }

    public int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        iterations += 1;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }
    public void combSort(int[] array) {
        int gap = array.length;
        boolean swapped = true;// чтобы убедиться, что цикл выполняется
        iterations +=2 ;

        while(gap != 1 || swapped) {
            gap = getNextGap(gap);
            iterations += 2;

            swapped = false;
            for (int i = 0; i < array.length - gap; i++) {
                if (array[i] > array[i + gap]) {
                    int old = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = old;
                    iterations += 4;

                    swapped = true;
                }
            }
        }
    }

    public int getIterations() {
        return iterations;
    }
}

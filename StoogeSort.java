public class StoogeSort {
    private int[] array;
    private int left;
    private int right;
    private int iterations;

    public StoogeSort(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
        this.iterations = 0;
    }

    public void stoogeSort(int[] array, int left, int right) { // left\right - индекс левой\правой границы
        iterations++;
        if (left >= right) {return;}

        iterations++;
        if (array[left] > array[right]) {
            // меняем первый и последний элемент местами, если первый больше
            int old_left = array[left];
            array[left] = array[right];
            array[right] = old_left;
            iterations+=3;
        }

        iterations++;
        if (right - left > 1) {
            int third = (right - left + 1) / 3;
            // рекурсивно вызываем метод для первой 2/3 и для последней 2/3, а потом снова для первой 2/3
            iterations++;
            stoogeSort(array, left, right-third);
            stoogeSort(array, left+third, right);
            stoogeSort(array, left, right-third);
        }
    }
    public int getIterations() {
        return iterations;
    }
}

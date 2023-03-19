public class Main {
    public static void main(String[] args) {
        // тест stooge sort
        System.out.println("Сортировка по частям (блуждающая сортировка):");

        int[] array1 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        StoogeSort a1 = new StoogeSort(array1, 0, array1.length - 1);
        a1.stoogeSort(array1, 0, array1.length -1);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();


        //тест comb sort
        System.out.println("Сортировка расчёской:");

        int[] array2 = new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        
        CombSort a2 = new CombSort(array2);
        a2.combSort(array2);

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}

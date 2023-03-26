public class Main {
    public static void main(String[] args) {
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

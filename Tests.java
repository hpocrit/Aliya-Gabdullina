import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tests {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt", true));

        for (int j = 0; j < 200; j++) {
            int[] array = new int[(int) (100 + Math.random()*5000)];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 1000);
            }
            StoogeSort a = new StoogeSort(array, 0, array.length - 1);
            long start = System.nanoTime();
            a.stoogeSort(array, 0, array.length -1);
            long end = System.nanoTime();
            long time = end - start;
            long operations = a.getIterations();

            writer.write(array.length + "." + time+"." + operations + "\n");
            writer.flush();
        }

        writer.flush();
        writer.close();

    }
}

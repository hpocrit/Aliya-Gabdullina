import java.io.*;

public class Tests {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt", true));
        BufferedReader reader = new BufferedReader(new FileReader("inputData.txt"));

        for (int i = 0; i < 100; i++) {
            String[] array1 = null;
            String s;
            s = reader.readLine();
            array1 = s.split(" ");
            int[] array = new int[array1.length];
            for (int j = 0; j < array.length; j++){
                array[j] = Integer.parseInt(array1[j]);
            }
            CombSort a = new CombSort(array);
            long start = System.nanoTime();
            a.combSort(array);
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

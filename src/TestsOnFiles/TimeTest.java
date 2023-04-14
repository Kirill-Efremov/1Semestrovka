package src.TestsOnFiles;

import src.Timsort.Sorting;
import src.Timsort.Timsort;

import java.io.*;

public class TimeTest { public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/TestsOnFiles/data.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/TestsOnFiles/result.txt", true));
        for (int i = 0; i < 100; i++) {

            String s = reader.readLine();
            String[] arraySplit = s.split(" ");
            int[] array = new int[arraySplit.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(arraySplit[j]);
            }


            Sorting timsSort = new Timsort();
            long start = System.nanoTime();
            timsSort.sort(array,array.length);
            long end = System.nanoTime();
            long time = end - start;



            writer.write("Length: " + array.length + " Time work program: " + time + "\n");
            writer.flush();
        }

        writer.flush();
        writer.close();
    }
}


package task.java;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class LScanner {

    public static void read(){

        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        try {
            Scanner fin = new Scanner(Paths.get(dir, "example.txt"), "UTF-8");
            String line = fin.nextLine();
            System.out.println(line);


            while (fin.hasNext()) {
                line = fin.next();
                System.out.println(line);
            }

        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }
    }
}

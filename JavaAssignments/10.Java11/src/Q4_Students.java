import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4_Students {
    public static void main(String[] args) {
        int count=0;
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\mshamnan\\Downloads\\Java11Assignments_StudentList.txt"));


            while(scanner.hasNext())
            {
                String line = scanner.next();

                String lineAfterTrim = line.trim();

                System.out.println(lineAfterTrim);

                count=count+1;
            }
            System.out.println("Number of students are : "+count);


        }

        catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }
}

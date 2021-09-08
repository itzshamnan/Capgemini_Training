import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Q4_Students {
    public static void main(String[] args) throws IOException {
        var path = "C:\\Users\\mshamnan\\Downloads\\Java11Assignments_StudentList.txt";
        try {
            String names= Files.readString(Path.of(path));

            ArrayList<String > namelist = new ArrayList<>(Arrays.asList(names));

            System.out.println(namelist);

            namelist.forEach(p->p.trim());

            System.out.println("-----------------------------");
            System.out.println(namelist.get(1));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ARMID060817M on 8/9/2017.
 */
public class Reader {

    public static List<String> readFile(String fileName){

        List<String> userInfo = new ArrayList<String>();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(s -> {
                System.out.println(s);
                userInfo.add(s);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInfo;

    }
}

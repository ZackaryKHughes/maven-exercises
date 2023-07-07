import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String world = "World";
        System.out.println(StringUtils.prependIfMissing(world, "Hello, "));
        System.out.println(world);
    }
}
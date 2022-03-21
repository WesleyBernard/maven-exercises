import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class main {
    public static void main(String[] args) {
        Scanner daBoi = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String strong = daBoi.nextLine();
        System.out.println("you entered : " + strong);
        System.out.println(StringUtils.isNumeric(strong));
        System.out.println(StringUtils.swapCase(strong));
        System.out.println(StringUtils.reverse(strong));
    }
}

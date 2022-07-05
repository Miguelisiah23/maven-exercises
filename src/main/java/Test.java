import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String userString = sc.nextLine();

        System.out.println(StringUtils.isNumeric(userString));

        System.out.println(StringUtils.swapCase(userString));

        System.out.println(StringUtils.reverse(userString));


    }
}
package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a width:");
        int width = input.nextInt();

        System.out.println("Please enter a height");
        int height = input.nextInt();
        int area = height * width;
        System.out.println("The area is" + area);
    }
}

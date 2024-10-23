import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                triangle.append(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }
        System.out.println(triangle.toString());
        
        scanner.close();
    }
}

import java.util.Scanner;
public class Tax_Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Item Price: ");
        double Price=scanner.nextDouble();
        double Tax=0.05;
        double tax_P=Price * Tax;
        System.out.println("Tax is: $"+tax_P);
        scanner.close();


    }


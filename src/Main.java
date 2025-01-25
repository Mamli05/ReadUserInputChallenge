import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the 5 numbers:");
        int count=1;
        double sum = 0;
        do{
            System.out.println("Enter number #" + count + ": ");
            String a = scanner.nextLine();
            try{
                double number= Double.parseDouble(a);
                count++;
                sum+=number;
            }catch (NumberFormatException badUserdata){
                System.out.println("Invalid Value");

            }

        }while(count<=5);
        System.out.println("Sum of 5 numbers is = " + sum);
    }
}

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Programm started: ");
        String[] products = new String[]{ " ", "Broad", "Apple", "Butter", "Pbutter" };
        int[] prices = new int[]{0, 30, 100, 200, 350 };
        int sum = 0;
        int quantity[] = new int[100];
        for (int i = 0; i<100; i++) {
            quantity[i] = 0;
        }
        System.out.println("        продукт ------ номер ------ стоимость");
        for (int i = 1; i < 5; i++) {
        System.out.printf("%14s %11s %18s\n", products[i], i, prices[i]);
        }
        System.out.println("");
        //int currentPrice = prices[productNumber];
        //int sumProducts = 0;
        int productNumber = 0;
        int totalSum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please, input number of Product");
            System.out.println("end for quite");
            String inputString = scanner.nextLine();
            if ("end".equals(inputString)) {
                System.out.println("Programm ended.");
                break;
            }
            try {
                int result = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println("input integer ");
            }


            int startPos = inputString.indexOf("");
            String startTimeString = inputString.substring( startPos, startPos + 1);
            startTimeString = startTimeString.trim();
            productNumber = Integer.parseInt(startTimeString);

            int endPos = inputString.indexOf(" ");
            String endTimeString = inputString.substring(endPos + 1);
            endTimeString = endTimeString.trim();
            int t = Integer.parseInt(endTimeString);

            quantity[productNumber] += t;
        }
        System.out.println("Вы купили");
        for (int i = 0; i< 5; i++) {
            if (quantity[i] != 0) {
               sum += prices[i]*quantity[i];
               totalSum += sum;
               System.out.println(products[i] + "--Количество: " + quantity[i] + " --сумма: " + sum);
            }

        }
        System.out.println("Итого: " + totalSum);
    }
}

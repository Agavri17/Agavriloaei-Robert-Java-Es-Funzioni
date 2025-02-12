import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer previousNumber = null;
        
        while (true) {
            System.out.print("Inserisci un numero: ");
            int currentNumber = scanner.nextInt();
            
            // Controlla se i due numeri consecutivi sono uguali
            if (previousNumber != null && previousNumber == currentNumber) {
                System.out.println("Due numeri consecutivi uguali: " + previousNumber + " e " + currentNumber + ". Fine.");
                break;
            }


       }
    }
}
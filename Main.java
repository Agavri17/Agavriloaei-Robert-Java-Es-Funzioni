import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while(true){
            System.out.print("inserisci un numero(0 per terminare): ");
            numero = scanner.nextInt();
            if (numero == 0){
                break;
            }
            stampaRiga(numero);
        }
        scanner.close();
        
    }
}

    //Esercizio2
    public static void stampaRiga(int n) {
        char simbolo = (n % 2 == 0) ? '*' : '#'; 
        System.out.print(n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(simbolo);
        }
        System.out.println(); 
    }

    public class ConvertiTempo {
        public static void main(String[] args) {
            int secondi = leggiSecondi(); 
            convertiEStampa(secondi); 
        }
    
        
        public static int leggiSecondi() {
            Scanner scanner = new Scanner(System.in);
            int secondi;
            do {
                System.out.print("Inserisci il tempo in secondi (tra 0 e 84600): ");
                secondi = scanner.nextInt();
                if (secondi < 0 || secondi > 84600) {
                    System.out.println("Valore non valido! Riprova.");
                }
            } while (secondi < 0 || secondi > 84600);
            return secondi;
        }
    
        
        public static void convertiEStampa(int secondi) {
            int ore = secondi / 3600;
            int minuti = (secondi % 3600) / 60;
            int secRestanti
    


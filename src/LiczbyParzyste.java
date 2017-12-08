public class LiczbyParzyste {

    public static void main(String[] args) {

        int x;

        System.out.println("Wyświetlamy liczby parzyste od 0 d 100 poniżej: ");
        x = 0;
        int suma = 0;
        do {
            System.out.printf("%d ", x);
            suma += x;
            x += 2;
        } while (x <= 100);

        System.out.println("\nSuma wszystkich liczb parzystych w przedziale od 0 do 100 wynosi: " + suma);
    }
}
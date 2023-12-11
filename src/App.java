import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> pila = new ArrayList<>();
        List<String> cola = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir elementos a la pila");
            System.out.println("2. Añadir elementos a la cola");
            System.out.println("3. Mostrar la pila y la cola completa");
            System.out.println("4. ¿Están vacías la pila y la cola?");
            System.out.println("5. Pick pila");
            System.out.println("6. Quick pila");
            System.out.println("7. Pick cola");
            System.out.println("8. Quick cola");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                System.out.println("\nIngrese los elementos a añadir a la pila, separados por comas: " + "\n");
                String elementosPila = scanner.nextLine();
                String[] elementosPilaArray = elementosPila.split(",");
                for (String elemento : elementosPilaArray) {
                    pila.add(0, elemento.trim());
                }
                break;
            case 2:
                System.out.println("\nIngrese los elementos a añadir a la cola, separados por comas: " + "\n");
                String elementosCola = scanner.nextLine();
                String[] elementosColaArray = elementosCola.split(",");
                for (String elemento : elementosColaArray) {
                    cola.add(elemento.trim());
                }
                break;
                case 3:
                    System.out.println("\nPila completa: " + pila + "\n");
                    System.out.println("\nCola completa: " + cola + "\n");
                    break;
                case 4:
                    System.out.println("\n¿Está vacía la pila?: " + (pila.isEmpty() ? "Vacia" : "Con elementos") + "\n");
                    System.out.println("\n¿Está vacía la cola?: " + (cola.isEmpty() ? "Vacia" : "Con elementos") + "\n");
                    break;
                case 5:
                    System.out.println("\nPrimer elemento de la pila (pick): " + pila.get(0) + "\n");
                    break;
                case 6:
                        String primerElementoPila = pila.remove(0);
                        System.out.println("\nPrimer elemento de la pila (quick): " + primerElementoPila + "\n");
                        break;
                case 7:
                    System.out.println("\nPrimer elemento de la cola (pick): " + cola.get(0) + "\n");
                    break;
                case 8:
                    String primerElementoCola = cola.remove(0);
                    System.out.println("\nPrimer elemento de la cola (quick): " + primerElementoCola + "\n");
                    break;
                case 9:
                    scanner.close();
                    return;
                default:
                    System.out.println("\nOpción no válida.");
            }
        }
    }
}
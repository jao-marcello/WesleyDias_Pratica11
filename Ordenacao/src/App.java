import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Selecione o método de ordenação:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        int metodo = scanner.nextInt();

        switch (metodo) {
            case 1:
                Ordenacao.bubbleSort(vetor);
                break;
            case 2:
                Ordenacao.selectionSort(vetor);
                break;
            case 3:
                Ordenacao.insertionSort(vetor);
                break;
            case 4:
                Ordenacao.quickSort(vetor, 0, vetor.length - 1);
                break;
            default:
                System.out.println("Método inválido.");
                return;
        }

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}

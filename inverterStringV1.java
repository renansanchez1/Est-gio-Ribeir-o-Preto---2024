import java.util.Scanner;

public class inverterStringV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();

        String stringInvertida = inverterString(entrada);

        System.out.println("String invertida: " + stringInvertida);
    }

    public static String inverterString(String entrada) {
        char[] arrayDeCaracteres = entrada.toCharArray();

        int inicio = 0;

        int fim = entrada.length() - 1;

        while (inicio < fim) {
            char temp = arrayDeCaracteres[inicio];
            arrayDeCaracteres[inicio] = arrayDeCaracteres[fim];
            arrayDeCaracteres[fim] = temp;

            inicio++;
            fim--;
        }
        return new String(arrayDeCaracteres);
    }
}
#include <stdio.h>

int main() {
    char texto[100], textoInvertido[100];
    int i, j, aux;

    printf("Digite um texto: ");
    scanf("%s", texto); 

    for (aux = 0; texto[aux] != '\0'; aux++);

    for (i = aux - 1, j = 0; i >= 0; i--, j++)
        textoInvertido[j] = texto[i];
    textoInvertido[j] = '\0'; 

    printf("Texto Invertido: \n%s\n", textoInvertido);

    return 0;
}

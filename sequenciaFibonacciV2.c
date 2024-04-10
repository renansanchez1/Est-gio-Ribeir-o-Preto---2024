#include <stdio.h>

int main() {
    int numero, anterior = 0, atual = 1, proximo = 0;

    printf("Informe um número: ");
    scanf("%d", &numero);

    while (proximo < numero) {
        proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
    }
    if (proximo == numero) {
        printf("O número informado %d pertence à sequência de Fibonacci\n", numero);
    } else {
        printf("O número informado %d NÃO pertence à sequência de Fibonacci\n", numero);
    }

    return 0;
}

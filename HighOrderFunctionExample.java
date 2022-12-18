import java.util.function.Function;

public class HighOrderFunctionExample {

    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Define uma função que recebe um número inteiro como entrada e retorna o seu quadrado
        Function<Integer, Integer> squareFunction = x -> x * x;

        // Usa a função map para aplicar a função de alta ordem squareFunction a cada elemento da lista numbers
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(squareFunction)
                                              .collect(Collectors.toList());

        // Imprime a lista de números ao quadrado
        System.out.println(squaredNumbers);
    }
}

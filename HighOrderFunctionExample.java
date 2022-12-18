import java.util.function.Function;
import java.util.function.Predicate;

public class HighOrderFunctionExample {
  public static void main(String[] args) {
    Function<Integer, Integer> increment = x -> x + 1;
    Function<Integer, Integer> multiplyBy10 = x -> x * 10;
    Predicate<Integer> isEven = x -> x % 2 == 0;

    // A função de alta ordem é o método "andThen", que recebe uma função como parâmetro e aplica essa função em seguida à função original.
    Function<Integer, Integer> incrementAndMultiply = increment.andThen(multiplyBy10);

    // Esta é a chamada a essa função de alta ordem.
    int result = incrementAndMultiply.apply(2);
    System.out.println(result);  // Imprime 30

    // Outra função de alta ordem é o método "compose", que aplica uma função antes da função original.
    Function<Integer, Integer> multiplyAndIncrement = increment.compose(multiplyBy10);

    // Esta é a chamada a essa função de alta ordem.
    int result2 = multiplyAndIncrement.apply(2);
    System.out.println(result2);  // Imprime 21

    // Ainda temos o método "negate" da interface Predicate, que inverte o resultado de uma expressão booleana.
    Predicate<Integer> isOdd = isEven.negate();

    // Esta é a chamada a essa função de alta ordem.
    boolean result3 = isOdd.test(3);
    System.out.println(result3);  // Imprime true
  }
}

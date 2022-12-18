import java.util.function.Function;

public class HighOrderFunctionExample {
  public static void main(String[] args) {
    Function<Integer, Integer> increment = x -> x + 1;
    Function<Integer, Integer> multiplyBy10 = x -> x * 10;

    // A função de alta ordem é o método "andThen", que recebe uma função como parâmetro e aplica essa função em seguida à função original.
    Function<Integer, Integer> incrementAndMultiply = increment.andThen(multiplyBy10);

    // Esta é a chamada a essa função de alta ordem.
    int result = incrementAndMultiply.apply(2);
    System.out.println(result);  // Imprime 30
  }
}

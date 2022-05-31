import java.util.function.*;

public class Calculator {

    public interface Supplier<Calculator> {
        Calculator get();
    }

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? Integer.valueOf("На ноль делить нельзя") : x / y;
    //Ошибка устранил, теперь при попытке делить на ноль вылезет сообщение об ошибке
    // Можно еще поменять местами х и у

    UnaryOperator<Integer> pow = (x) -> x * x;
    UnaryOperator<Integer> abs = (x) -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}

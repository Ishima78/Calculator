


public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        System.out.println(a);
        int d = calc.minus.apply(1, 1);
        System.out.println(calc.isPositive.test(d));
        calc.println.accept(d);
        int c = calc.devide.apply(a, d);
        calc.println.accept(c);
    }

}
package course.javalearning.day1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final int MULTIPLIER = 2;
        IntFunction f2 = x -> 2 * x;
        System.out.println("f2= " + f2.apply(5));
        BiIntegerFunction add = (x, y) -> MULTIPLIER * (x + y);
        System.out.println("x+y=" + add.apply(2, 3));
        StringFunct upperCase = x -> "Hello " + x.toUpperCase();
        System.out.println("upperCase: " + upperCase.apply("hello world"));
        System.out.println(apply10(x -> x + 2));
        System.out.println(apply10(x -> x - 2));
        System.out.println(func().apply(20));
        System.out.println(apply10(func()));
        MyFunction<Integer, Integer> add5 = x -> x + 5;
        MyFunction<Integer, MyFunction<Integer, Integer>> addCurring = x -> y -> x + y;
        System.out.println(addCurring.apply(5)
                                     .apply(7));

        MyFunction<Integer, MyFunction<Integer, MyFunction<Integer, Integer>>> add3 = x -> y -> z -> x + y + z;
        ArrayList<Object> myList = new ArrayList<>(); 
    }

    public static int apply10(IntFunction func) {
        return func.apply(10);
    }

    public static IntFunction func() {
        return x -> x - 2;
    }
}

package course.javalearning.day1;

@FunctionalInterface
public interface BiIntegerFunction {
    public int apply(
            int x,
            int y
    );

    default int apply2(int x) {
        return x + 2;
    }

    static int apply3(int x) {
        return x + 3;
    }
}

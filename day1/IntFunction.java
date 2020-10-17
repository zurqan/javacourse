package course.javalearning.day1;

@FunctionalInterface
public interface IntFunction {
    int apply(int x);

    default IntFunction compose(IntFunction firstFunction) {
        return x -> apply(firstFunction.apply(x));
    }

}

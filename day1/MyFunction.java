package course.javalearning.day1;

@FunctionalInterface
public interface MyFunction<T, V> {
    public V apply(T t);
}

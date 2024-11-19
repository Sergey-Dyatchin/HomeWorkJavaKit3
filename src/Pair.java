public class Pair <T, E> {
    private T first;
    private E second;

    public Pair (T first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }

    @Override
    public String toString() {
        return first.toString() + " " + second.toString();
    }
}

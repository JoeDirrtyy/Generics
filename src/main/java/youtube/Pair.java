package youtube;

import java.util.StringJoiner;

//T and S are "Type parameters"
public class Pair<T, S> {

    private final T first;
    private final S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

 @Override
    public String toString(){
        return new StringJoiner(",", Pair.class.getSimpleName() + "[","]")
                .add("first='" + first + "'")
                .add("second='" + second + "'")
                .toString();
 }
}

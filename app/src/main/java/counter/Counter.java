package counter;

import counter.items.Apple;

import java.util.function.Predicate;

public class Counter<T extends Countable> implements Predicate<T> {
    private int count;

    public int getCount() {
        return count;
    }

    public void add(T item) {
        count += item.getCount();
    }

    @Override
    public boolean test(T t) {
        return t instanceof Apple;
    }
}

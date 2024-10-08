package app.comicwar.utils;

import java.util.List;
import java.util.ArrayList;

public abstract class Repository<T> {
    private final List<T> items;

    protected Repository() {
        items = new ArrayList<>();
    }

    public int getRepositorySize() {
        return items.size();
    }

    public T getItem(final int index) {
        return items.get(index);
    }

    public void addItem(final T item) {
        items.add(item);
    }
}

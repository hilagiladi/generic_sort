import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortedGroup<E extends Comparable<E>> {

    private ArrayList<E> items;

    public SortedGroup() {
        items = new ArrayList<E>();
    }

    public void add(E item) {
        this.items.add(item);
        Collections.sort(this.items);
    }

    public int remove(E item) {
        int count = 0;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).equals(item)) {
                this.items.remove(i--);
                count++;
            }
        }
        return count;
    }

    public Iterator<E> iterator() {
        return items.iterator();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Iterator<E> iterator = this.iterator();

        while (iterator.hasNext()) {
            E item = iterator.next();
            str.append(item).append("\n");
        }
        return str.toString();
    }
}
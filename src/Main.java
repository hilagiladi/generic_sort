import java.util.Iterator;

public class Main {

    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
        SortedGroup<T> temp = new SortedGroup<T>();
        Iterator<T> iterator = sGroup.iterator();

        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item.compareTo(x) > 0)
                temp.add(item);
        }
        return temp;
    }

    public static void main(String[] args) {

    }


}



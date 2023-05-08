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

        Student s1 = new Student("Gill", 111111111, 80);
        Student s2 = new Student("Bill", 222222222, 90);
        Student s3 = new Student("Jack", 333333333, 100);
        Student s4 = new Student("Shir", 444444444, 70);
        Student s5 = new Student("Dany", 555555555, 95);
        Student s6 = new Student("Shlomo", 666666666, 60);
        Student s7 = new Student("Noy", 777777777, 97);
        Student s9 = new Student("Gill2", 999999999, 80);
        Student s10 = new Student("Gill3", 101010101, 80);
        Student s11 = new Student("Bill2", 121212122, 90);
        Student s12 = new Student("Bill3", 131313131, 90);


        // creating new sorted group for the students
        SortedGroup<Student> sortedGroup = new SortedGroup<Student>();

        // adding students and prints the sorted group
        sortedGroup.add(s1);
        sortedGroup.add(s2);
        sortedGroup.add(s3);
        sortedGroup.add(s4);
        sortedGroup.add(s5);
        sortedGroup.add(s6);
        sortedGroup.add(s7);
        sortedGroup.add(s9);
        sortedGroup.add(s10);
        sortedGroup.add(s11);
        sortedGroup.add(s12);
        System.out.println("The sortedGroup after adding students:" + "\n" + sortedGroup);

        // removing students and prints the sorted group
        int num1 = sortedGroup.remove(s1);
        int num2 = sortedGroup.remove(s2);
        System.out.println("The sortedGroup after removing " + (num1 + num2) + " students:" + "\n" + sortedGroup);


        // creating new sorted group with student with grade 90+
        SortedGroup<Student> newSortedGroup = reduce(sortedGroup, new Student("John", 888888888, 90));
        System.out.println("The **NEW** sortedGroup after reducing:" + "\n" + newSortedGroup);
        System.out.println("The original sortedGroup stayed the seme after reducing:" + "\n" + sortedGroup);


    }


}



public class Student implements Comparable<Student> {// implements Comparable<Integer> {

    private String name;
    private long id;
    private int grade;

    public Student(String name, long id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Student)
            return this.compareTo(((Student) other))==0;
        return false;
    }

    @Override
    public int compareTo(Student other) {
        if (this.grade>other.grade)
            return 1;
        if (this.grade<other.grade)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade;
    }

//    @Override
//    public int compareTo(Student o) {
//        return 0;
//    }
}

public class Student implements Comparable<Integer> {

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
            return this.compareTo(((Student) other).grade)==0;
        return false;
    }

    @Override
    public int compareTo(Integer otherGrade) {
        if (this.grade>otherGrade)
            return 1;
        if (this.grade<otherGrade)
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
}

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends Person {
    private String course;
    private int fee;
    private Credantials creds;
    private static String company = "Maxima"; // it won't be serialized
    private ArrayList<String> grades;

    public Student(int id, String name, String course, int fee, Credantials creds) {
        super(id, name);

        this.course = course;
        this.fee = fee;

        this.creds = creds;

        this.grades = new ArrayList<String>();
        this.grades.add("5");
        this.grades.add("5");
        this.grades.add("5");
        this.grades.add("5");
    }

    public String getCourse() {
        return course;
    }

    public int getFee() {
        return fee;
    }

    public Credantials getCredantials() {
        return creds;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }
}

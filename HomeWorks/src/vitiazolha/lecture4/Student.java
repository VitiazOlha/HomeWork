package vitiazolha.lecture4;

/**
 * Created by vitiazolha on 08.09.15.
 */
public class Student extends Status {
    private String theHighSchool;
    private String faculty;
    private int course;

    public Student(String theHighSchool, String faculty, int course) {
        this.theHighSchool = theHighSchool;
        this.faculty = faculty;
        this.course = course;
    }

    @Override
    public void getStatus()
    {
        System.out.println("I'm student");
    }

    public String getTheHighSchool() {
        return theHighSchool;
    }

    public void setTheHighSchool(String theHighSchool) {
        this.theHighSchool = theHighSchool;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

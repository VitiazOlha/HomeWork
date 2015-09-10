package vitiazolha.lecture4;

/**
 * Created by vitiazolha on 08.09.15.
 */
public class Human {
    private final String name;
    private int age;
    private Status status;

    public Human(String name, int age, Status status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Status getStatus() {
        return status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

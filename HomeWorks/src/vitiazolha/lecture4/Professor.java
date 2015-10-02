package vitiazolha.lecture4;

/**
 * Created by vitiazolha on 08.09.15.
 */
public class Professor extends Status {
    private String post;

    public Professor(String post) {
        this.post = post;
    }

    @Override
    public void getStatus()
    {
        System.out.println("I'm professor");
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

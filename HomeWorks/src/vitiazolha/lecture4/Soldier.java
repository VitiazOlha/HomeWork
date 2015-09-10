package vitiazolha.lecture4;

/**
 * Created by vitiazolha on 08.09.15.
 */
public class Soldier extends Status {
    private String corps;
    private String platoon;

    public Soldier(String corps, String platoon) {
        this.corps = corps;
        this.platoon = platoon;
    }

    public void getStatus()
    {
        System.out.println("I'm soldier");
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getPlatoon() {
        return platoon;
    }

    public void setPlatoon(String platoon) {
        this.platoon = platoon;
    }
}

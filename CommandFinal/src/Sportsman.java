public class Sportsman {
    private final String name;

    public Sportsman(String name) {
        this.name = name;
    }
    public String run() { return "Running"; }
    public String swim() { return "Swimming"; }
    public String jump() { return "Jumping"; }

    public String execute(SportsmanCommand cmd) {
        return name + ": " + cmd.execute(this);
    }
}

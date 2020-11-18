public class SportsmanCommandLoop implements SportsmanCommand {
    
    private final String name;
    private final int count;
    private final SportsmanCommand cmd;

    public SportsmanCommandLoop(String name, int count, SportsmanCommand cmd) {
        this.name = name;
        this.count = count;
        this.cmd = cmd;
    }
    
    public String execute(Sportsman sportsman)
    {
        final StringBuilder sb = new StringBuilder();
        final boolean isTraining = cmd instanceof SportsmanCommandTrening;


        sb.append(count)
                .append(" x ")
                .append(isTraining ? "(" : "")
                .append(cmd.execute(sportsman))
                .append(isTraining ? ")" : "");
        return sb.toString();
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
}

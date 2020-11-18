
import Strategy.SportsmanStrategyJump;
import Strategy.SportsmanStrategyRun;
import Strategy.SportsmanStrategySwim;

public class Sportsman {
    private final String name;
    private final SportsmanStrategyRun ssRun;
    private final SportsmanStrategyJump ssJump;
    private final SportsmanStrategySwim ssSwim;

    public Sportsman(String name, SportsmanStrategyRun ssRun, SportsmanStrategyJump ssJump, SportsmanStrategySwim ssSwim) {
        this.name = name;
        this.ssRun = ssRun;
        this.ssJump = ssJump;
        this.ssSwim = ssSwim;
    }

    
    public String run() { return ssRun.run(); }
    public String swim() { return ssSwim.swim(); }
    public String jump() { return ssJump.jump(); }

    public String execute(SportsmanCommand cmd) {
        return name + ": " + cmd.execute(this);
    }
}

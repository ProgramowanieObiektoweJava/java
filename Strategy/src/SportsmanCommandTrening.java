
import java.util.ArrayList;

public class SportsmanCommandTrening implements SportsmanCommand {
    
    private final String name;
    private final ArrayList<SportsmanCommand> list;

    public SportsmanCommandTrening(String name,ArrayList<SportsmanCommand> list) {
        this.name = name;
        this.list = list;
    }
    
    public String execute(Sportsman sportsman)
    {
        final StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(SportsmanCommand cmd: list)
        {
            if(first) first = false;
            else sb.append(", ");
            sb.append(cmd.execute(sportsman));
        }
        
        return sb.toString();
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
}

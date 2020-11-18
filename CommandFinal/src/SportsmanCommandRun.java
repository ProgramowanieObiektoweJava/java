public class SportsmanCommandRun implements SportsmanCommand {
    public String execute(Sportsman sportsman)
    {
        return sportsman.run();
    }

    @Override
    public String toString() {
        return "Run";
    }
    
}

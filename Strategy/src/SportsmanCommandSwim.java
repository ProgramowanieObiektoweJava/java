public class SportsmanCommandSwim implements SportsmanCommand {
    public String execute(Sportsman sportsman)
    {
        return sportsman.swim();
    }

    @Override
    public String toString() {
        return "Swim";
    }
    
}

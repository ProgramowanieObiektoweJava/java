
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Maciek Malik
 */
public class AnimalFactory {

    public static final HashMap<String,AnimalMaker> map = new HashMap<String,AnimalMaker>(){
        {
            put("Cat", (name)->new Cat(name));
            put("Cow", (name)->new Cow(name));
            put("Fly", (name)->new Fly(name));
            put("Dragonfly", (name)->new Dragonfly(name));
        }
    };

    public static Animal make(String kind, String name){
        return map.get(kind).make(name);
    }

    public static List<String> keys(){
        return map.keySet().stream().sorted().collect(Collectors.toList());
    }

}

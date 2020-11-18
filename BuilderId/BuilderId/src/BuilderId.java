
import java.util.ArrayList;
import java.util.Collections;
import jdk.javadoc.internal.doclets.toolkit.util.Comparators;

public class BuilderId {

    private String emptyStr = "null";
    private String separator = ", ";

    public BuilderId setSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    public BuilderId setEmptyStr(String emptyStr) {
        this.emptyStr = emptyStr;
        return this;
    }

    private final ArrayList<Long> list = new ArrayList<>();

    public BuilderId clear() {
        list.clear();
        return this;
    }

    public BuilderId append(Long id) {
        list.add(id);
        return this;
    }

    @Override
    public String toString() {
        if (list.isEmpty()) {
            return emptyStr;
        }
        StringBuilder sb = new StringBuilder();

        //list.sort( (a, b) -> ((a < b ? 1 : 0) - (a > b ? 1 : 0)) );
        Collections.sort(list); 
        
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                sb.append(separator);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

}

import common.type.OptionEnum;

import java.util.HashMap;
import java.util.Map;

public abstract class Sub {
    // common method "getName" and "getCost"  to be used by concrete subs
    protected String name;
    protected Sub() {
        name = "Base";
    }

    public String getName(){
        return name;
    }

    public abstract double getCost() throws Exception;
}

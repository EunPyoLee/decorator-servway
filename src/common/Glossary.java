package common;

import common.type.BaseEnum;

import java.util.HashMap;
import java.util.Map;

public class Glossary {
    Map<BaseEnum, Double> BaseToPrice = new HashMap<>();
    public Glossary(){
        // Build glossary for menu prices
        BaseToPrice.put(BaseEnum.CHICKEN, 6.0);
        BaseToPrice.put(BaseEnum.BEEF, 7.0);
        BaseToPrice.put(BaseEnum.MEATBALL, 6.5);
        BaseToPrice.put(BaseEnum.TUNA, 6.0);
        BaseToPrice.put(BaseEnum.VEGGIE, 5.0);
        BaseToPrice.put(BaseEnum.NONE, 0.0);
    }
}

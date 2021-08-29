package common;

import common.exceptions.InvalidRequest;
import common.type.BaseEnum;
import common.type.BreadEnum;

import java.util.HashMap;
import java.util.Map;

public class Glossary {
    Map<BaseEnum, Double> baseToPrice = new HashMap<>();
    Map<BreadEnum, Double> breadToPrice = new HashMap<>();
    public Glossary(){
        // Build glossary for base prices
        baseToPrice.put(BaseEnum.CHICKEN, 6.0);
        baseToPrice.put(BaseEnum.BEEF, 7.0);
        baseToPrice.put(BaseEnum.MEATBALL, 6.5);
        baseToPrice.put(BaseEnum.TUNA, 6.0);
        baseToPrice.put(BaseEnum.VEGGIE, 5.0);
        baseToPrice.put(BaseEnum.NONE, 0.0);

        // Build glossary for bread prices
        breadToPrice.put(BreadEnum.PLAIN, 0.0);
        breadToPrice.put(BreadEnum.WHOLEWHEAT, 1.0);
        breadToPrice.put(BreadEnum.FLAT, 1.5);
        breadToPrice.put(BreadEnum.WRAP, 0.5);
    }

    public double getBaseCost(BaseEnum b) throws Exception {
        if(baseToPrice.containsKey(b)){
            return baseToPrice.get(b);
        }
        throw new InvalidRequest(String.format("Invalid Request: BaseEnum %s does not exist", b.toString()));
    }

    public double getBreadCost(BreadEnum b) throws Exception {
        if(breadToPrice.containsKey(b)){
            return breadToPrice.get(b);
        }
        throw new InvalidRequest(String.format("Invalid Request: BreadEnum %s does not exist", b.toString()));
    }
}

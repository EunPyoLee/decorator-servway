package common;

import common.exceptions.InvalidRequest;
import common.exceptions.ServiceUnavailable;
import common.type.BaseEnum;
import common.type.BreadEnum;
import common.type.OptionEnum;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;

public class Glossary {
    Map<BaseEnum, Double> baseToPrice = new HashMap<>();
    Map<BreadEnum, Double> breadToPrice = new HashMap<>();
    Map<OptionEnum, Double> optionToPrice = new HashMap<>();
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

        // Build glossary for option prices
        optionToPrice.put(OptionEnum.TOMATO, 0.1);
        optionToPrice.put(OptionEnum.ONION, 0.2);
        optionToPrice.put(OptionEnum.LETTUCE, 0.05);
        optionToPrice.put(OptionEnum.OLIVE, 0.25);
        optionToPrice.put(OptionEnum.BBQ_SAUCE, 0.5);
        optionToPrice.put(OptionEnum.MUSTARD, 0.4);
    }

    public double getBaseCost(BaseEnum b) throws Exception {
        if(baseToPrice.containsKey(b)){
            if(b == BaseEnum.NONE){
                throw new ServiceUnavailable("Service Unavailable: Please choose our base");
            }
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

    public double getOptionCost(OptionEnum o) throws Exception {
        if(optionToPrice.containsKey(o)){
            return optionToPrice.get(o);
        }
        throw new InvalidRequest(String.format("Invalid Request: OptionEnum %s does not exist", o.getOid()));

    }
}

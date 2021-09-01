import common.Glossary;
import common.type.OptionEnum;

public class Lettuce extends OptionDecorator{
    private final Sub wrapped;
    private final Glossary glossary;
    Lettuce(Sub s, Glossary g){
        glossary = g;
        wrapped = s;
    }

    @Override
    public double getCost() throws Exception {
        return wrapped.getCost() + glossary.getOptionCost(OptionEnum.LETTUCE);
    }

    @Override
    public String getName() {
        return wrapped.getName() + " " + OptionEnum.LETTUCE.toString();
    }
}

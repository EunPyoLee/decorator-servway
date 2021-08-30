import common.Glossary;
import common.type.OptionEnum;

public class Onion extends OptionDecorator{
    private final Sub wrapped;
    private final Glossary glossary;
    public Onion(Sub s, Glossary g){
        wrapped = s;
        glossary = g;
    }

    @Override
    public double getCost() throws Exception {
        return wrapped.getCost() + glossary.getOptionCost(OptionEnum.ONION);
    }

    @Override
    public String getName() {
        return wrapped.getName() + " " + OptionEnum.ONION.toString();
    }
}

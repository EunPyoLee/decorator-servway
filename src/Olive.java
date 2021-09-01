import common.Glossary;
import common.type.OptionEnum;

public class Olive extends OptionDecorator{
    private final Sub wrapped;
    private final Glossary glossary;
    public Olive(Sub s, Glossary g){
        wrapped = s;
        glossary = g;
    }

    @Override
    public double getCost() throws Exception {
        return wrapped.getCost() + glossary.getOptionCost(OptionEnum.OLIVE);
    }

    @Override
    public String getName() {
        return wrapped.getName() + " "  + OptionEnum.OLIVE.toString();
    }
}

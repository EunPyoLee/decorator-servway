import common.Glossary;
import common.type.OptionEnum;

public class Mustard extends OptionDecorator{
    private final Sub wrapped;
    private final Glossary glossary;
    public Mustard(Sub s, Glossary g){
        wrapped = s;
        glossary = g;
    }

    @Override
    public double getCost() throws Exception {
        return wrapped.getCost() + glossary.getOptionCost(OptionEnum.MUSTARD);
    }

    @Override
    public String getName() {
        return wrapped.getName() + " " + OptionEnum.MUSTARD.toString();
    }
}

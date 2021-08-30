import common.Glossary;
import common.type.OptionEnum;

public class Tomato extends OptionDecorator {
    private final Sub wrapped;
    private final Glossary glossary;
    public Tomato(Sub s, Glossary g){
        wrapped = s;
        glossary = g;
    }

    @Override
    public double getCost() throws Exception {
        return wrapped.getCost() + glossary.getOptionCost(OptionEnum.TOMATO);
    }

    @Override
    public String getName() {
        return wrapped.getName() + " " + OptionEnum.TOMATO.toString();
    }
}

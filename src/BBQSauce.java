import common.Glossary;
import common.type.OptionEnum;

public class BBQSauce extends OptionDecorator{
    private final Sub wrapped;
    private final Glossary glossary;
    public BBQSauce(Sub s, Glossary g){
        wrapped = s;
        glossary = g;
    }

    @Override
    public double getCost() throws Exception {
        return wrapped.getCost() + glossary.getOptionCost(OptionEnum.BBQ_SAUCE);
    }

    @Override
    public String getName() {
        return wrapped.getName() + " " + OptionEnum.BBQ_SAUCE.toString();
    }
}

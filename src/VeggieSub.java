import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;

public class VeggieSub extends Sub {
    private BreadEnum bread;
    private final Glossary glossary;
    public VeggieSub(BreadEnum b, Glossary g){
        this.bread = b;
        this.name = "Veggie" + " " + b.toString();
        this.glossary = g;
    }

    @Override
    public double getCost() throws Exception{
        return glossary.getBaseCost(BaseEnum.VEGGIE) + glossary.getBreadCost(bread);
    }
}

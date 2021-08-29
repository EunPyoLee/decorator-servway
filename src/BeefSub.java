import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;

public class BeefSub extends Sub {
    private BreadEnum bread;
    private final Glossary glossary;
    public BeefSub(BreadEnum b, Glossary g){
        this.bread = b;
        this.name = "Beef" + " " + b.toString();
        this.glossary = g;
    }

    @Override
    public double getCost() throws Exception{
        return glossary.getBaseCost(BaseEnum.BEEF) + glossary.getBreadCost(bread);
    }
}

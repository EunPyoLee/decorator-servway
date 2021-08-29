import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;

public class ChickenSub extends Sub {
    private BreadEnum bread;
    private final Glossary glossary;
    public ChickenSub(BreadEnum b, Glossary g){
        this.bread = b;
        this.name = "Chicken" + " " + b.toString();
        this.glossary = g;
    }

    @Override
    public double getCost() throws Exception{
        return glossary.getBaseCost(BaseEnum.CHICKEN) + glossary.getBreadCost(bread);
    }
}

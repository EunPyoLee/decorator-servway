import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;

public class MeatBallSub extends Sub {
    private BreadEnum bread;
    private final Glossary glossary;
    public MeatBallSub(BreadEnum b, Glossary g){
        this.bread = b;
        this.name = "Meatball" + " " + b.toString();
        this.glossary = g;
    }

    @Override
    public double getCost() throws Exception{
        return glossary.getBaseCost(BaseEnum.MEATBALL) + glossary.getBreadCost(bread);
    }
}

import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;

public class TunaSub extends Sub {
    private BreadEnum bread;
    private final Glossary glossary;
    public TunaSub(BreadEnum b, Glossary g){
        this.bread = b;
        this.name = "Tuna" + " " + b.toString();
        this.glossary = g;
    }

    @Override
    public double getCost() throws Exception{
        return glossary.getBaseCost(BaseEnum.TUNA) + glossary.getBreadCost(bread);
    }
}

import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcreteBaseSubNoAddOnTest {
    private final Glossary g = new Glossary();
    @Test
    public void testChickenSub(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        Sub chickenSubWhole = new ChickenSub(BreadEnum.WHOLEWHEAT, g);
        Sub chickenSubFlat = new ChickenSub(BreadEnum.FLAT, g);
        Sub chickenSubWrap = new ChickenSub(BreadEnum.WRAP, g);

        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString());
        Assertions.assertEquals(chickenSubWhole.getName(), "Chicken" + " " + BreadEnum.WHOLEWHEAT.toString());
        Assertions.assertEquals(chickenSubFlat.getName(), "Chicken" + " " + BreadEnum.FLAT.toString());
        Assertions.assertEquals(chickenSubWrap.getName(), "Chicken" + " " + BreadEnum.WRAP.toString());
        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = chickenSubWhole.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.WHOLEWHEAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = chickenSubFlat.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.FLAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = chickenSubWrap.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.WRAP));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }
}
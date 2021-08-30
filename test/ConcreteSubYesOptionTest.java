import common.Glossary;
import common.type.BaseEnum;
import common.type.BreadEnum;
import common.type.OptionEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcreteSubYesOptionTest {
    private final Glossary g = new Glossary();
    @Test
    public void testTomatoOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new Tomato(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.TOMATO.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.TOMATO));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

}
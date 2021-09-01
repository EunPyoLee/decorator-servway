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

    @Test
    public void testOnionOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new Onion(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.ONION.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.ONION));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testTomatoOnionOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new Tomato(chickenSubPlain, g);
        chickenSubPlain = new Onion(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.TOMATO + " " + OptionEnum.ONION.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.TOMATO) + g.getOptionCost(OptionEnum.ONION));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testLettuceOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new Lettuce(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.LETTUCE.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.LETTUCE));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }


}
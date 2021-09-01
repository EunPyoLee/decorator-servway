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

    @Test
    public void testOliveOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new Olive(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.OLIVE.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.OLIVE));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testBBQSauceOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new BBQSauce(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.BBQ_SAUCE.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.BBQ_SAUCE));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testMustardOption(){
        Sub chickenSubPlain = new ChickenSub(BreadEnum.PLAIN, g);
        chickenSubPlain = new Mustard(chickenSubPlain, g);
        Assertions.assertEquals(chickenSubPlain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " " + OptionEnum.MUSTARD.toString());

        try{
            double cost = chickenSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.CHICKEN) + g.getBreadCost(BreadEnum.PLAIN) + g.getOptionCost(OptionEnum.MUSTARD));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testAllOptionCombination(){
        Sub plain = new ChickenSub(BreadEnum.PLAIN, g);
        Sub whole = new ChickenSub(BreadEnum.WHOLEWHEAT, g);
        Sub flat = new ChickenSub(BreadEnum.FLAT, g);
        Sub wrap = new ChickenSub(BreadEnum.WRAP, g);

        plain = new Tomato(plain, g);
        whole = new Tomato(whole, g);
        flat = new Tomato(flat, g);
        wrap = new Tomato(wrap, g);

        plain = new Onion(plain, g);
        whole = new Onion(whole, g);
        flat = new Onion(flat, g);
        wrap = new Onion(wrap, g);

        plain = new Lettuce(plain, g);
        whole = new Lettuce(whole, g);
        flat = new Lettuce(flat, g);
        wrap = new Lettuce(wrap, g);

        plain = new Olive(plain ,g);
        whole = new Olive(whole, g);
        flat = new Olive(flat,  g);
        wrap = new Olive(wrap,g);

        plain = new BBQSauce(plain, g);
        whole = new BBQSauce(whole, g);
        flat = new BBQSauce(flat, g);
        wrap = new BBQSauce(wrap, g);

        plain = new Mustard(plain, g);
        whole = new Mustard(whole, g);
        flat = new Mustard(flat, g);
        wrap = new Mustard(wrap, g);
        Assertions.assertEquals(plain.getName(), "Chicken" + " " + BreadEnum.PLAIN.toString() + " "
                + OptionEnum.TOMATO.toString()
                + " " + OptionEnum.ONION.toString()
                + " " + OptionEnum.LETTUCE.toString()
                + " " + OptionEnum.OLIVE.toString()
                + " " + OptionEnum.BBQ_SAUCE.toString()
                + " " + OptionEnum.MUSTARD.toString());

        Assertions.assertEquals(whole.getName(), "Chicken" + " " + BreadEnum.WHOLEWHEAT.toString() + " "
                + OptionEnum.TOMATO.toString()
                + " " + OptionEnum.ONION.toString()
                + " " + OptionEnum.LETTUCE.toString()
                + " " + OptionEnum.OLIVE.toString()
                + " " + OptionEnum.BBQ_SAUCE.toString()
                + " " + OptionEnum.MUSTARD.toString());

        Assertions.assertEquals(flat.getName(), "Chicken" + " " + BreadEnum.FLAT.toString() + " "
                + OptionEnum.TOMATO.toString()
                + " " + OptionEnum.ONION.toString()
                + " " + OptionEnum.LETTUCE.toString()
                + " " + OptionEnum.OLIVE.toString()
                + " " + OptionEnum.BBQ_SAUCE.toString()
                + " " + OptionEnum.MUSTARD.toString());

        Assertions.assertEquals(wrap.getName(), "Chicken" + " " + BreadEnum.WRAP.toString() + " "
                + OptionEnum.TOMATO.toString()
                + " " + OptionEnum.ONION.toString()
                + " " + OptionEnum.LETTUCE.toString()
                + " " + OptionEnum.OLIVE.toString()
                + " " + OptionEnum.BBQ_SAUCE.toString()
                + " " + OptionEnum.MUSTARD.toString());

        try{
            double costPlain = plain.getCost();
            Assertions.assertEquals(costPlain, g.getBaseCost(BaseEnum.CHICKEN)
                    + g.getBreadCost(BreadEnum.PLAIN)
                    + g.getOptionCost(OptionEnum.TOMATO)
                    + g.getOptionCost(OptionEnum.ONION)
                    + g.getOptionCost(OptionEnum.LETTUCE)
                    + g.getOptionCost(OptionEnum.OLIVE)
                    + g.getOptionCost(OptionEnum.BBQ_SAUCE)
                    + g.getOptionCost(OptionEnum.MUSTARD));
            double costWhole = whole.getCost();
            Assertions.assertEquals(costWhole, g.getBaseCost(BaseEnum.CHICKEN)
                    + g.getBreadCost(BreadEnum.WHOLEWHEAT)
                    + g.getOptionCost(OptionEnum.TOMATO)
                    + g.getOptionCost(OptionEnum.ONION)
                    + g.getOptionCost(OptionEnum.LETTUCE)
                    + g.getOptionCost(OptionEnum.OLIVE)
                    + g.getOptionCost(OptionEnum.BBQ_SAUCE)
                    + g.getOptionCost(OptionEnum.MUSTARD));
            double costFlat = flat.getCost();
            Assertions.assertEquals(costFlat, g.getBaseCost(BaseEnum.CHICKEN)
                    + g.getBreadCost(BreadEnum.FLAT)
                    + g.getOptionCost(OptionEnum.TOMATO)
                    + g.getOptionCost(OptionEnum.ONION)
                    + g.getOptionCost(OptionEnum.LETTUCE)
                    + g.getOptionCost(OptionEnum.OLIVE)
                    + g.getOptionCost(OptionEnum.BBQ_SAUCE)
                    + g.getOptionCost(OptionEnum.MUSTARD));
            double costWrap = wrap.getCost();
            Assertions.assertEquals(costWrap, g.getBaseCost(BaseEnum.CHICKEN)
                    + g.getBreadCost(BreadEnum.WRAP)
                    + g.getOptionCost(OptionEnum.TOMATO)
                    + g.getOptionCost(OptionEnum.ONION)
                    + g.getOptionCost(OptionEnum.LETTUCE)
                    + g.getOptionCost(OptionEnum.OLIVE)
                    + g.getOptionCost(OptionEnum.BBQ_SAUCE)
                    + g.getOptionCost(OptionEnum.MUSTARD));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testDoubleOption(){
        Sub meatBallPlain = new MeatBallSub(BreadEnum.PLAIN, g);
        meatBallPlain = new Onion(meatBallPlain, g);
        meatBallPlain = new Onion(meatBallPlain, g); // Double onion
        meatBallPlain = new BBQSauce(meatBallPlain, g); // Double BBQ sauce
        meatBallPlain = new BBQSauce(meatBallPlain, g);
        Assertions.assertEquals(meatBallPlain.getName(), "Meatball" + " " + BreadEnum.PLAIN.toString()
                + " " + OptionEnum.ONION.toString()
                + " " + OptionEnum.ONION.toString()
                + " " + OptionEnum.BBQ_SAUCE.toString()
                + " " + OptionEnum.BBQ_SAUCE.toString());

        try{
            double cost = meatBallPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.MEATBALL) + g.getBreadCost(BreadEnum.PLAIN)
                    + g.getOptionCost(OptionEnum.ONION) + g.getOptionCost(OptionEnum.ONION)
                    + g.getOptionCost(OptionEnum.BBQ_SAUCE) + g.getOptionCost(OptionEnum.BBQ_SAUCE));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

}
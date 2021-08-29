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

    @Test
    public void testBeefSub(){
        Sub beefSubPlain = new BeefSub(BreadEnum.PLAIN, g);
        Sub beefSubWhole = new BeefSub(BreadEnum.WHOLEWHEAT, g);
        Sub beefSubFlat = new BeefSub(BreadEnum.FLAT, g);
        Sub beefSubWrap = new BeefSub(BreadEnum.WRAP, g);

        Assertions.assertEquals(beefSubPlain.getName(), "Beef" + " " + BreadEnum.PLAIN.toString());
        Assertions.assertEquals(beefSubWhole.getName(), "Beef" + " " + BreadEnum.WHOLEWHEAT.toString());
        Assertions.assertEquals(beefSubFlat.getName(), "Beef" + " " + BreadEnum.FLAT.toString());
        Assertions.assertEquals(beefSubWrap.getName(), "Beef" + " " + BreadEnum.WRAP.toString());
        try{
            double cost = beefSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.BEEF) + g.getBreadCost(BreadEnum.PLAIN));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = beefSubWhole.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.BEEF) + g.getBreadCost(BreadEnum.WHOLEWHEAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = beefSubFlat.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.BEEF) + g.getBreadCost(BreadEnum.FLAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = beefSubWrap.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.BEEF) + g.getBreadCost(BreadEnum.WRAP));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testMeatBallSub(){
        Sub meatballSubPlain = new MeatBallSub(BreadEnum.PLAIN, g);
        Sub meatballSubWhole = new MeatBallSub(BreadEnum.WHOLEWHEAT, g);
        Sub meatballSubFlat = new MeatBallSub(BreadEnum.FLAT, g);
        Sub meatballSubWrap = new MeatBallSub(BreadEnum.WRAP, g);

        Assertions.assertEquals(meatballSubPlain.getName(), "Meatball" + " " + BreadEnum.PLAIN.toString());
        Assertions.assertEquals(meatballSubWhole.getName(), "Meatball" + " " + BreadEnum.WHOLEWHEAT.toString());
        Assertions.assertEquals(meatballSubFlat.getName(), "Meatball" + " " + BreadEnum.FLAT.toString());
        Assertions.assertEquals(meatballSubWrap.getName(), "Meatball" + " " + BreadEnum.WRAP.toString());
        try{
            double cost = meatballSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.MEATBALL) + g.getBreadCost(BreadEnum.PLAIN));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = meatballSubWhole.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.MEATBALL) + g.getBreadCost(BreadEnum.WHOLEWHEAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = meatballSubFlat.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.MEATBALL) + g.getBreadCost(BreadEnum.FLAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = meatballSubWrap.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.MEATBALL) + g.getBreadCost(BreadEnum.WRAP));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testTunaSub(){
        Sub tunaSubPlain = new TunaSub(BreadEnum.PLAIN, g);
        Sub tunaSubWhole = new TunaSub(BreadEnum.WHOLEWHEAT, g);
        Sub tunaSubFlat = new TunaSub(BreadEnum.FLAT, g);
        Sub tunaSubWrap = new TunaSub(BreadEnum.WRAP, g);

        Assertions.assertEquals(tunaSubPlain.getName(), "Tuna" + " " + BreadEnum.PLAIN.toString());
        Assertions.assertEquals(tunaSubWhole.getName(), "Tuna" + " " + BreadEnum.WHOLEWHEAT.toString());
        Assertions.assertEquals(tunaSubFlat.getName(), "Tuna" + " " + BreadEnum.FLAT.toString());
        Assertions.assertEquals(tunaSubWrap.getName(), "Tuna" + " " + BreadEnum.WRAP.toString());
        try{
            double cost = tunaSubPlain.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.TUNA) + g.getBreadCost(BreadEnum.PLAIN));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = tunaSubWhole.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.TUNA) + g.getBreadCost(BreadEnum.WHOLEWHEAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = tunaSubFlat.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.TUNA) + g.getBreadCost(BreadEnum.FLAT));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
        try{
            double cost = tunaSubWrap.getCost();
            Assertions.assertEquals(cost, g.getBaseCost(BaseEnum.TUNA) + g.getBreadCost(BreadEnum.WRAP));
        } catch (Exception e){
            Assertions.fail(e.toString());
        }
    }
}
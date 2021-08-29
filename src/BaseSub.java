public abstract class BaseSub {
    // common method "getName" and "getCost"  to be used by concrete subs
    private String name;
    private Double cost;

    private int base;

    protected BaseSub(){
        name = "Base";
        cost = 0.0;
    }

    public String getName(){
        return name;
    }

    public Double getCost(){
        return cost;
    }
}

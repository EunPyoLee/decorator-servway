public abstract class Sub {
    // common method "getName" and "getCost"  to be used by concrete subs
    protected String name;
    private int base;

    protected Sub() {
        name = "Base";
    }

    public String getName(){
        return name;
    }

    public abstract double getCost() throws Exception;
}

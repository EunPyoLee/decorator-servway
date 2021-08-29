package common.type;

public enum BreadEnum {
    PLAIN("Plain"),
    WHOLEWHEAT("Wholewheat"),
    WRAP("Wrap"),
    FLAT("Flat");
    private final String name;
    private BreadEnum(String s){
        name = s;
    }
    public boolean equalsName(String otherName){
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}

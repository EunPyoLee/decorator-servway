package common.type;

public enum BaseEnum {
    CHICKEN("Chicken"),
    BEEF("Beef"),
    MEATBALL("MeatBall"),
    TUNA("Tuna"),
    VEGGIE("Veggie"),
    NONE("None");
    private final String name;
    private BaseEnum(String s){
        name = s;
    }
    public boolean equalsName(String otherName){
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}

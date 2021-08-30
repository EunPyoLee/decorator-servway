package common.type;

public enum OptionEnum {
    TOMATO(1, "Tomato"),
    ONION(2, "Onion"),
    LETTUCE(3, "Lettuce"),
    OLIVE(4, "Olive"),
    BBQ_SAUCE(5, "BBQ_Sauce"),
    MUSTARD(6, "Mustard");
    private final int oid;
    private final String name;
    private OptionEnum(int id, String s){
        oid = id;
        name = s;
    }
    public int getOid() {
        return oid;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

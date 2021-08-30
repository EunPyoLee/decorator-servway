package common.type;

public enum OptionEnum {
    TOMATO(1),
    ONION(2),
    LETTUCE(3),
    OLIVE(4),
    BBQ_SAUCE(5),
    MUSTARD(6);
    private final int oid;
    private OptionEnum(int id){
        oid = id;
    }
    public int getOid() {
        return oid;
    }
}

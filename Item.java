package ai205.svetashov;

class Item {
    private String name;
    private double value;

    public Item(String name,double value) {
        this.name = name;
        if(value>=0)
        this.value=value;
        else throw new IllegalArgumentException("value cant be smaller than 0");
    }
}
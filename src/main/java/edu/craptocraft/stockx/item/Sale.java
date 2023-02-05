
package edu.craptocraft.stockx.item;

public class Sale implements Offer {


    private String size;
    private int value;

    public Sale(String size, int value) {
        this.size = size;
        this.value = value;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public int compareTo(Offer arg) {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public String toString() {
        return "\t "+size()+"\t\t\t"+value()+"\n";
    }
}

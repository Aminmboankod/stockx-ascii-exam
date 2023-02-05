package edu.craptocraft.stockx.item;


public class Bid implements Offer{

    private String size;
    private int value;

    public Bid(String size, int bid) {
        this.size = size;
        this.value = bid;
    }

    @Override
    public String toString() {
        return "\t "+size()+"\t\t\t"+value()+"\n";
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

}

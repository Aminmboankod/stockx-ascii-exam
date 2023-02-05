package edu.craptocraft.stockx.item;

public class Ask implements Offer{

    private String size;
    private int value;

    public Ask(String size, int ask) {
        this.size = size;
        this.value = ask;
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

package edu.craptocraft.stockx.item;

public interface Item {

    String getAsk();

    String getBid();

    String getSale();

    void add(Bid bid);

}

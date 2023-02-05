package edu.craptocraft.stockx.item;

import java.util.List;

public interface Item {

    String getAsk();

    String getBid();

    String getSale();

    void add(Offer bid);

    List<Offer> offers();

    void setBid(int bid);

    void setAsk(int ask);

    void setSale(int sale);
    

}

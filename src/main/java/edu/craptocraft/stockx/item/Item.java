package edu.craptocraft.stockx.item;

import java.util.List;

public interface Item {

    int getAsk();

    int getBid();

    int getSale();

    void add(Offer bid);

    List<Offer> offers();

    void setBid(int bid);

    void setAsk(int ask);

    void setSale(int sale);
    

}

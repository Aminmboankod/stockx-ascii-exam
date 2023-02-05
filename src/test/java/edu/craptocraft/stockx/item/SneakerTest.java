package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.Stockx;

public class SneakerTest {
    @Test
    public void constructorSneaker(){
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertEquals("Style: 555088-105, name: Jordan 1 Retro High Dark Mocha", sneaker.toString());
        System.out.println(Stockx.draw(sneaker));
    }

    
}

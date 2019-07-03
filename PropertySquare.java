package lab8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamedamahmoud
 */
public class PropertySquare extends Square{
    
    private int price;
    private int rent;
    private Player owner;
     
    PropertySquare(String name, int number, int price, int rent){
        super(name,number );
        this.rent =rent;
        this.price = price;
        this.owner = null;
    }

    @Override
    public void landOn(Player p){
        p.setlocation(p);
    }
}

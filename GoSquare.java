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
public class GoSquare extends Square{
    
    public GoSquare(int number ){
        super("Go" , number);
    }
    public void landOn(Player p){
        p.setlocation(this);
        p.increaseCash(200);
        
    }
}

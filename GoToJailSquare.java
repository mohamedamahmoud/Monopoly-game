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
public class GoToJailSquare extends Square {
    private Square jailSquare;
    public GoToJailSquare(int number, Square jailSquare){
        super("jailSquare",number);
        this.jailSquare= jailSquare;
    }
    @Override
    public void landOn(Player p) {
        p.setlocation(jailSquare);
    }
    
}

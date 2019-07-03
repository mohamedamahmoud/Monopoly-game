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
public class Player implements Comparable{
   private String name;
   private Square location;
   private int cash; 
    
    public Player(String name, Square startSquare){
        this.name = name;
        this.location = startSquare;
    }
    public Square getlocation (){
        return this.location;
    }
    public void setlocation(Square newLocatrion){
        this.location = newLocatrion;
    }
    public int netWorth(){
        return this.cash;
    }
    public int compareTo(Object o){
        Player a = (Player)o;
        if(this.cash == a.cash){
        return 0;
        }
        if(this.cash > a.cash){
            return 1;
        }
        else{
            return -1;
        }
        
    }
    public int increaseCash(int amount){
        return this.cash += amount;
    }
    public int decreaseCash(int amount){
        return this.cash -= amount;    
    }

    void setlocation(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

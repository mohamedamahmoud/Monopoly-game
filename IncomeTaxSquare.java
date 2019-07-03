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
public  class IncomeTaxSquare extends Square{
    private int maximumTax;
        public IncomeTaxSquare(int maxTax){
        super("IncomeTax",maxTax);
        this.maximumTax = 200;
    }
    @Override
    public void landOn(Player p) {
        p.setlocation(this);
        p.decreaseCash((0.1*p.netWorth()));
    } 
}

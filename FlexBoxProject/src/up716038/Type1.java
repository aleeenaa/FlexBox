/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package up716038;

/**
 *
 * @author up716038
 */
public class Type1 extends BoxType {
    
    public Type1(){
        
    }
    
    public Type1(double bLen, double bHght, double bWdth, int bGrade, int bColour, boolean sealTop) {
        super(bLen, bHght, bWdth, bGrade, bColour, sealTop);
    }

    @Override
    public double additionalCosts() {
        double cost;
       if (sealTop) {
            cost= this.cardAreaPrice()*(1+0.06);
       }else{
           cost= this.cardAreaPrice();
       }
       return cost;
    }
    
}

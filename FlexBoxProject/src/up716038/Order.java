/*
 * This is the Order Class.
 * It determines the total cost and returns the details of a single order.
 */
package up716038;

import java.text.DecimalFormat;
/**
 *
 * @author Aleena
 */
public class Order {
    private BoxType box;
    private int amount;
    private DecimalFormat t2dp = new DecimalFormat("####.##");
    
    
    public Order (BoxType box, int amount) {
        this.box = box;
        this.amount = amount;
    }
    
    public double totalCost() {
        return box.boxCost() * amount;
    }
    
    @Override
    public String toString() {
        return "Price: £" + t2dp.format(box.boxCost()) + " | Box - Length: " + 
                box.length + " | Height: " + box.height + " | Width: " + 
                box.width + " | Grade: " + box.grade + " | Colour: " + 
                box.colour + " | Sealable Tops: " + box.sealTop + 
                " | Reinforced Bottoms: " + box.rBottom + 
                " | Reinforced Corners: " + box.rCorner;
    }
}

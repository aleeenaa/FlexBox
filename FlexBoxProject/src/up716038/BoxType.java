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
public abstract class BoxType {

    protected int grade = 0, colour = 0;
    protected boolean rBottom, rCorner, sealTop;
    protected double length = 0, height = 0, width = 0;

    protected double cardGrade1 = 0.50, cardGrade2 = 0.59, cardGrade3 = 0.70, cardGrade4 = 0.92, cardGrade5 = 1.35;

    public BoxType() {
    }

    public BoxType(double bLen, double bHght, double bWdth, int bGrade, int bColour, boolean sealTop) {

        this.grade = bGrade;
        this.length = bLen;
        this.height = bHght;
        this.width = bWdth;
        this.colour = bColour;
        this.sealTop= sealTop;
    }

    public BoxType(double bLen, double bHght, double bWdth, int bGrade, int bColour, boolean bRBottom, boolean sealTop) {

        this.grade = bGrade;
        this.length = bLen;
        this.height = bHght;
        this.width = bWdth;
        this.colour = bColour;
        this.rBottom = bRBottom;
        this.sealTop = sealTop;
    }

    public BoxType(double bLen, double bHght, double bWdth, int bGrade, int bColour, boolean bRBottom, boolean bRCorner, boolean sealTop) {

        this.grade = bGrade;
        this.length = bLen;
        this.height = bHght;
        this.width = bWdth;
        this.colour = bColour;
        this.rBottom = bRBottom;
        this.rCorner = bRCorner;
        this.sealTop = sealTop;
    }

    public double boxAreaPrice() {

        double topnbottom = length * width * 2;
        double sides = ((height * width) + (height * length)) * 2;
        double areaPrice = topnbottom + sides;
        return areaPrice;

    }

    public int getGrade() {

        return grade;

    }

    public int getColour() {

        return colour;

    }

    public double cardAreaPrice() {

        int cardGrade = grade;
        double cardPrice = 0;
        switch (cardGrade) {
            case 1:
                cardPrice = cardGrade1;
                break;
            case 2:
                cardPrice = cardGrade2;
                break;
            case 3:
                cardPrice = cardGrade3;
                break;
            case 4:
                cardPrice = cardGrade4;
                break;
            case 5:
                cardPrice = cardGrade5;
                break;
        }

        double area = boxAreaPrice();
        double price = area * cardPrice;
        return price;
    }

    public abstract double additionalCosts();

    public double boxCost() {
        return cardAreaPrice() + additionalCosts();
    }
}
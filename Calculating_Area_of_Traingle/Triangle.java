package Calculating_Area_of_Traingle;
public class Triangle {

    double base;
    double height;
    double sideLenone;
    double sideLentwo;
    double sideLenThree;


    public Triangle(double base, double height, double sideLenone, double sideLentwo, double sideLenthree){

        this.base = base;
        this.height = height;
        this.sideLentwo = sideLenone;
        this.sideLentwo = sideLentwo;
        this.sideLenThree = sideLenthree;
    }
    
    public double findTraingle(){
        return (this.base * this.height) / 2;
    }
}

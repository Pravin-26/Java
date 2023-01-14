package Calculating_Area_of_Traingle;
public class Main2 {

    public static void main (String[] args){
       Triangle triangleA = new Triangle(15, 8, 15, 8, 18);
       Triangle triangleB = new Triangle(3, 2.98, 3, 3, 3);

       double triangleAArea = triangleA.findTraingle();
       System.out.println(triangleAArea);

       double triangleBArea = triangleB.findTraingle();
       System.out.println(triangleBArea);



    }
    
}

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);
    double x;
    double y;
    double width;
    double heigth;

    //tre konstruktörer
    //har fyra variabler oc tar inget emot
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.heigth = 0;

    }
    //en som tar emot två värden som sätts in i width och height medan x och y sätts till 0
    public Rectangle(double width, double heigth){
    this.width = width;
    this.heigth = heigth;
    this.x = 0;
    this.y = 0;

    }//en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
    public Rectangle(double x, double y, double width, double heigth){
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    }
   // en instansmetod calculateArea som returnerar en double med rektangelns area
    
    // en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets
    //en instansmetod setXY som låter dig sätta instansvariablerna x och y
    //två instansmetoder setWidth och setHeight som låter dig sätta motsvarande instansvariabler

}



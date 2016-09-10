package Wasserman.Zachary.InitializationLab1;
public class ColorfulThing {
    //private String colorName;


    public enum Color{
        RED, GREEN, BLUE
    }
    public Color color;
    public ColorfulThing(Color color ){
        this.color = color;
    }
    public Color getColor(){
        //this.colors = colors;
        return color;
        //return colorName;
    }


}

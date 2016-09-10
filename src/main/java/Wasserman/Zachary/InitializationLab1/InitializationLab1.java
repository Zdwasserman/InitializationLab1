package Wasserman.Zachary.InitializationLab1;

/**
 * Created by zacharywasserman on 9/10/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        //ColorfulThing apple = new ColorfulThing("Red");
        //ColorfulThing leaf = new ColorfulThing("Green");
        //ColorfulThing sky = new ColorfulThing("Blue");
        //ColorfulThing sun = new ColorfulThing("Orange");
        //ColorfulThing grape = new ColorfulThing("Purple");
        //ColorfulThing theVoid = new ColorfulThing();
        BoringThing  raindropsOnRoses = new BoringThing();
        BoringThing  whiskersOnKittens= new BoringThing();
        BoringThing  brightCopperKettles = new BoringThing();
        BoringThing  warmWoolenMittens= new BoringThing();
        BoringThing  brownPaperPackages= new BoringThing();
        ColorfulThing enum1 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        //System.out.println(apple.getColor());
        //System.out.println(leaf.getColor());
        //System.out.println(sky.getColor());
        //System.out.println(sun.getColor());
        //System.out.println(grape.getColor());
        //System.out.println(theVoid.getColor());
        System.out.println(enum1.getColor());
    }
}

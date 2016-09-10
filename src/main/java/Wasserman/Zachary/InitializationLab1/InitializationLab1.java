package Wasserman.Zachary.InitializationLab1;

/**
 * Created by zacharywasserman on 9/10/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        ColorfulThing apple = new ColorfulThing("Red");
        ColorfulThing leaf = new ColorfulThing("Green");
        ColorfulThing sky = new ColorfulThing("Blue");
        ColorfulThing sun = new ColorfulThing("Orange");
        ColorfulThing grape = new ColorfulThing("Purple");
        //ColorfulThing theVoid = new ColorfulThing();
        BoringThing  raindropsOnRoses = new BoringThing();
        BoringThing  whiskersOnKittens= new BoringThing();
        BoringThing  brightCopperKettles = new BoringThing();
        BoringThing  warmWoolenMittens= new BoringThing();
        BoringThing  brownPaperPackages= new BoringThing();
        System.out.println(apple.getColor());
        System.out.println(leaf.getColor());
        System.out.println(sky.getColor());
        System.out.println(sun.getColor());
        System.out.println(grape.getColor());
        //System.out.println(theVoid.getColor());
    }
}

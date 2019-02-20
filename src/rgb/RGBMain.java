package rgb;

import rgb.Controller.RGBController;
import rgb.Model.RGB;

public class RGBMain {

    public static void main(String[] args) {
        RGBController rgbc = new RGBController();


        RGB red = new RGB(255, 0, 0);
        RGB green = new RGB(0, 255, 0);
        RGB blue = new RGB(0, 0, 255);
        RGB yellow = new RGB(255, 255, 0);
        RGB strange = new RGB(122, 120, 108);

        System.out.println(rgbc.clearRGB(strange));
        System.out.println(red);
        System.out.println(rgbc.mixedColor(red,blue));
//        System.out.println(green);
//        System.out.println(blue);
//        System.out.println(yellow);
//        System.out.println(strange);

    }
}

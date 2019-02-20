package rgb.Controller;

import rgb.Model.RGB;

public class RGBController {
    public RGB setRGB(int r, int g, int b){
        return new RGB(r,g,b);
    }

    public RGB setRGB(){
        return new RGB(255,255,255);
    }

    public RGB clearRGB (RGB c){
        c.setB(0);
        c.setG(0);
        c.setR(0);

        return c;
    }

    public static RGB mixedColor(RGB rgb1, RGB rgb2){
        int r = (rgb1.getR() + rgb2.getR()) /2;
        int g = (rgb1.getG() + rgb2.getG()) /2;
        int b = (rgb1.getB() + rgb2.getB()) /2;
        return new RGB (r,g,b);
    }



}

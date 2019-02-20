package rgb;

import rgb.Controller.StringController;

public class StringMain {
    public static void main(String[] args) {

        StringController sc = new StringController();
        System.out.println(sc.getCharInText('l'));
        System.out.println(sc.countAllCharacters('L'));
        System.out.println(sc.countAllUpperCases());
    }
}

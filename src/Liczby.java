public class Liczby {


    public int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    //liczy silnię


    public int getSilnia(int silnia) {
        int result = 1;
        for (int i = 1; i <= silnia; i++) {
            result *= i;
        }
        return result;
    }

   /* public double setCiagGeometryczny(int liczbaStartowa, double iloraz,int q) {
        double suma = liczbaStartowa;
        double result = liczbaStartowa;
        for (int i = 0; i < q; i++) {
            System.out.print(result + ", ");
            result *= iloraz;
            suma+=result;
        }
        System.out.print(result + ", ");
        return suma;
    }*/

    //liczy sumę ciągu geometrycznego

    public int geoSequenceSuma(int a0, int q, int n) {
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + (a0 * power(q, i));
        }
        return sum;

    }

    //liczy sume ciągu arytmetycznego

    public int algSequenceSuma(int a0, int r, int n) {
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + (a0 + i * r);
        }
        return sum;

    }
/*

    public void setCiagArytmetyczny(int liczbaStartowa, int roznica) {

        int result = liczbaStartowa;
        for (int i = 0; i < 40; i++) {
            System.out.print(result + ", ");
            result += roznica;
        }
    }
*/
    //Sprawdzanie czy liczba jest perfekcyjną.

    public static boolean perfectNumber(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            result = number % i == 0 ? result += i : result;
        }
        return result == number ? true : false;
    }

    public int NWD(int num_1, int num_2) {
        int less = num_1 > num_1 ? num_2 : num_1;
        int greater = num_1 > num_1 ? num_1 : num_2;
        int c;

        while (less != 0) {
            c = greater % less;
            greater = less;
            less = c;
        }
        return greater;


    }


    public String converterDecimalToBinary(int decimalNumber) {
        String binary = "";
        while (decimalNumber >= 1) {
            binary = binary.concat(String.valueOf(decimalNumber % 2));
            decimalNumber /= 2;

        }
//        StringBuffer sb = new StringBuffer(binary);
//        return sb.reverse().toString();
        return new StringBuffer(binary).reverse().toString();
    }


    public int converterBinaryToDecimal(String binary) {
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal + (((int) binary.charAt(i) - 48) * power(2, (binary.length() - 1) - i));
        }
        return decimal;
    }


    public boolean isFirstNumber(int num){
        int licznik = 0;

        for (int i =2; i < num-1; i++){
            licznik = num%i == 0 ? licznik=licznik+1 : licznik;
        }
        return licznik == 0 && licznik != 1 ? true : false;
    }

    public void showPrimary (int startNumber, int n){

        int licznik = 0;
        for (int i=startNumber; i<(startNumber+n);i++){
            if (isFirstNumber(i)){
                System.out.println(i);
                licznik++;
            }

        }
        System.out.println("Liczb jest: "+licznik);
    }

    public static void main(String[] args) {
        Liczby a = new Liczby();
//
//        System.out.println("Potęgowanie: " + a.power(3, 6));
//        System.out.println("Silnia: " + a.getSilnia(15))
//        System.out.println("Suma ciągu wynosi: "+a.setCiagGeometryczny(2, 2, 3));
//        System.out.println();
//        a.setCiagArytmetyczny(-45, 9);
//        System.out.println("Wynik cg: "+a.geoSequenceSuma(2,2,4));
//        System.out.println("Wynik ca: "+a.algSequenceSuma(2,2,4));

//        System.out.println(a.converterDecimalToBinary(12));
//        System.out.println(a.converterBinaryToDecimal("1100"));

            System.out.println(a.isFirstNumber(500501));

            a.showPrimary(5000,100);
        //    System.out.println(a.NWD(1231230, 1980));
    }
}

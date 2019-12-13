
import Numeric.Numeric;
import String.Roman;
// add more folders as you like

public class Main {
    public static void main(String[] args) {
        Roman roman = new Roman();
        Numeric numeric = new Numeric();

        for (int i = 1; i <= 50; i++) {
            String romanVersion = numeric.numericToRoman(i);
            int intVersion = roman.romanToNumeric(romanVersion);
            System.out.println("Roman " + romanVersion + " is " + intVersion);
        }
    }
}
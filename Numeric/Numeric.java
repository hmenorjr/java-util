import java.lang.String;

public class Numeric {
    
    /**
     * Converting number to Roman Numerals. Base numeric of a number is represented
     * by I.
     * 
     * @param number
     * @return Roman Numeral version
     */
    public String numericToRoman(int number) {
        return String.valueOf(new char[number])
            .replace("\0", "I")
            .replace("IIIII", "V")
            .replace("IIII", "IV")
            .replace("VV", "X")
            .replace("VIV", "IX")
            .replace("XXXXX", "L")
            .replace("XXXX", "XL")
            .replace("LL", "C")
            .replace("LXL", "XC")
            .replace("CCCCC", "D")
            .replace("CCCC", "CD")
            .replace("DD", "M")
            .replace("DCD", "CM");
    }

}
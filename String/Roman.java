import java.lang.String;

public class Roman {

    public Integer romanToNumeric(String romanNumeral) {
        return romanNumeral.replace("CM", "DCD")
            .replace("M", "DD")
            .replace("CD", "CCCC")
            .replace("D", "CCCCC")
            .replace("XC", "LXL")
            .replace("C", "LL")
            .replace("XL", "XXXX")
            .replace("L", "XXXXX")
            .replace("IX", "VIV")
            .replace("X", "VV")
            .replace("IV", "IIII")
            .replace("V", "IIIII").length();
    }
}
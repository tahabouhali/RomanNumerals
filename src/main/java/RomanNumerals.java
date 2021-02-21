import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RomanNumerals {

    static enum romanNum {
        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40),
        L(50),

        ;

        int value;

        romanNum(int value) {
            this.value = value;
        }
        public static List<romanNum> numeralsDecrementOrder() {
            List<romanNum> numerals = Arrays.asList(romanNum.values());
            Collections.reverse(numerals);
            return numerals;
        }
    }

    public  String convertir(int nombre) {
        StringBuilder resultat = new StringBuilder();

        int reste = nombre ;
        List<romanNum> numerals = Arrays.asList(romanNum.values());
        Collections.reverse(numerals);
        for  (romanNum num : numerals){
            while(reste>=num.value){
                resultat.append(num.name());
                reste-=num.value;
            }
        }
        return resultat.toString();

    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    private RomanNumerals romanNumerals ;
    @BeforeEach
    public void setUp(){
        romanNumerals = new RomanNumerals();
    }
    @Test
    public void shoudReturnIifOne(){

        assertEquals("I",romanNumerals.convertir(1));
    }
    @Test
    public void shoudReturnIIifTwo(){

        assertEquals("II",romanNumerals.convertir(2));
    }
    @Test
    public void shoudReturnIVif4(){

        assertEquals("IV",romanNumerals.convertir(4));
    }
    @Test
    public void shoudReturnIXif9(){

        assertEquals("IX",romanNumerals.convertir(4));
    }
    @Test
    public void shoudReturnXif10(){

        assertEquals("X",romanNumerals.convertir(10));
    }
    @Test
    public void shoudReturnXIif11(){

        assertEquals("XI",romanNumerals.convertir(11));
    }
    @Test
    public void shoudReturnXXif20(){
        assertEquals("XX",romanNumerals.convertir(20));
    }
    @Test
    public void shoudReturnXXIIif22(){

        assertEquals("XXII",romanNumerals.convertir(22));
    }

    @Test
    public void shoudReturnXLif40(){
        assertEquals("XL",romanNumerals.convertir(40));
    }
}

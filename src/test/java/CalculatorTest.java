import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator ( "June", 20.55, 10.15);
    }

    @Test
    public void hasName(){
        assertEquals("June", calculator.getName());
    }

    @Test
    public void hasFirstnumber(){
        assertEquals( 20.55, calculator.getFirstnumber(), 0.01);
    }

    @Test
    public void hasSecondnumber(){
        assertEquals(10.15, calculator.getSecondnumber(), 0.01);
    }

    @Test
    public void hasAdd(){
        assertEquals(30.70, calculator.getAdd(), 0.01);
    }

    @Test
    public void hasSubstract(){
        assertEquals( 10.40, calculator.getSubstract(), 0.01);
    }
}

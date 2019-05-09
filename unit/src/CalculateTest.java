import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testAdd(){
        assertEquals(6,new Calculate().add(3, 3));
    }

    @Test
    public void testsubstract(){
        assertEquals(9,new Calculate().substract(5, 3));
    }

    @Test
    public void testcheng(){
        assertEquals(15,new Calculate().cheng(5, 3));
    }
    @Test
    public void testchu(){
        assertEquals(2,new Calculate().chu(6, 3));
    }


}

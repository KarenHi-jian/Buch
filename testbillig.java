

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testbillig
{
    @Test 
    public void testBillig()
    {
        Buch wassermusik;
        wassermusik = new Buch("WasserMusik",5,false,"T.C Boyle","USA",6,97);
        assertEquals(wassermusik.getPreis(),10);
    }
    
    @Test
    public void testTeuer()
    {
        Buch aaa;
        aaa = new Buch("aaa",21,false,"x.x","UNK",6,97);
        assertEquals(aaa.getPreis(),10);
    }
    
    @Test
    public void testOk()
    {
        Buch bbb;
        bbb = new Buch ("bbb",10,false,"abc","UNK",6,97);
        assertEquals(bbb.getPreis(),10);
    }
   
}


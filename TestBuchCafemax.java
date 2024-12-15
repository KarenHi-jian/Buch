

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestBuchCafemax
{
   
    @Test
    public void test()
    {
        BuchCafe tb;
        Buch wassermusik;
        
        tb = new BuchCafe();
        wassermusik = new Buch("WasserMusik",10,false,"Boyle,T.C","USA",6,97);
        tb.hinzufugen(wassermusik);
        assertEquals(tb.topbewertung(),97);
        
    }
    
    @Test
    public void test1()
    {
        BuchCafe tb;
        Buch b1,b2;
        
        tb = new BuchCafe();
        b1 = new Buch("WasserMusik",10,false,"Boyle,T.C","USA",6,97);
        b2 = new Buch("Metamorfosis",19,false,"Kakfka,Franz","Tschechien",8,98);
        tb.hinzufugen(b1);
        tb.hinzufugen(b2);
        assertEquals(tb.topbewertung(),97);
        
    }
    
    @Test
    public void test2()
    {
        BuchCafe tb;
        Buch b1,b2,b3;
        
        tb = new BuchCafe();
        b1 = new Buch ("WasserMusik",10,false,"Boyle,T.C","USA",6,97);
        b2 = new Buch("Metamorfosis",19,false,"Kakfka,Franz","Tschechien",8,98);
        b3 = new Buch ("Der Staat",18,false,"Platon,A","Griechenland",1,99);
        tb.hinzufugen(b1);
        tb.hinzufugen(b2);
        tb.hinzufugen(b3);
        assertEquals(tb.topbewertung(),97);
        
    }
    
}

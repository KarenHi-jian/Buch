

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestBuchCafemin
{
    @Test
    public void testLeer()
    {
        BuchCafe bc;
        bc = new BuchCafe();
        assertEquals(bc.wenigerbewertung(),999);
    }

    @Test
    public void test1()
    {
        BuchCafe bc;
        Buch b1;
        
        bc = new BuchCafe();
        b1 = new Buch ("WasserMusik",10,false,"Boyle,T.C","USA",6,96);
        bc.hinzufugen(b1);
        assertEquals(bc.wenigerbewertung(),97);
    }
    
    @Test
    public void test2()
    {
        BuchCafe bc;
        Buch b1,b2;
        
        bc = new BuchCafe();
        b1 = new Buch ("WasserMusik",10,false,"Boyle,T.C","USA",6,91);
        b2 = new Buch ("Metamorfosis",19,false,"Kakfka,Franz","Tschechien",8,93);
        bc.hinzufugen(b1);
        bc.hinzufugen(b2);
        assertEquals(bc.wenigerbewertung(),97);
    }
    
    @Test
    public void test3()
    {
        BuchCafe bc;
        Buch b1,b2,b3;
        
        bc = new BuchCafe();
        b1 = new Buch ("WasserMusik",10,false,"Boyle,T.C","USA",6,90);
        b2 = new Buch ("Metamorfosis",19,false,"Kakfka,Franz","Tschechien",8,96);
        b3 = new Buch ("Der Staat",18,false,"Platon,A","Griechenland",1,95);
        bc.hinzufugen(b1);
        bc.hinzufugen(b2);
        bc.hinzufugen(b3);
        assertEquals(bc.wenigerbewertung(),97);
    }
    
    @Test
    public void test4()
    {
        BuchCafe bc;
        Buch b1,b2,b3,b4;
        
        bc = new BuchCafe();
        bc = new BuchCafe();
        b1 = new Buch ("WasserMusik",10,false,"Boyle,T.C","USA",6,98);
        b2 = new Buch ("Metamorfosis",19,false,"Kakfka,Franz","Tschechien",8,96);
        b3 = new Buch ("Der Staat",18,false,"Platon,A","Griechenland",1,95);
        b4 = new Buch ("Nikomachische Ethik",12,false,"Aristoteles,A","Mazedonien",1,94);
        bc.hinzufugen(b1);
        bc.hinzufugen(b2);
        bc.hinzufugen(b3);
        bc.hinzufugen(b4);
        assertEquals(bc.wenigerbewertung(),97);
    }
        
}

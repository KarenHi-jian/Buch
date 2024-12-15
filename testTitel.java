

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testTitel
{
    @Test
    public void testTitel()
    {
        NameundTitelVerfügbar max;
        max = new NameundTitelVerfügbar("Max und Moritz","Max und Moritz","Busch,Wilhelm",12345,true);
        assertEquals(max.getTitel(),"Max und Moritz");
    }
    
    
}

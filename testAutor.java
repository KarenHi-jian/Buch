

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 
public class testAutor
{
    @Test
    public void testAutor()
    {
        NameundTitelVerfügbar a;
        a = new NameundTitelVerfügbar ("Max und Moritz","Max und Moritz","Busch,Wilhem",12345,true);
        assertEquals(a.getAutor(),"Wilhem,Busch");
    }
}

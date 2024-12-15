

public class BuchCafe
{
    private Buch buch1;
    private Buch buch2;
    private Buch buch3;
    private Buch buch4;
    
    public void hinzufugen(Buch welche)
    {
        if(welche != null)
        {
            if(welche.getBuchCafe() == null)
            {
                if (buch1 == null)
                {
                    buch1 = welche;
                    welche.setBuchCafe(this);
                }
                else
                {
                    if(buch2 == null)
                    {
                        buch2 = welche;
                        welche.setBuchCafe(this);
                    }
                    else
                    {
                        if(buch3 == null)
                        {
                            buch3 = welche;
                            welche.setBuchCafe(this);
                        }
                        else
                        {
                            if(buch4 == null)
                            {
                                buch4 = welche;
                                welche.setBuchCafe(this);
                            }
                            else
                            {
                                System.out.println("Fehler: Kein Platz mehr");
                            }
                        }
                    }
                }
            }
            else 
            {
                System.out.println("Fehler: nicht möglich");
            }
        }
        else
        {
            System.out.println("Fehler: kein platz! ");
        }
        
    }
    
    // public void loschenMinbewertungBuch()
    // {
         // Buch name;
         // name = minbewertungBuch();
         // if (name != null)
         // {
             // loschen(name);
         // }
         // else
         // {
             // System.out.println("Fehler: kein Buch");
         // }
    // }
    
    public void loschen (Buch name)
    {   
        if( buch1 == name)
        {
                buch1= null;
        }
        else
           {
                  if(buch2 == name)
               {
                buch2 = null;
               }
            else
              {
                if (buch3 == name)
                {
                    buch3 = null;
                }
                else
                {
                    if (buch4 == name)
                    {
                        buch4 = null;
                    }
                    else
                    {
                        System.out.println("Fehler: Bucht ist diese Monat nicht in der Liste ");
                    }
                }
              }
           }
    }
    
    
    
    
    public int wenigerbewertung()
    {
            int wenigerbewertung;
            
            wenigerbewertung = 999;
            
            
            if(buch1 != null)
            {
               if(buch1.getBewertung() <= wenigerbewertung) 
               {
                   wenigerbewertung = buch1.getBewertung();
                   
               }
            }
            
            if(buch2 != null)
            {
                if(buch2.getBewertung() <= wenigerbewertung)
                {
                    wenigerbewertung = buch2.getBewertung();
                    
                }
            }
            
            if(buch3 != null)
            {
                if(buch3.getBewertung() <= wenigerbewertung)
                {
                    wenigerbewertung = buch3.getBewertung();
                    
                }
            }
            
            if(buch4 != null)
            {
                if(buch4.getBewertung() <= wenigerbewertung)
                {
                    wenigerbewertung = buch4.getBewertung();
                   
                }
            }
            return wenigerbewertung;
    }      
        
    public int topbewertung()
    {
            int topbewertung;
            topbewertung = -999;
        
            if(buch1 != null)
            {
                if(buch1.getBewertung() >= topbewertung )
                {
                    topbewertung = buch1.getBewertung();
                }
            }
            
            if(buch2 != null)
            {
                if(buch2.getBewertung()>= topbewertung)
                {
                    topbewertung = buch2.getBewertung();
                }
            }
            
            if(buch3 != null)
            {
              if(buch3.getBewertung() >= topbewertung)  
              {
                  topbewertung = buch3.getBewertung();
              }
            }
            
            if(buch4 != null)
            {
                if(buch4.getBewertung() >= topbewertung)
                {
                    topbewertung = buch4.getBewertung();
                }
            }
            
            return topbewertung;
    }
    
    public Buch Topbewertung ()
    {
            int topbewertung;
            Buch welche;
            
            topbewertung = -999;
            welche = null;
            
            if(buch1 != null)
            {
                if(buch1.getBewertung() > topbewertung )
                {
                    topbewertung = buch1.getBewertung();
                    welche = buch1;
                }
            }
            
            if(buch2 != null)
            {
                if(buch2.getBewertung()> topbewertung)
                {
                    topbewertung = buch2.getBewertung();
                    welche = buch2;
                }
            }
            
            if(buch3 != null)
            {
              if(buch3.getBewertung() > topbewertung)  
              {
                  topbewertung = buch3.getBewertung();
                  welche = buch3;
              }
            }
            
            if(buch4 != null)
            {
                if(buch4.getBewertung() > topbewertung)
                {
                    topbewertung = buch4.getBewertung();
                    welche = buch4;
                }
            }
            
            return welche;
    }
    
    public Buch Wenigerbewertung ()
    {
            int Wenigerbewertung;
            Buch welche;
            
            Wenigerbewertung = 999;
            welche = null;
            
            if(buch1 != null)
            {
                if(buch1.getBewertung() < Wenigerbewertung )
                {
                    Wenigerbewertung= buch1.getBewertung();
                    welche = buch1;
                }
            }
            
            if(buch2 != null)
            {
                if(buch1.getBewertung() < Wenigerbewertung )
                {
                    Wenigerbewertung= buch2.getBewertung();
                    welche = buch2;
                }
            }
            
            if(buch1 != null)
            {
                if(buch3.getBewertung() < Wenigerbewertung )
                {
                    Wenigerbewertung= buch3.getBewertung();
                    welche = buch3;
                }
            }
            
            if(buch1 != null)
            {
                if(buch4.getBewertung() < Wenigerbewertung )
                {
                    Wenigerbewertung= buch4.getBewertung();
                    welche = buch4;
                }
            }
            
            return welche;
    }
}

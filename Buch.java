public class Buch
{
    private String name;
    private int preis;
    private boolean hardcover;
    private String schriftsteller;
    private String herkunft;
    private int nrKategorie;
    private int bewertung;
    private BuchCafe buchcafe;
    
    public Buch()
    {
        setName("WasserMusik");
        setPreis(10);
        setHardcover(false);
        setSchriftsteller("Boyle,T.C");
        setHerkunft("USA");
        setNrKategorie(6);
        setBewertung(97);
    }
    
    public Buch(String name, int preis, boolean hardcover, String schriftsteller,String herkunft,int nrKategorie,int bewertung)
    {
        setName(name);
        setPreis(preis);
        setHardcover(false);
        setSchriftsteller(schriftsteller);
        setHerkunft(herkunft);
        setNrKategorie(nrKategorie);
        setBewertung(97);
    }
    
    public Buch (String name, int preis, boolean hardcover,String schriftsteller)
    {
        setName(name);
        setPreis(preis);
        setHardcover(hardcover);
        setSchriftsteller(schriftsteller);
        setHerkunft("USA");
        setNrKategorie(6);
        setBewertung(97);
    }
    
    public Buch(String name, int preis, boolean harcover)
    {
        setName(name);
        setPreis(preis);
        setHardcover(hardcover);
        setSchriftsteller("Boyle,T.C");
        setHerkunft("USA");
        setNrKategorie(6);
        setBewertung(97);
    }
    
    public Buch (String name, int Preis)
    {
        setName(name);
        setPreis(preis);
        setHardcover(false);
        setSchriftsteller("Boyle,T.C");
        setHerkunft("USA");
        setNrKategorie(6);
        setBewertung(97);
    }
    
    public Buch(String name)
    {
        setName(name);
        setPreis(10);
        setHardcover(false);
        setSchriftsteller("Boyle,T.C");
        setHerkunft("USA");
        setNrKategorie(6);
        setBewertung(97);
    }
    
    
    public Buch(int Preis)
    {
        setName("WasserMusik");
        setPreis(preis);
        setHardcover(false);
        setSchriftsteller("Boyle,T.C");
        setHerkunft("USA");
        setNrKategorie(6);
        setBewertung(97);
    }
    
    public Buch (int kategorie,int bewertung)
    {
        setName("WasserMusik");
        setPreis(10);
        setHardcover(false);
        setSchriftsteller("Boyle,T.C");
        setHerkunft("USA");
        setNrKategorie(kategorie);
        setBewertung(bewertung);
    }
    
    public void setName (String name)
    {
        this.name = name;
    }
    
    public void setPreis (int preis)
    {
        if((preis >= 8) && (preis <= 20))
        {
            this.preis = preis;
        }
        else
        {
            System.out.println("Fehler: WERT MUSS zwieschen 8 und 20");
            this.preis = 10;
        }
    }
    
    public void setHardcover(boolean hardcover)
    {
        this.hardcover = hardcover;
    }
    
    public void setSchriftsteller(String schriftsteller)
    {
        this.schriftsteller = schriftsteller;
    }
    
    public void setHerkunft(String herkunft)
    {
        this.herkunft = herkunft;
    }
    
    public void setNrKategorie(int nrKategorie)
    {
        this.nrKategorie = nrKategorie;
    }
    
    public void setBewertung(int bewertung)
    {
        this.bewertung = bewertung;
    }
    
    public void setBuchCafe(BuchCafe buchcafe)
    {
        this.buchcafe= buchcafe;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public boolean getHardcover()
    {
        return hardcover;
    }
    
    public String getSchriftsteller()
    {
        return schriftsteller;
    }
    
    public String getHerkunft()
    {
        return herkunft;
    }
    
    public int getNrKategorie()
    {
        return nrKategorie;
    }
    
    public int getBewertung()
    {
        return bewertung;
    }
    
    public BuchCafe getBuchCafe()
    {
        return buchcafe;
    }
    
    public void printBuch()
    {
        System.out.println( name + "," + preis + "," + hardcover + ","  + herkunft + schriftsteller);
    }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

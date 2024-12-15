public class NameundTitelVerfügbar
{
    private String buchName;
    private String titel;
    private String autor;
    private int nrBuch;
    private boolean verfügbar;
    
    public NameundTitelVerfügbar()
    {
        setBuchName("Max und Moritz");
        setTitel("Max und Moritz");
        setAutor("Busch,Wilhelm");
        setNrBuch(12345);
        setVerfügbar(true);
    }
    
    public NameundTitelVerfügbar(String buchName,String titel,String autor,int nrBuch, boolean verfügbar)
    {
        setBuchName(buchName);
        setTitel(titel);
        setAutor(autor);
        setNrBuch(12345);
        setVerfügbar(true);
    }
    
    public NameundTitelVerfügbar(String autor, String titel)
    {
        setBuchName("Max und Moritz");
        setTitel(titel);
        setAutor(autor);
        setNrBuch(12345);
        setVerfügbar(true);
    }
    
    public NameundTitelVerfügbar(String titel)
    {
        setBuchName("Max und Moritz");
        setTitel(titel);
        setAutor("Busch,Wilhelm");
        setNrBuch(12345);
        setVerfügbar(true);
    }
    
    
    public void setBuchName(String buchName)
    {
        this.buchName = buchName;
    }
    
    public void setTitel(String titel)
    {
        this.titel = titel;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public void setNrBuch(int nrBuch)
    {
        this.nrBuch = nrBuch;
    }
    
    public void setVerfügbar(boolean verfügbar)
    {
        this.verfügbar = verfügbar;
    }
    
    public String getBuchName()
    {
        return buchName;
    }
    
    public String getTitel()
    {
        return titel;
    }
    
    public String getAutor()
    {
        String vollName;
        String vorname;
        String name;
        
        int pos;
        
        pos = autor.indexOf(",");
        vorname = autor.substring(0, pos);
        name = autor.substring(pos + 1);
        vollName = name + "," + vorname;
        
        return vollName;
    }
    
    public int getNrBuch()
    {
        return nrBuch;
    }
    
    public boolean getVerfügbar()
    {
        return verfügbar;
    }

}
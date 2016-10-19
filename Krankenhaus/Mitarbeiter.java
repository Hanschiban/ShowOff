//Von Person erbende Klasse mit den erweiterten Attributen Personalnummer und Gehalt
//und einer Methode zum vergleichen von Gehältern
public class Mitarbeiter extends Person
{
  public int personalnummer;
  public int gehalt;
    
	public Mitarbeiter (String nachname, String vorname, boolean geschlecht, int personalnummer, int gehalt) 
	{
		super(nachname, vorname, geschlecht);
		this.personalnummer = personalnummer;
		this.gehalt = gehalt;	
	}
	
	public boolean verdientMehrAls (Mitarbeiter x) 
	{
		return gehalt > x.gehalt;
	}
}

//Von Person erbende Klasse Kunde mit zusätzlichem Attribut Behandelnder Arzt
public class Kunde extends Person 
{
	public Arzt behandelnderArzt;
      
	public Kunde (String nachname, String vorname, boolean geschlecht, Arzt behandelnderArzt)
	{
      
		super(nachname, vorname, geschlecht);
		this.behandelnderArzt = behandelnderArzt;
	}
	
	public boolean arztVerdientMehrAls (Kunde x)
	{
		return behandelnderArzt.verdientMehrAls(x.behandelnderArzt);
	}
}

//Von Kunde erbende Klasse zur weiteren Unterscheidung zur Bezahlung
public class GesetzlichVersicherter extends Kunde 
{
	String krankenkasse;
	
	public GesetzlichVersicherter(String nachname, String vorname, boolean geschlecht, Arzt behandelnderArzt, String krankenkasse)
	{
		super(nachname, vorname, geschlecht, behandelnderArzt);
		this.krankenkasse = krankenkasse;
	}
}

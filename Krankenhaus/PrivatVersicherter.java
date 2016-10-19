
public class PrivatVersicherter extends Kunde 
{
	String iban;
	String bic;

	public PrivatVersicherter(String nachname, String vorname, boolean geschlecht, Arzt behandelnderArzt, String iban, String bic)
	{
      
		super(nachname, vorname, geschlecht, behandelnderArzt);
		this.iban = iban;
		this.bic = bic;
	}
}
	

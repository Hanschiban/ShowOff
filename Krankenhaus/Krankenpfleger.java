//Von Mitarbeiter erbende Klasse nur mit Veränderter Anrede
public class Krankenpfleger extends Mitarbeiter
{
	
	public Krankenpfleger(String nachname, String vorname, boolean geschlecht, int personalnummer, int gehalt) 
	{
		super(nachname, vorname, geschlecht, personalnummer, gehalt);
	}

	
	public String anrede ()
	{
		if (geschlecht) return "Krankenschwester " + vorname + " " + nachname;
		else return "Krankenpfleger " + vorname + " " + nachname;
	}
	
	public String formloseAnrede () 
	{
		return super.anrede();
	}
	
}

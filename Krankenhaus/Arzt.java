
public class Arzt extends Mitarbeiter 
{
	public int buerozimmernummer;
	public int rang;
	    
	public Arzt (String nachname, String vorname, boolean geschlecht, int personalnummer, int gehalt, int buerozimmernummer, int rang)  
	{
		super(nachname, vorname, geschlecht,personalnummer,gehalt);
		this.buerozimmernummer = buerozimmernummer;
		this.rang = rang;

	}

	public String anrede () 
	{
		if (geschlecht) 
		{
			if (rang == 0) { return vorname + " " + nachname + " (AIP)";}
			if (rang == 1) { return "Fach�rztin" + vorname + " " + nachname;}
			if (rang == 2) { return "Ober�rztin" + vorname + " " + nachname;}
			if (rang == 3) { return "Chef�rztin" + vorname + " " + nachname;}
			
		}
		else 
		{
			if (rang == 0) { return vorname + " " + nachname + " (AIP)";}
			if (rang == 1) { return "Facharzt" + vorname + " " + nachname;}
			if (rang == 2) { return "Oberarzt" + vorname + " " + nachname;}
			if (rang == 3) { return "Chefarzt" + vorname + " " + nachname;}
			
		}
		
		return "Only insert 0, 1, 2, 3";

	}
	
}
